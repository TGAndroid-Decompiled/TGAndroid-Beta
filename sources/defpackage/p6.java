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
import org.telegram.ui.ActionBar.e;
public final class p6 implements Runnable {
    public final byte a = 1;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public p6(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
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
                    e eVar = (e) this.c;
                    if (eVar != null) {
                        eVar.onTransitionAnimationStart(false, false);
                    }
                    ((e) this.d).onTransitionAnimationStart(true, false);
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
                            wj2 wj2Var = new wj2(intent2);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                if (softReference != null) {
                                    executor = (Executor) softReference.get();
                                }
                                if (executor == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new kq7("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    FirebaseInstanceIdReceiver.b = new SoftReference(executor);
                                }
                            }
                            executor.execute(new uy1(context, wj2Var, countDownLatch, false, (byte) 9));
                            try {
                                i2 = ((Integer) Tasks.await(new qx6(context, (byte) 1).H(intent2))).intValue();
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

    public p6(ActionBarLayout actionBarLayout, e eVar, e eVar2, boolean z) {
        this.e = actionBarLayout;
        this.c = eVar;
        this.d = eVar2;
        this.b = z;
    }
}
