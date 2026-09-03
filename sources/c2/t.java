package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;
import j7.d7;
public abstract class t {
    public final Context f2024a;
    public boolean f2025b;
    public boolean f2026c;
    public final Object d;
    public final Object e;
    public Object f2027f;
    public Object h;
    public Object f2028n;

    public t(Context context, String str, String str2) {
        this.d = new Object();
        this.f2025b = false;
        this.f2026c = false;
        this.f2024a = context;
        this.e = str;
        this.f2027f = str2.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(str2) : new String("com.google.android.gms.vision.dynamite.");
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
        if (((u) this.f2028n) != uVar) {
            this.f2028n = uVar;
            if (!this.f2026c) {
                this.f2026c = true;
                ((androidx.mediarouter.app.d) this.e).sendEmptyMessage(1);
            }
        }
    }

    public void h(o oVar) {
        d0.b();
        if (!Objects.equals((o) this.h, oVar)) {
            this.h = oVar;
            if (!this.f2025b) {
                this.f2025b = true;
                ((androidx.mediarouter.app.d) this.e).sendEmptyMessage(2);
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
            if (this.f2028n == null) {
                return;
            }
            try {
                j();
            } catch (RemoteException e) {
                Log.e((String) this.e, "Could not finalize native handle", e);
            }
        }
    }

    public Object m() {
        m6.e eVar;
        synchronized (this.d) {
            Object obj = this.f2028n;
            if (obj != null) {
                return obj;
            }
            try {
                eVar = m6.e.c(this.f2024a, m6.e.f13740c, (String) this.f2027f);
            } catch (m6.b unused) {
                String str = "com.google.android.gms.vision." + ((String) this.h);
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", "Cannot load thick client module, fall back to load optional module " + str);
                }
                try {
                    eVar = m6.e.c(this.f2024a, m6.e.f13739b, str);
                } catch (m6.b e) {
                    d7.a(e, "Error loading optional module %s", str);
                    if (!this.f2025b) {
                        String str2 = (String) this.h;
                        if (Log.isLoggable("Vision", 3)) {
                            Log.d("Vision", "Broadcasting download intent for dependency " + str2);
                        }
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", (String) this.h);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f2024a.sendBroadcast(intent);
                        this.f2025b = true;
                    }
                    eVar = null;
                }
            }
            if (eVar != null) {
                try {
                    this.f2028n = i(eVar, this.f2024a);
                } catch (RemoteException | m6.b e6) {
                    Log.e((String) this.e, "Error creating remote native handle", e6);
                }
            }
            boolean z4 = this.f2026c;
            if (!z4 && this.f2028n == null) {
                Log.w((String) this.e, "Native handle not yet available. Reverting to no-op handle.");
                this.f2026c = true;
            } else if (z4 && this.f2028n != null) {
                Log.w((String) this.e, "Native handle is now available.");
            }
            return this.f2028n;
        }
    }

    public t(Context context, o5.i iVar) {
        this.e = new androidx.mediarouter.app.d(this, 4);
        if (context != null) {
            this.f2024a = context;
            if (iVar == null) {
                this.d = new o5.i(new ComponentName(context, getClass()), 7);
                return;
            } else {
                this.d = iVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
