package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;
public abstract class s {
    public final Context f2219a;
    public boolean f2220b;
    public boolean f2221c;
    public final Object d;
    public final Object f2222e;
    public Object f2223f;
    public Object h;
    public Object f2224n;

    public s(Context context, String str, String str2) {
        this.d = new Object();
        this.f2220b = false;
        this.f2221c = false;
        this.f2219a = context;
        this.f2222e = str;
        this.f2223f = str2.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(str2) : new String("com.google.android.gms.vision.dynamite.");
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
        if (str != null) {
            if (str2 != null) {
                return d(str);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public abstract void f(o oVar);

    public void g(t tVar) {
        c0.b();
        if (((t) this.f2224n) != tVar) {
            this.f2224n = tVar;
            if (!this.f2221c) {
                this.f2221c = true;
                ((androidx.mediarouter.app.d) this.f2222e).sendEmptyMessage(1);
            }
        }
    }

    public void h(o oVar) {
        c0.b();
        if (!Objects.equals((o) this.h, oVar)) {
            this.h = oVar;
            if (!this.f2220b) {
                this.f2220b = true;
                ((androidx.mediarouter.app.d) this.f2222e).sendEmptyMessage(2);
            }
        }
    }

    public abstract Object i(i6.e eVar, Context context);

    public abstract void j();

    public boolean k() {
        if (m() != null) {
            return true;
        }
        return false;
    }

    public void l() {
        synchronized (this.d) {
            if (this.f2224n == null) {
                return;
            }
            try {
                j();
            } catch (RemoteException e10) {
                Log.e((String) this.f2222e, "Could not finalize native handle", e10);
            }
        }
    }

    public Object m() {
        i6.e eVar;
        synchronized (this.d) {
            Object obj = this.f2224n;
            if (obj != null) {
                return obj;
            }
            try {
                eVar = i6.e.c(this.f2219a, i6.e.f10928c, (String) this.f2223f);
            } catch (i6.b unused) {
                String str = "com.google.android.gms.vision." + ((String) this.h);
                if (Log.isLoggable("Vision", 3)) {
                    Log.d("Vision", "Cannot load thick client module, fall back to load optional module " + str);
                }
                try {
                    eVar = i6.e.c(this.f2219a, i6.e.f10927b, str);
                } catch (i6.b e10) {
                    com.google.android.gms.internal.cast.o.a(e10, "Error loading optional module %s", str);
                    if (!this.f2220b) {
                        String str2 = (String) this.h;
                        if (Log.isLoggable("Vision", 3)) {
                            Log.d("Vision", "Broadcasting download intent for dependency " + str2);
                        }
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", (String) this.h);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f2219a.sendBroadcast(intent);
                        this.f2220b = true;
                    }
                    eVar = null;
                }
            }
            if (eVar != null) {
                try {
                    this.f2224n = i(eVar, this.f2219a);
                } catch (RemoteException | i6.b e11) {
                    Log.e((String) this.f2222e, "Error creating remote native handle", e11);
                }
            }
            boolean z10 = this.f2221c;
            if (!z10 && this.f2224n == null) {
                Log.w((String) this.f2222e, "Native handle not yet available. Reverting to no-op handle.");
                this.f2221c = true;
            } else if (z10 && this.f2224n != null) {
                Log.w((String) this.f2222e, "Native handle is now available.");
            }
            return this.f2224n;
        }
    }

    public s(Context context, android.support.v4.media.c cVar) {
        this.f2222e = new androidx.mediarouter.app.d(this, 4);
        if (context != null) {
            this.f2219a = context;
            if (cVar == null) {
                this.d = new android.support.v4.media.c(new ComponentName(context, getClass()), 5);
                return;
            } else {
                this.d = cVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }
}
