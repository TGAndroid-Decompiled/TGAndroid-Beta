package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;
public abstract class wt6 {
    public final Context a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object h;
    public Object n;

    public wt6(Context context, z24 z24Var) {
        this.e = new c1(this, (byte) 10);
        if (context != null) {
            this.a = context;
            if (z24Var == null) {
                this.d = new z24(new ComponentName(context, getClass()), (byte) 18);
                return;
            } else {
                this.d = z24Var;
                return;
            }
        }
        w26.j("context must not be null");
        throw null;
    }

    public ut6 c(String str) {
        if (str != null) {
            return null;
        }
        w26.j("initialMemberRouteId cannot be null.");
        return null;
    }

    public abstract vt6 d(String str);

    public vt6 e(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return d(str);
            }
            w26.j("routeGroupId cannot be null");
            return null;
        }
        w26.j("routeId cannot be null");
        return null;
    }

    public abstract void f(bt6 bt6Var);

    public final void g(am4 am4Var) {
        gu6.b();
        if (((am4) this.n) != am4Var) {
            this.n = am4Var;
            if (!this.c) {
                this.c = true;
                ((c1) this.e).sendEmptyMessage(1);
            }
        }
    }

    public final void h(bt6 bt6Var) {
        gu6.b();
        if (!Objects.equals((bt6) this.h, bt6Var)) {
            this.h = bt6Var;
            if (!this.b) {
                this.b = true;
                ((c1) this.e).sendEmptyMessage(2);
            }
        }
    }

    public abstract Object i(ds3 ds3Var, Context context);

    public abstract void j();

    public final boolean k() {
        if (m() != null) {
            return true;
        }
        return false;
    }

    public final void l() {
        synchronized (this.d) {
            if (this.n == null) {
                return;
            }
            try {
                j();
            } catch (RemoteException e) {
                Log.e((String) this.e, "Could not finalize native handle", e);
            }
        }
    }

    public final Object m() {
        ds3 ds3Var;
        synchronized (this.d) {
            Object obj = this.n;
            if (obj != null) {
                return obj;
            }
            try {
                ds3Var = ds3.c(this.a, ds3.c, (String) this.f);
            } catch (as3 unused) {
                String concat = "com.google.android.gms.vision.".concat((String) this.h);
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", "Cannot load thick client module, fall back to load optional module ".concat(concat));
                }
                try {
                    ds3Var = ds3.c(this.a, ds3.b, concat);
                } catch (as3 e) {
                    ame.a(e, "Error loading optional module %s", concat);
                    if (!this.b) {
                        String str = (String) this.h;
                        if (Log.isLoggable("Vision", 3)) {
                            Log.d("Vision", "Broadcasting download intent for dependency ".concat(str));
                        }
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", (String) this.h);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.a.sendBroadcast(intent);
                        this.b = true;
                    }
                    ds3Var = null;
                }
            }
            if (ds3Var != null) {
                try {
                    this.n = i(ds3Var, this.a);
                } catch (RemoteException | as3 e2) {
                    Log.e((String) this.e, "Error creating remote native handle", e2);
                }
            }
            boolean z = this.c;
            Object obj2 = this.n;
            if (!z) {
                if (obj2 == null) {
                    Log.w((String) this.e, "Native handle not yet available. Reverting to no-op handle.");
                    this.c = true;
                }
            } else if (obj2 != null) {
                Log.w((String) this.e, "Native handle is now available.");
            }
            return this.n;
        }
    }

    public wt6(Context context, String str, String str2) {
        this.d = new Object();
        this.b = false;
        this.c = false;
        this.a = context;
        this.e = str;
        this.f = str2.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(str2) : new String("com.google.android.gms.vision.dynamite.");
        this.h = str2;
    }
}
