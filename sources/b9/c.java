package b9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.l;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.v;
import e7.p;
import f9.o;
import f9.q;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.t3;

public final class c {

    public final q f2051a;

    public c(q qVar) {
        this.f2051a = qVar;
    }

    public final void a(Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        o oVar = this.f2051a.f5976f;
        Thread threadCurrentThread = Thread.currentThread();
        oVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        t tVar = oVar.f5958e;
        v vVar = new v(oVar, jCurrentTimeMillis, th, threadCurrentThread);
        tVar.getClass();
        tVar.Q(new p(vVar, 1));
    }

    public final void b() {
        q qVar = this.f2051a;
        Boolean bool = Boolean.TRUE;
        f9.t tVar = qVar.f5973b;
        synchronized (tVar) {
            tVar.f5999f = false;
            tVar.f6000g = bool;
            SharedPreferences.Editor editorEdit = tVar.f5995a.edit();
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", true);
            editorEdit.apply();
            synchronized (tVar.f5997c) {
                try {
                    if (tVar.a()) {
                        if (!tVar.f5998e) {
                            tVar.d.trySetResult(null);
                            tVar.f5998e = true;
                        }
                    } else if (tVar.f5998e) {
                        tVar.d = new TaskCompletionSource();
                        tVar.f5998e = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(String str, String str2) {
        o oVar = this.f2051a.f5976f;
        oVar.getClass();
        try {
            ((l) oVar.d.d).r(str, str2);
        } catch (IllegalArgumentException e9) {
            Context context = oVar.f5955a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e9;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean zEquals;
        t3 t3Var = this.f2051a.f5976f.d;
        t3Var.getClass();
        String strB = g9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) t3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) t3Var.h).getReference();
                if (strB == null) {
                    zEquals = str2 == null;
                } else {
                    zEquals = strB.equals(str2);
                }
                if (zEquals) {
                    return;
                }
                ((AtomicMarkableReference) t3Var.h).set(strB, true);
                ((t) t3Var.f17474b).Q(new g9.o(t3Var, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
