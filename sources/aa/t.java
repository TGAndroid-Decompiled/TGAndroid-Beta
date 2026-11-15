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
public final class t {
    public final Context f854a;
    public final w f855b;
    public final q4.q f856c;
    public wf.b d;
    public wf.b f857e;
    public p f858f;
    public final a0 f859g;
    public final ga.d h;
    public final w9.a f860i;
    public final w9.a f861j;
    public final j f862k;
    public final x9.a f863l;
    public final x9.d f864m;
    public final ba.e f865n;

    public t(o9.g gVar, a0 a0Var, x9.a aVar, w wVar, w9.a aVar2, w9.a aVar3, ga.d dVar, j jVar, x9.d dVar2, ba.e eVar) {
        this.f855b = wVar;
        gVar.a();
        this.f854a = gVar.f21397a;
        this.f859g = a0Var;
        this.f863l = aVar;
        this.f860i = aVar2;
        this.f861j = aVar3;
        this.h = dVar;
        this.f862k = jVar;
        this.f864m = dVar2;
        this.f865n = eVar;
        System.currentTimeMillis();
        this.f856c = new q4.q(4);
    }

    public final void a(ia.c cVar) {
        ba.e.a();
        ba.e.a();
        this.d.r();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f860i.a(new a3.l(3));
                this.f858f.i();
                if (cVar.b().f15869b.f15865a) {
                    if (!this.f858f.f(cVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    this.f858f.j(((TaskCompletionSource) ((AtomicReference) cVar.f15879i).get()).getTask());
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
        Future<?> submit = this.f865n.f3090a.f3087a.submit(new q(this, cVar, 1));
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
            ga.d dVar = (ga.d) bVar.f59108c;
            dVar.getClass();
            if (!new File((File) dVar.d, (String) bVar.f59107b).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }
}
