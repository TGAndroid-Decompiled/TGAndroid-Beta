package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
public final class o6 implements Runnable {
    public final byte a = 1;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public o6(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.c = intent;
        this.d = context;
        this.b = z;
        this.e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        int i;
        Executor executor = null;
        switch (this.a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.e;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    d dVar = (d) this.c;
                    if (dVar != null) {
                        dVar.onTransitionAnimationStart(false, false);
                    }
                    ((d) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.g0(true, true, this.b);
                    return;
                }
                return;
            default:
                Intent intent2 = (Intent) this.c;
                Context context = (Context) this.d;
                boolean z = this.b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.e;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    if (parcelableExtra instanceof Intent) {
                        intent = (Intent) parcelableExtra;
                    } else {
                        intent = null;
                    }
                    if (intent != null) {
                        i = FirebaseInstanceIdReceiver.a(intent);
                    } else {
                        int i2 = 500;
                        if (intent2.getExtras() != null) {
                            aj2 aj2Var = new aj2(intent2);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                if (softReference != null) {
                                    executor = (Executor) softReference.get();
                                }
                                if (executor == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new kn7("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    FirebaseInstanceIdReceiver.b = new SoftReference(executor);
                                }
                            }
                            executor.execute(new ey1(context, aj2Var, countDownLatch, false, (byte) 9));
                            try {
                                i2 = ((Integer) Tasks.await(new lv6(context).F(intent2))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        i = i2;
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                    if (pendingResult != null) {
                        return;
                    }
                    return;
                } finally {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                }
        }
    }

    public o6(ActionBarLayout actionBarLayout, d dVar, d dVar2, boolean z) {
        this.e = actionBarLayout;
        this.c = dVar;
        this.d = dVar2;
        this.b = z;
    }
}
