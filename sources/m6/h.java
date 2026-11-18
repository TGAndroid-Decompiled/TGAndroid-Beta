package m6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import f5.s;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.h2;
public final class h implements Runnable {
    public final int f20862a = 0;
    public final boolean f20863b;
    public final Object f20864c;
    public final Object d;
    public final Object f20865e;

    public h(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f20864c = intent;
        this.d = context;
        this.f20863b = z10;
        this.f20865e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        int i7;
        switch (this.f20862a) {
            case 0:
                Intent intent2 = (Intent) this.f20864c;
                Context context = (Context) this.d;
                boolean z10 = this.f20863b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f20865e;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Executor executor = null;
                    if (parcelableExtra instanceof Intent) {
                        intent = (Intent) parcelableExtra;
                    } else {
                        intent = null;
                    }
                    if (intent != null) {
                        i7 = FirebaseInstanceIdReceiver.a(intent);
                    } else {
                        int i10 = 500;
                        if (intent2.getExtras() != null) {
                            a aVar = new a(intent2);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                SoftReference softReference = FirebaseInstanceIdReceiver.f7557b;
                                if (softReference != null) {
                                    executor = (Executor) softReference.get();
                                }
                                if (executor == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    FirebaseInstanceIdReceiver.f7557b = new SoftReference(executor);
                                }
                            }
                            executor.execute(new a9.h(context, aVar, countDownLatch, 7));
                            try {
                                i10 = ((Integer) Tasks.await(new ab.k(context).b(intent2))).intValue();
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
                        i7 = i10;
                    }
                    if (z10 && pendingResult != null) {
                        pendingResult.setResultCode(i7);
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
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f20865e;
                if (actionBarLayout.f28690e == this) {
                    actionBarLayout.f28690e = null;
                    h2 h2Var = (h2) this.f20864c;
                    if (h2Var != null) {
                        h2Var.onTransitionAnimationStart(false, false);
                    }
                    ((h2) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.h0(true, true, this.f20863b);
                    return;
                }
                return;
        }
    }

    public h(ActionBarLayout actionBarLayout, h2 h2Var, h2 h2Var2, boolean z10) {
        this.f20865e = actionBarLayout;
        this.f20864c = h2Var;
        this.d = h2Var2;
        this.f20863b = z10;
    }
}
