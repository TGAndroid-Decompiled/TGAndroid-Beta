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
    public final Context f7982a;
    public final s f7983b;
    public final f7.b f7984c;
    public f7.b d;
    public f7.b f7985e;
    public n f7986f;
    public final w f7987g;
    public final n9.b h;
    public final e9.a f7988i;
    public final e9.a f7989j;
    public final ExecutorService f7990k;
    public final sf.e f7991l;
    public final k f7992m;
    public final f9.a f7993n;
    public final f0 f7994o;

    public p(w8.g gVar, w wVar, f9.a aVar, s sVar, e9.a aVar2, e9.a aVar3, n9.b bVar, ExecutorService executorService, k kVar, f0 f0Var) {
        this.f7983b = sVar;
        gVar.a();
        this.f7982a = gVar.f49452a;
        this.f7987g = wVar;
        this.f7993n = aVar;
        this.f7988i = aVar2;
        this.f7989j = aVar3;
        this.f7990k = executorService;
        this.h = bVar;
        this.f7991l = new sf.e(executorService);
        this.f7992m = kVar;
        this.f7994o = f0Var;
        System.currentTimeMillis();
        this.f7984c = new f7.b(15, (byte) 0);
    }

    public static Task a(p pVar, e3.g gVar) {
        Task forException;
        o oVar;
        sf.e eVar = pVar.f7991l;
        if (Boolean.TRUE.equals(((ThreadLocal) eVar.f47317e).get())) {
            pVar.d.n();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    pVar.f7988i.a(new f5.u(19));
                    pVar.f7986f.g();
                    if (!gVar.d().f44218b.f13622a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        oVar = new o(pVar, 0);
                    } else {
                        if (!pVar.f7986f.d(gVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = pVar.f7986f.h(((TaskCompletionSource) ((AtomicReference) gVar.f4937i).get()).getTask());
                        oVar = new o(pVar, 0);
                    }
                } catch (Exception e6) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e6);
                    forException = Tasks.forException(e6);
                    oVar = new o(pVar, 0);
                }
                eVar.H(oVar);
                return forException;
            } catch (Throwable th2) {
                eVar.H(new o(pVar, 0));
                throw th2;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(e3.g gVar) {
        Future<?> submit = this.f7990k.submit(new androidx.biometric.k(16, this, gVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e6) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e6);
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }
}
