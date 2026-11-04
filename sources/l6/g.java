package l6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import e5.r;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
public final class g implements Runnable {
    public final int f18069a = 0;
    public final boolean f18070b;
    public final Object f18071c;
    public final Object d;
    public final Object f18072e;

    public g(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f18071c = intent;
        this.d = context;
        this.f18070b = z10;
        this.f18072e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        Executor executor;
        int i3;
        switch (this.f18069a) {
            case 0:
                Intent intent2 = (Intent) this.f18071c;
                Context context = (Context) this.d;
                boolean z10 = this.f18070b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f18072e;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    if (parcelableExtra instanceof Intent) {
                        intent = (Intent) parcelableExtra;
                    } else {
                        intent = null;
                    }
                    if (intent != null) {
                        i3 = FirebaseInstanceIdReceiver.a(intent);
                    } else {
                        int i10 = 500;
                        if (intent2.getExtras() != null) {
                            a aVar = new a(intent2);
                            Executor executor2 = null;
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                SoftReference softReference = FirebaseInstanceIdReceiver.f7939b;
                                if (softReference != null) {
                                    executor2 = (Executor) softReference.get();
                                }
                                if (executor2 == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new r("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executor2 = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    FirebaseInstanceIdReceiver.f7939b = new SoftReference(executor2);
                                }
                                executor = executor2;
                            }
                            executor.execute(new j1(context, aVar, countDownLatch, false, 6));
                            try {
                                i10 = ((Integer) Tasks.await(new za.g(context).b(intent2))).intValue();
                            } catch (InterruptedException | ExecutionException e10) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e11) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e11.toString()));
                            }
                        }
                        i3 = i10;
                    }
                    if (z10 && pendingResult != null) {
                        pendingResult.setResultCode(i3);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f18072e;
                if (actionBarLayout.f27287e == this) {
                    actionBarLayout.f27287e = null;
                    d2 d2Var = (d2) this.f18071c;
                    if (d2Var != null) {
                        d2Var.onTransitionAnimationStart(false, false);
                    }
                    ((d2) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.h0(true, true, this.f18070b);
                    return;
                }
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, d2 d2Var, d2 d2Var2, boolean z10) {
        this.f18072e = actionBarLayout;
        this.f18071c = d2Var;
        this.d = d2Var2;
        this.f18070b = z10;
    }
}
