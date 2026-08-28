package e9;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
public final class q {
    public final Context f5040a;
    public final t f5041b;
    public final we.b f5042c;
    public we.b d;
    public we.b f5043e;
    public o f5044f;
    public final x f5045g;
    public final j9.c h;
    public final a9.a f5046i;
    public final a9.a f5047j;
    public final ExecutorService f5048k;
    public final com.google.firebase.messaging.t f5049l;
    public final k f5050m;
    public final b9.b f5051n;
    public final android.support.v4.media.c f5052o;

    public q(s8.h hVar, x xVar, b9.b bVar, t tVar, a9.a aVar, a9.a aVar2, j9.c cVar, ExecutorService executorService, k kVar, android.support.v4.media.c cVar2) {
        this.f5041b = tVar;
        hVar.a();
        this.f5040a = hVar.f47470a;
        this.f5045g = xVar;
        this.f5051n = bVar;
        this.f5046i = aVar;
        this.f5047j = aVar2;
        this.f5048k = executorService;
        this.h = cVar;
        this.f5049l = new com.google.firebase.messaging.t(executorService);
        this.f5050m = kVar;
        this.f5052o = cVar2;
        System.currentTimeMillis();
        this.f5042c = new we.b(25, (byte) 0);
    }

    public static Task a(q qVar, c3.h hVar) {
        Task forException;
        p pVar;
        com.google.firebase.messaging.t tVar = qVar.f5049l;
        if (Boolean.TRUE.equals(((ThreadLocal) tVar.f4179e).get())) {
            qVar.d.k();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    qVar.f5046i.a(new a9.b(22));
                    qVar.f5044f.g();
                    if (!hVar.d().f16698b.f11083a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        pVar = new p(qVar, 0);
                    } else {
                        if (!qVar.f5044f.d(hVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = qVar.f5044f.h(((TaskCompletionSource) ((AtomicReference) hVar.f2306i).get()).getTask());
                        pVar = new p(qVar, 0);
                    }
                } catch (Exception e10) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                    forException = Tasks.forException(e10);
                    pVar = new p(qVar, 0);
                }
                tVar.Q(pVar);
                return forException;
            } catch (Throwable th) {
                tVar.Q(new p(qVar, 0));
                throw th;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(c3.h hVar) {
        Future<?> submit = this.f5048k.submit(new androidx.biometric.j(5, this, hVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }
}
