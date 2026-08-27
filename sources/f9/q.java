package f9;

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

    public final Context f5972a;

    public final t f5973b;

    public final xe.b f5974c;
    public xe.b d;

    public xe.b f5975e;

    public o f5976f;

    public final x f5977g;
    public final k9.c h;

    public final b9.a f5978i;

    public final b9.a f5979j;

    public final ExecutorService f5980k;

    public final com.google.firebase.messaging.t f5981l;

    public final k f5982m;

    public final c9.a f5983n;

    public final ga.c f5984o;

    public q(t8.h hVar, x xVar, c9.a aVar, t tVar, b9.a aVar2, b9.a aVar3, k9.c cVar, ExecutorService executorService, k kVar, ga.c cVar2) {
        this.f5973b = tVar;
        hVar.a();
        this.f5972a = hVar.f48119a;
        this.f5977g = xVar;
        this.f5983n = aVar;
        this.f5978i = aVar2;
        this.f5979j = aVar3;
        this.f5980k = executorService;
        this.h = cVar;
        this.f5981l = new com.google.firebase.messaging.t(executorService);
        this.f5982m = kVar;
        this.f5984o = cVar2;
        System.currentTimeMillis();
        this.f5974c = new xe.b(28, (byte) 0);
    }

    public static Task a(q qVar, c3.g gVar) {
        Task taskForException;
        p pVar;
        com.google.firebase.messaging.t tVar = qVar.f5981l;
        if (!Boolean.TRUE.equals(((ThreadLocal) tVar.f4621e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        qVar.d.k();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                qVar.f5978i.a(new a9.m(29));
                qVar.f5976f.g();
                if (gVar.d().f17882b.f12885a) {
                    if (!qVar.f5976f.d(gVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    taskForException = qVar.f5976f.h(((TaskCompletionSource) ((AtomicReference) gVar.f2439i).get()).getTask());
                    pVar = new p(qVar, 0);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    taskForException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    pVar = new p(qVar, 0);
                }
            } catch (Exception e9) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e9);
                taskForException = Tasks.forException(e9);
                pVar = new p(qVar, 0);
            }
            tVar.Q(pVar);
            return taskForException;
        } catch (Throwable th) {
            tVar.Q(new p(qVar, 0));
            throw th;
        }
    }

    public final void b(c3.g gVar) {
        Future<?> futureSubmit = this.f5980k.submit(new a9.o(7, this, gVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e9) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e9);
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }
}
