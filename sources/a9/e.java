package a9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.l;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.v;
import d7.p;
import e9.o;
import e9.q;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.t3;
public final class e {
    public final q f123a;

    public e(q qVar) {
        this.f123a = qVar;
    }

    public final void a(Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        o oVar = this.f123a.f5044f;
        Thread currentThread = Thread.currentThread();
        oVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        t tVar = oVar.f5026e;
        v vVar = new v(oVar, currentTimeMillis, th, currentThread);
        tVar.getClass();
        tVar.Q(new p(vVar, 1));
    }

    public final void b() {
        q qVar = this.f123a;
        Boolean bool = Boolean.TRUE;
        e9.t tVar = qVar.f5041b;
        synchronized (tVar) {
            tVar.f5067f = false;
            tVar.f5068g = bool;
            SharedPreferences.Editor edit = tVar.f5063a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (tVar.f5065c) {
                if (tVar.a()) {
                    if (!tVar.f5066e) {
                        tVar.d.trySetResult(null);
                        tVar.f5066e = true;
                    }
                } else if (tVar.f5066e) {
                    tVar.d = new TaskCompletionSource();
                    tVar.f5066e = false;
                }
            }
        }
    }

    public final void c(String str, String str2) {
        o oVar = this.f123a.f5044f;
        oVar.getClass();
        try {
            ((l) oVar.d.d).r(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = oVar.f5023a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e10;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        t3 t3Var = this.f123a.f5044f.d;
        t3Var.getClass();
        String b10 = f9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) t3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) t3Var.h).getReference();
                if (b10 == null) {
                    if (str2 == null) {
                        equals = true;
                    } else {
                        equals = false;
                    }
                } else {
                    equals = b10.equals(str2);
                }
                if (equals) {
                    return;
                }
                ((AtomicMarkableReference) t3Var.h).set(b10, true);
                ((t) t3Var.f17099b).Q(new f9.o(t3Var, 0));
            } finally {
            }
        }
    }
}
