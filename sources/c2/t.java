package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;
import j7.e7;
public abstract class t {
    public final Context f2172a;
    public boolean f2173b;
    public boolean f2174c;
    public final Object d;
    public final Object f2175e;
    public Object f2176f;
    public Object h;
    public Object f2177n;

    public t(Context context, String str, String str2) {
        this.d = new Object();
        this.f2173b = false;
        this.f2174c = false;
        this.f2172a = context;
        this.f2175e = str;
        this.f2176f = str2.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(str2) : new String("com.google.android.gms.vision.dynamite.");
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
        c0.b();
        if (((u) this.f2177n) != uVar) {
            this.f2177n = uVar;
            if (!this.f2174c) {
                this.f2174c = true;
                ((androidx.mediarouter.app.d) this.f2175e).sendEmptyMessage(1);
            }
        }
    }

    public void h(o oVar) {
        c0.b();
        if (!Objects.equals((o) this.h, oVar)) {
            this.h = oVar;
            if (!this.f2173b) {
                this.f2173b = true;
                ((androidx.mediarouter.app.d) this.f2175e).sendEmptyMessage(2);
            }
        }
    }

    public abstract Object i(m6.e eVar, Context context);

    public abstract void j();

    public boolean k() {
        if (m() != null) {
            return true;
        }
        return false;
    }

    public void l() {
        synchronized (this.d) {
            if (this.f2177n == null) {
                return;
            }
            try {
                j();
            } catch (RemoteException e6) {
                Log.e((String) this.f2175e, "Could not finalize native handle", e6);
            }
        }
    }

    public Object m() {
        m6.e eVar;
        synchronized (this.d) {
            Object obj = this.f2177n;
            if (obj != null) {
                return obj;
            }
            try {
                eVar = m6.e.c(this.f2172a, m6.e.f13469c, (String) this.f2176f);
            } catch (m6.b unused) {
                String str = "com.google.android.gms.vision." + ((String) this.h);
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", "Cannot load thick client module, fall back to load optional module " + str);
                }
                try {
                    eVar = m6.e.c(this.f2172a, m6.e.f13468b, str);
                } catch (m6.b e6) {
                    e7.a(e6, "Error loading optional module %s", str);
                    if (!this.f2173b) {
                        String str2 = (String) this.h;
                        if (Log.isLoggable("Vision", 3)) {
                            Log.d("Vision", "Broadcasting download intent for dependency " + str2);
                        }
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", (String) this.h);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f2172a.sendBroadcast(intent);
                        this.f2173b = true;
                    }
                    eVar = null;
                }
            }
            if (eVar != null) {
                try {
                    this.f2177n = i(eVar, this.f2172a);
                } catch (RemoteException | m6.b e10) {
                    Log.e((String) this.f2175e, "Error creating remote native handle", e10);
                }
            }
            boolean z4 = this.f2174c;
            if (!z4 && this.f2177n == null) {
                Log.w((String) this.f2175e, "Native handle not yet available. Reverting to no-op handle.");
                this.f2174c = true;
            } else if (z4 && this.f2177n != null) {
                Log.w((String) this.f2175e, "Native handle is now available.");
            }
            return this.f2177n;
        }
    }

    public t(Context context, y5.h hVar) {
        this.f2175e = new androidx.mediarouter.app.d(this, 4);
        if (context != null) {
            this.f2172a = context;
            if (hVar == null) {
                this.d = new y5.h(new ComponentName(context, getClass()), 7);
                return;
            } else {
                this.d = hVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
