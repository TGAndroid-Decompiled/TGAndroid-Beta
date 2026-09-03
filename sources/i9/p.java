package i9;

import android.content.Context;
import android.util.Log;
import androidx.biometric.e0;
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
    public final Context f7398a;
    public final s f7399b;
    public final f7.b f7400c;
    public f7.b d;
    public f7.b e;
    public n f7401f;
    public final w f7402g;
    public final n9.b h;
    public final e9.a f7403i;
    public final e9.a f7404j;
    public final ExecutorService f7405k;
    public final rf.f f7406l;
    public final k f7407m;
    public final f9.a f7408n;
    public final e0 f7409o;

    public p(w8.g gVar, w wVar, f9.a aVar, s sVar, e9.a aVar2, e9.a aVar3, n9.b bVar, ExecutorService executorService, k kVar, e0 e0Var) {
        this.f7399b = sVar;
        gVar.a();
        this.f7398a = gVar.f46560a;
        this.f7402g = wVar;
        this.f7408n = aVar;
        this.f7403i = aVar2;
        this.f7404j = aVar3;
        this.f7405k = executorService;
        this.h = bVar;
        this.f7406l = new rf.f(executorService);
        this.f7407m = kVar;
        this.f7409o = e0Var;
        System.currentTimeMillis();
        this.f7400c = new f7.b(15, (byte) 0);
    }

    public static Task a(p pVar, e3.g gVar) {
        Task forException;
        o oVar;
        rf.f fVar = pVar.f7406l;
        if (Boolean.TRUE.equals(((ThreadLocal) fVar.e).get())) {
            pVar.d.o();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f7403i.a(new f0.d(19));
                    pVar.f7401f.g();
                    if (!gVar.d().f41085b.f13888a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f7401f.d(gVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f7401f.h(((TaskCompletionSource) ((AtomicReference) gVar.f5106i).get()).getTask());
                        oVar = new o(pVar, 0);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                    forException = Tasks.forException(e);
                    oVar = new o(pVar, 0);
                }
                fVar.H(oVar);
                return forException;
            } catch (Throwable th2) {
                fVar.H(new o(pVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(e3.g gVar) {
        Future<?> submit = this.f7405k.submit(new androidx.biometric.j(16, this, gVar));
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
