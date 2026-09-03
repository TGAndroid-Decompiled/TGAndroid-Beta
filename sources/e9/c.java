package e9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import cb.m;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.t;
import i9.n;
import i9.p;
import i9.s;
import j9.o;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.s3;
import rf.f;
public final class c {
    public final p f5172a;

    public c(p pVar) {
        this.f5172a = pVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        n nVar = this.f5172a.f7401f;
        Thread currentThread = Thread.currentThread();
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        f fVar = nVar.e;
        t tVar = new t(nVar, currentTimeMillis, th2, currentThread);
        fVar.getClass();
        fVar.H(new h2.f(tVar, 3));
    }

    public final void b() {
        p pVar = this.f5172a;
        Boolean bool = Boolean.TRUE;
        s sVar = pVar.f7399b;
        synchronized (sVar) {
            sVar.f7421f = false;
            sVar.f7422g = bool;
            SharedPreferences.Editor edit = sVar.f7418a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (sVar.f7420c) {
                if (sVar.a()) {
                    if (!sVar.e) {
                        sVar.d.trySetResult(null);
                        sVar.e = true;
                    }
                } else if (sVar.e) {
                    sVar.d = new TaskCompletionSource();
                    sVar.e = false;
                }
            }
        }
    }

    public final void c(String str, String str2) {
        n nVar = this.f5172a.f7401f;
        nVar.getClass();
        try {
            ((m) nVar.d.d).u(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = nVar.f7382a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        s3 s3Var = this.f5172a.f7401f.d;
        s3Var.getClass();
        String b10 = j9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) s3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) s3Var.h).getReference();
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
                ((AtomicMarkableReference) s3Var.h).set(b10, true);
                ((f) s3Var.f13626b).H(new o(s3Var, 0));
            } finally {
            }
        }
    }
}
