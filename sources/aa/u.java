package aa;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.vy;
public final class u {
    public final Context f857a;
    public final x f858b;
    public final q4.q f859c;
    public wf.b d;
    public wf.b f860e;
    public q f861f;
    public final b0 f862g;
    public final ga.d h;
    public final w9.a f863i;
    public final w9.a f864j;
    public final j f865k;
    public final x9.a f866l;
    public final vy f867m;
    public final ba.e f868n;

    public u(o9.g gVar, b0 b0Var, x9.a aVar, x xVar, w9.a aVar2, w9.a aVar3, ga.d dVar, j jVar, vy vyVar, ba.e eVar) {
        this.f858b = xVar;
        gVar.a();
        this.f857a = gVar.f20875a;
        this.f862g = b0Var;
        this.f866l = aVar;
        this.f863i = aVar2;
        this.f864j = aVar3;
        this.h = dVar;
        this.f865k = jVar;
        this.f867m = vyVar;
        this.f868n = eVar;
        System.currentTimeMillis();
        this.f859c = new q4.q(4);
    }

    public final void a(ia.c cVar) {
        ba.e.a();
        ba.e.a();
        this.d.D();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f863i.a(new a3.l(3));
                this.f861f.i();
                if (cVar.b().f15414b.f15410a) {
                    if (!this.f861f.f(cVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    this.f861f.j(((TaskCompletionSource) ((AtomicReference) cVar.f15424i).get()).getTask());
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                }
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                c();
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final void b(ia.c cVar) {
        Future<?> submit = this.f868n.f3135a.f3132a.submit(new r(this, cVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    public final void c() {
        ba.e.a();
        try {
            wf.b bVar = this.d;
            ga.d dVar = (ga.d) bVar.f57655c;
            dVar.getClass();
            if (!new File((File) dVar.d, (String) bVar.f57654b).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }
}
