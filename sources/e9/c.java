package e9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import cb.m;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.u;
import i9.n;
import i9.p;
import i9.s;
import j9.o;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.r3;
import sf.f;
public final class c {
    public final p f5005a;

    public c(p pVar) {
        this.f5005a = pVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        n nVar = this.f5005a.f7986f;
        Thread currentThread = Thread.currentThread();
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        f fVar = nVar.f7968e;
        u uVar = new u(nVar, currentTimeMillis, th2, currentThread);
        fVar.getClass();
        fVar.H(new h2.f(uVar, 3));
    }

    public final void b() {
        p pVar = this.f5005a;
        Boolean bool = Boolean.TRUE;
        s sVar = pVar.f7983b;
        synchronized (sVar) {
            sVar.f8009f = false;
            sVar.f8010g = bool;
            SharedPreferences.Editor edit = sVar.f8005a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (sVar.f8007c) {
                if (sVar.a()) {
                    if (!sVar.f8008e) {
                        sVar.d.trySetResult(null);
                        sVar.f8008e = true;
                    }
                } else if (sVar.f8008e) {
                    sVar.d = new TaskCompletionSource();
                    sVar.f8008e = false;
                }
            }
        }
    }

    public final void c(String str, String str2) {
        n nVar = this.f5005a.f7986f;
        nVar.getClass();
        try {
            ((m) nVar.d.d).u(str, str2);
        } catch (IllegalArgumentException e6) {
            Context context = nVar.f7965a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e6;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        r3 r3Var = this.f5005a.f7986f.d;
        r3Var.getClass();
        String b10 = j9.d.b(1024, str);
        synchronized (((AtomicMarkableReference) r3Var.h)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) r3Var.h).getReference();
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
                ((AtomicMarkableReference) r3Var.h).set(b10, true);
                ((f) r3Var.f13330b).H(new o(r3Var, 0));
            } finally {
            }
        }
    }
}
