package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class oy8 {
    public final AtomicReference a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;
    public final Object h;

    public oy8(Context context, dab dabVar) {
        this.a = new AtomicReference();
        this.b = new AtomicBoolean(false);
        this.h = new ly8(this, (byte) 0);
        this.c = dabVar;
        this.e = uc7.s1(yac.t0).N2;
        Utilities.e.c(new ep8(this, context, (byte) 19));
    }

    public static void e(String str, JSONObject jSONObject) {
        String str2 = str + jSONObject.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }

    public final void a(xab xabVar) {
        this.f = xabVar;
        if (this.a.get() != null && !((AtomicBoolean) this.b).get()) {
            Utilities.e.a((ly8) this.h);
            Utilities.e.d((ly8) this.h, d());
        }
    }

    public final hba b(int i) {
        hba hbaVar = null;
        try {
            if (!ik8.c(2, i)) {
                JSONObject F = ((ri6) this.e).F();
                if (F != null) {
                    hba c0 = ((ve9) this.d).c0(F);
                    e("Loaded cached settings: ", F);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!ik8.c(3, i) && c0.c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return c0;
                        } catch (Exception e) {
                            hbaVar = c0;
                            e = e;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return hbaVar;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final hba c() {
        return (hba) this.a.get();
    }

    public final long d() {
        if (((my8) this.d) == null) {
            return 750L;
        }
        int o = xea.o();
        if (o != 1) {
            if (o != 2) {
                return 800L;
            }
            return 80L;
        }
        return 400L;
    }

    public final void f(boolean z) {
        if (((AtomicBoolean) this.b).getAndSet(z) != z) {
            if (z) {
                Utilities.e.a((ly8) this.h);
                if (((my8) this.d) != null) {
                    this.d = null;
                    hl.c3(new ly8(this, (byte) 1));
                    return;
                }
                return;
            }
            Utilities.e.a((ly8) this.h);
            Utilities.e.d((ly8) this.h, d());
        }
    }

    public oy8(Context context, cca ccaVar, z3f z3fVar, ve9 ve9Var, ri6 ri6Var, sc3 sc3Var, p63 p63Var) {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        this.h = new AtomicReference(new TaskCompletionSource());
        this.b = context;
        this.c = ccaVar;
        this.d = ve9Var;
        this.e = ri6Var;
        this.f = sc3Var;
        this.g = p63Var;
        atomicReference.set(faf.z0(z3fVar));
    }
}
