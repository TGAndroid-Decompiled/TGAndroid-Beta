package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
public final class ex8 {
    public final AtomicReference a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;
    public final Object h;

    public ex8(Context context, g8b g8bVar) {
        this.a = new AtomicReference();
        this.b = new AtomicBoolean(false);
        this.h = new bx8(this, (byte) 0);
        this.c = g8bVar;
        this.e = oc7.r1(z8c.t0).N2;
        Utilities.e.c(new mn8(this, context, (byte) 22));
    }

    public static void e(String str, JSONObject jSONObject) {
        String str2 = str + jSONObject.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }

    public final void a(a9b a9bVar) {
        this.f = a9bVar;
        if (this.a.get() != null && !((AtomicBoolean) this.b).get()) {
            Utilities.e.a((bx8) this.h);
            Utilities.e.d((bx8) this.h, d());
        }
    }

    public final r9a b(int i) {
        r9a r9aVar = null;
        try {
            if (!wi8.c(2, i)) {
                JSONObject D = ((ni6) this.e).D();
                if (D != null) {
                    r9a i0 = ((x59) this.d).i0(D);
                    e("Loaded cached settings: ", D);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!wi8.c(3, i) && i0.c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return i0;
                        } catch (Exception e) {
                            r9aVar = i0;
                            e = e;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return r9aVar;
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

    public final r9a c() {
        return (r9a) this.a.get();
    }

    public final long d() {
        if (((cx8) this.d) == null) {
            return 750L;
        }
        int o = gda.o();
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
                Utilities.e.a((bx8) this.h);
                if (((cx8) this.d) != null) {
                    this.d = null;
                    gm.c3(new bx8(this, (byte) 1));
                    return;
                }
                return;
            }
            Utilities.e.a((bx8) this.h);
            Utilities.e.d((bx8) this.h, d());
        }
    }

    public ex8(Context context, laa laaVar, k1f k1fVar, x59 x59Var, ni6 ni6Var, ld3 ld3Var, i73 i73Var) {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        this.h = new AtomicReference(new TaskCompletionSource());
        this.b = context;
        this.c = laaVar;
        this.d = x59Var;
        this.e = ni6Var;
        this.f = ld3Var;
        this.g = i73Var;
        atomicReference.set(q7f.z0(k1fVar));
    }
}
