package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;

public abstract class s {

    public final Context f2339a;

    public boolean f2340b;

    public boolean f2341c;
    public final Object d;

    public final Object f2342e;

    public Object f2343f;
    public Object h;

    public Object f2344n;

    public s(Context context, String str, String str2) {
        this.d = new Object();
        this.f2340b = false;
        this.f2341c = false;
        this.f2339a = context;
        this.f2342e = str;
        this.f2343f = str2.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(str2) : new String("com.google.android.gms.vision.dynamite.");
        this.h = str2;
    }

    public q c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract r d(String str);

    public r e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return d(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public abstract void f(o oVar);

    public void g(t tVar) {
        b0.b();
        if (((t) this.f2344n) != tVar) {
            this.f2344n = tVar;
            if (this.f2341c) {
                return;
            }
            this.f2341c = true;
            ((androidx.mediarouter.app.c) this.f2342e).sendEmptyMessage(1);
        }
    }

    public void h(o oVar) {
        b0.b();
        if (Objects.equals((o) this.h, oVar)) {
            return;
        }
        this.h = oVar;
        if (this.f2340b) {
            return;
        }
        this.f2340b = true;
        ((androidx.mediarouter.app.c) this.f2342e).sendEmptyMessage(2);
    }

    public abstract Object i(j6.e eVar, Context context);

    public abstract void j();

    public boolean k() {
        return m() != null;
    }

    public void l() {
        synchronized (this.d) {
            if (this.f2344n == null) {
                return;
            }
            try {
                j();
            } catch (RemoteException e9) {
                Log.e((String) this.f2342e, "Could not finalize native handle", e9);
            }
        }
    }

    public Object m() {
        j6.e eVarC;
        synchronized (this.d) {
            Object obj = this.f2344n;
            if (obj != null) {
                return obj;
            }
            try {
                eVarC = j6.e.c(this.f2339a, j6.e.f12728c, (String) this.f2343f);
            } catch (j6.b unused) {
                String str = "com.google.android.gms.vision." + ((String) this.h);
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", "Cannot load thick client module, fall back to load optional module " + str);
                }
                try {
                    eVarC = j6.e.c(this.f2339a, j6.e.f12727b, str);
                } catch (j6.b e9) {
                    g7.f0.a(e9, "Error loading optional module %s", str);
                    if (!this.f2340b) {
                        String str2 = (String) this.h;
                        if (Log.isLoggable("Vision", 3)) {
                            Log.d("Vision", "Broadcasting download intent for dependency " + str2);
                        }
                        String str3 = (String) this.h;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str3);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f2339a.sendBroadcast(intent);
                        this.f2340b = true;
                    }
                    eVarC = null;
                }
            }
            if (eVarC != null) {
                try {
                    this.f2344n = i(eVarC, this.f2339a);
                } catch (RemoteException | j6.b e10) {
                    Log.e((String) this.f2342e, "Error creating remote native handle", e10);
                }
            }
            boolean z10 = this.f2341c;
            if (!z10 && this.f2344n == null) {
                Log.w((String) this.f2342e, "Native handle not yet available. Reverting to no-op handle.");
                this.f2341c = true;
            } else if (z10 && this.f2344n != null) {
                Log.w((String) this.f2342e, "Native handle is now available.");
            }
            return this.f2344n;
        }
    }

    public s(Context context, k5.i iVar) {
        this.f2342e = new androidx.mediarouter.app.c(this, 4);
        if (context != null) {
            this.f2339a = context;
            if (iVar == null) {
                this.d = new k5.i(new ComponentName(context, getClass()), 5);
                return;
            } else {
                this.d = iVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
