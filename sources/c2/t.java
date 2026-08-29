package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import h7.k5;
import j$.util.Objects;
public abstract class t {
    public final Context f2897a;
    public boolean f2898b;
    public boolean f2899c;
    public final Object d;
    public final Object f2900e;
    public Object f2901f;
    public Object h;
    public Object f2902n;

    public t(Context context, String str, String str2) {
        this.d = new Object();
        this.f2898b = false;
        this.f2899c = false;
        this.f2897a = context;
        this.f2900e = str;
        this.f2901f = str2.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(str2) : new String("com.google.android.gms.vision.dynamite.");
        this.h = str2;
    }

    public r c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract s d(String str);

    public s e(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return d(str);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public abstract void f(o oVar);

    public void g(u uVar) {
        d0.b();
        if (((u) this.f2902n) != uVar) {
            this.f2902n = uVar;
            if (!this.f2899c) {
                this.f2899c = true;
                ((a4.d) this.f2900e).sendEmptyMessage(1);
            }
        }
    }

    public void h(o oVar) {
        d0.b();
        if (!Objects.equals((o) this.h, oVar)) {
            this.h = oVar;
            if (!this.f2898b) {
                this.f2898b = true;
                ((a4.d) this.f2900e).sendEmptyMessage(2);
            }
        }
    }

    public abstract Object i(k6.e eVar, Context context);

    public abstract void j();

    public boolean k() {
        if (m() != null) {
            return true;
        }
        return false;
    }

    public void l() {
        synchronized (this.d) {
            if (this.f2902n == null) {
                return;
            }
            try {
                j();
            } catch (RemoteException e10) {
                Log.e((String) this.f2900e, "Could not finalize native handle", e10);
            }
        }
    }

    public Object m() {
        k6.e eVar;
        synchronized (this.d) {
            Object obj = this.f2902n;
            if (obj != null) {
                return obj;
            }
            try {
                eVar = k6.e.c(this.f2897a, k6.e.f13451c, (String) this.f2901f);
            } catch (k6.b unused) {
                String str = "com.google.android.gms.vision." + ((String) this.h);
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", "Cannot load thick client module, fall back to load optional module " + str);
                }
                try {
                    eVar = k6.e.c(this.f2897a, k6.e.f13450b, str);
                } catch (k6.b e10) {
                    k5.a(e10, "Error loading optional module %s", str);
                    if (!this.f2898b) {
                        String str2 = (String) this.h;
                        if (Log.isLoggable("Vision", 3)) {
                            Log.d("Vision", "Broadcasting download intent for dependency " + str2);
                        }
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", (String) this.h);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f2897a.sendBroadcast(intent);
                        this.f2898b = true;
                    }
                    eVar = null;
                }
            }
            if (eVar != null) {
                try {
                    this.f2902n = i(eVar, this.f2897a);
                } catch (RemoteException | k6.b e11) {
                    Log.e((String) this.f2900e, "Error creating remote native handle", e11);
                }
            }
            boolean z10 = this.f2899c;
            if (!z10 && this.f2902n == null) {
                Log.w((String) this.f2900e, "Native handle not yet available. Reverting to no-op handle.");
                this.f2899c = true;
            } else if (z10 && this.f2902n != null) {
                Log.w((String) this.f2900e, "Native handle is now available.");
            }
            return this.f2902n;
        }
    }

    public t(Context context, m5.i iVar) {
        this.f2900e = new a4.d(this, 5);
        if (context != null) {
            this.f2897a = context;
            if (iVar == null) {
                this.d = new m5.i(new ComponentName(context, getClass()), 7);
                return;
            } else {
                this.d = iVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
