package e9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import cb.m;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.r;
import com.google.firebase.messaging.u;
import h2.f;
import i9.n;
import i9.p;
import i9.s;
import j9.o;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.s3;
public final class c {
    public final p f5166a;

    public c(p pVar) {
        this.f5166a = pVar;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        n nVar = this.f5166a.f7419f;
        Thread currentThread = Thread.currentThread();
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        r rVar = nVar.e;
        u uVar = new u(nVar, currentTimeMillis, th2, currentThread);
        rVar.getClass();
        rVar.V(new f(uVar, 3));
    }

    public final void b() {
        p pVar = this.f5166a;
        Boolean bool = Boolean.TRUE;
        s sVar = pVar.f7417b;
        synchronized (sVar) {
            sVar.f7439f = false;
            sVar.f7440g = bool;
            SharedPreferences.Editor edit = sVar.f7436a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (sVar.f7438c) {
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
        n nVar = this.f5166a.f7419f;
        nVar.getClass();
        try {
            ((m) nVar.d.d).u(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = nVar.f7400a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void d(String str) {
        boolean equals;
        s3 s3Var = this.f5166a.f7419f.d;
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
                ((r) s3Var.f13642b).V(new o(s3Var, 0));
            } finally {
            }
        }
    }
}
