package i9;

import android.content.Context;
import android.util.Log;
import androidx.biometric.f0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
public final class p {
    public final Context f7416a;
    public final s f7417b;
    public final f7.b f7418c;
    public f7.b d;
    public f7.b e;
    public n f7419f;
    public final w f7420g;
    public final n9.b h;
    public final e9.a f7421i;
    public final e9.a f7422j;
    public final ExecutorService f7423k;
    public final com.google.firebase.messaging.r f7424l;
    public final k f7425m;
    public final f9.a f7426n;
    public final f0 f7427o;

    public p(w8.g gVar, w wVar, f9.a aVar, s sVar, e9.a aVar2, e9.a aVar3, n9.b bVar, ExecutorService executorService, k kVar, f0 f0Var) {
        this.f7417b = sVar;
        gVar.a();
        this.f7416a = gVar.f46478a;
        this.f7420g = wVar;
        this.f7426n = aVar;
        this.f7421i = aVar2;
        this.f7422j = aVar3;
        this.f7423k = executorService;
        this.h = bVar;
        this.f7424l = new com.google.firebase.messaging.r(executorService);
        this.f7425m = kVar;
        this.f7427o = f0Var;
        System.currentTimeMillis();
        this.f7418c = new f7.b(15, (byte) 0);
    }

    public static Task a(p pVar, e3.g gVar) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.r rVar = pVar.f7424l;
        if (Boolean.TRUE.equals(((ThreadLocal) rVar.e).get())) {
            pVar.d.n();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f7421i.a(new f0.d(19));
                    pVar.f7419f.g();
                    if (!gVar.d().f41062b.f13904a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f7419f.d(gVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f7419f.h(((TaskCompletionSource) ((AtomicReference) gVar.f5100i).get()).getTask());
                        oVar = new o(pVar, 0);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                    forException = Tasks.forException(e);
                    oVar = new o(pVar, 0);
                }
                rVar.V(oVar);
                return forException;
            } catch (Throwable th2) {
                rVar.V(new o(pVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(e3.g gVar) {
        Future<?> submit = this.f7423k.submit(new androidx.biometric.k(16, this, gVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e6) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e6);
        } catch (TimeoutException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e10);
        }
    }
}
