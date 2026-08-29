package g9;

import ag.o1;
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
public final class r {
    public final Context f7197a;
    public final u f7198b;
    public final l f7199c;
    public l d;
    public l f7200e;
    public p f7201f;
    public final y f7202g;
    public final l9.b h;
    public final c9.a f7203i;
    public final c9.a f7204j;
    public final ExecutorService f7205k;
    public final com.google.firebase.messaging.s f7206l;
    public final k f7207m;
    public final d9.b f7208n;
    public final o1 f7209o;

    public r(u8.g gVar, y yVar, d9.b bVar, u uVar, c9.a aVar, c9.a aVar2, l9.b bVar2, ExecutorService executorService, k kVar, o1 o1Var) {
        this.f7198b = uVar;
        gVar.a();
        this.f7197a = gVar.f49131a;
        this.f7202g = yVar;
        this.f7208n = bVar;
        this.f7203i = aVar;
        this.f7204j = aVar2;
        this.f7205k = executorService;
        this.h = bVar2;
        this.f7206l = new com.google.firebase.messaging.s(executorService);
        this.f7207m = kVar;
        this.f7209o = o1Var;
        System.currentTimeMillis();
        this.f7199c = new l();
    }

    public static Task a(r rVar, e3.f fVar) {
        Task forException;
        q qVar;
        com.google.firebase.messaging.s sVar = rVar.f7206l;
        if (Boolean.TRUE.equals(((ThreadLocal) sVar.f5187e).get())) {
            rVar.d.j();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    rVar.f7203i.b(new eg.c(14));
                    rVar.f7201f.g();
                    if (!fVar.d().f17165b.f13606a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        qVar = new q(rVar, 0);
                    } else {
                        if (!rVar.f7201f.d(fVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = rVar.f7201f.h(((TaskCompletionSource) ((AtomicReference) fVar.f5818i).get()).getTask());
                        qVar = new q(rVar, 0);
                    }
                } catch (Exception e10) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                    forException = Tasks.forException(e10);
                    qVar = new q(rVar, 0);
                }
                sVar.Q(qVar);
                return forException;
            } catch (Throwable th2) {
                sVar.Q(new q(rVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(e3.f fVar) {
        Future<?> submit = this.f7205k.submit(new ab.o(this, fVar, false, 11));
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
