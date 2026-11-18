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
    public final Context f853a;
    public final w f854b;
    public final q4.q f855c;
    public wf.b d;
    public wf.b f856e;
    public p f857f;
    public final a0 f858g;
    public final ga.d h;
    public final w9.a f859i;
    public final w9.a f860j;
    public final j f861k;
    public final x9.a f862l;
    public final v4.f0 f863m;
    public final ba.e f864n;

    public t(o9.g gVar, a0 a0Var, x9.a aVar, w wVar, w9.a aVar2, w9.a aVar3, ga.d dVar, j jVar, v4.f0 f0Var, ba.e eVar) {
        this.f854b = wVar;
        gVar.a();
        this.f853a = gVar.f21763a;
        this.f858g = a0Var;
        this.f862l = aVar;
        this.f859i = aVar2;
        this.f860j = aVar3;
        this.h = dVar;
        this.f861k = jVar;
        this.f863m = f0Var;
        this.f864n = eVar;
        System.currentTimeMillis();
        this.f855c = new q4.q(4);
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
                this.f859i.a(new a3.l(3));
                this.f857f.i();
                if (cVar.b().f16187b.f16183a) {
                    if (!this.f857f.f(cVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    this.f857f.j(((TaskCompletionSource) ((AtomicReference) cVar.f16197i).get()).getTask());
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
        Future<?> submit = this.f864n.f3087a.f3084a.submit(new q(this, cVar, 1));
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
            ga.d dVar = (ga.d) bVar.f59673c;
            dVar.getClass();
            if (!new File((File) dVar.d, (String) bVar.f59672b).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }
}
