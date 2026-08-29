package c9;

import ab.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.v;
import g9.p;
import g9.r;
import g9.u;
import h9.o;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.s3;
public final class c {
    public final r f3012a;

    public c(r rVar) {
        this.f3012a = rVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        p pVar = this.f3012a.f7201f;
        Thread currentThread = Thread.currentThread();
        pVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        s sVar = pVar.f7183e;
        v vVar = new v(pVar, currentTimeMillis, th2, currentThread);
        sVar.getClass();
        sVar.Q(new f7.p(vVar, 1));
    }

    public final void b() {
        r rVar = this.f3012a;
        Boolean bool = Boolean.TRUE;
        u uVar = rVar.f7198b;
        synchronized (uVar) {
            uVar.f7224f = false;
            uVar.f7225g = bool;
            SharedPreferences.Editor edit = uVar.f7220a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (uVar.f7222c) {
                if (uVar.a()) {
                    if (!uVar.f7223e) {
                        uVar.d.trySetResult(null);
                        uVar.f7223e = true;
                    }
                } else if (uVar.f7223e) {
                    uVar.d = new TaskCompletionSource();
                    uVar.f7223e = false;
                }
            }
        }
    }

    public final void c(String str, String str2) {
        p pVar = this.f3012a.f7201f;
        pVar.getClass();
        try {
            ((m) pVar.d.d).r(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = pVar.f7180a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e10;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        s3 s3Var = this.f3012a.f7201f.d;
        s3Var.getClass();
        String b10 = h9.d.b(1024, str);
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
                ((s) s3Var.f16689b).Q(new o(s3Var, 0));
            } finally {
            }
        }
    }
}
