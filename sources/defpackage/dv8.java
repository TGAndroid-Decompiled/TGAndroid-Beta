package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class dv8 {
    public final AtomicReference a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;
    public final Object h;

    public dv8(Context context, e6b e6bVar) {
        this.a = new AtomicReference();
        this.b = new AtomicBoolean(false);
        this.h = new av8(this, (byte) 0);
        this.c = e6bVar;
        this.e = na7.q1(y6c.t0).N2;
        Utilities.e.c(new ll8(this, context, (byte) 20));
    }

    public static void e(String str, JSONObject jSONObject) {
        String str2 = str + jSONObject.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }

    public final void a(y6b y6bVar) {
        this.f = y6bVar;
        if (this.a.get() != null && !((AtomicBoolean) this.b).get()) {
            Utilities.e.a((av8) this.h);
            Utilities.e.d((av8) this.h, d());
        }
    }

    public final q7a b(int i) {
        q7a q7aVar = null;
        try {
            if (!ug8.c(2, i)) {
                JSONObject H = ((l69) this.e).H();
                if (H != null) {
                    q7a k0 = ((u39) this.d).k0(H);
                    e("Loaded cached settings: ", H);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!ug8.c(3, i) && k0.c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return k0;
                        } catch (Exception e) {
                            q7aVar = k0;
                            e = e;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return q7aVar;
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

    public final q7a c() {
        return (q7a) this.a.get();
    }

    public final long d() {
        if (((bv8) this.d) == null) {
            return 750L;
        }
        int o = gba.o();
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
                Utilities.e.a((av8) this.h);
                if (((bv8) this.d) != null) {
                    this.d = null;
                    gl.d3(new av8(this, (byte) 1));
                    return;
                }
                return;
            }
            Utilities.e.a((av8) this.h);
            Utilities.e.d((av8) this.h, d());
        }
    }

    public dv8(Context context, l8a l8aVar, ize izeVar, u39 u39Var, l69 l69Var, zb3 zb3Var, w53 w53Var) {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        this.h = new AtomicReference(new TaskCompletionSource());
        this.b = context;
        this.c = l8aVar;
        this.d = u39Var;
        this.e = l69Var;
        this.f = zb3Var;
        this.g = w53Var;
        atomicReference.set(o5f.p0(izeVar));
    }
}
