package n6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
public final class j0 {
    public static final Object f13887g = new Object();
    public static j0 h;
    public static HandlerThread f13888i;
    public final HashMap f13889a = new HashMap();
    public final Context f13890b;
    public volatile com.google.android.gms.internal.cast.c0 f13891c;
    public final t6.a d;
    public final long e;
    public final long f13892f;

    public j0(Context context, Looper looper) {
        i0 i0Var = new i0(this);
        this.f13890b = context.getApplicationContext();
        ?? handler = new Handler(looper, i0Var);
        Looper.getMainLooper();
        this.f13891c = handler;
        this.d = t6.a.a();
        this.e = 5000L;
        this.f13892f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f13887g) {
            try {
                HandlerThread handlerThread = f13888i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f13888i = handlerThread2;
                handlerThread2.start();
                return f13888i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final k6.a b(g0 g0Var, c0 c0Var, String str) {
        synchronized (this.f13889a) {
            try {
                h0 h0Var = (h0) this.f13889a.get(g0Var);
                k6.a aVar = null;
                if (h0Var == null) {
                    h0Var = new h0(this, g0Var);
                    h0Var.f13873a.put(c0Var, c0Var);
                    aVar = h0.a(h0Var, str, null);
                    this.f13889a.put(g0Var, h0Var);
                } else {
                    this.f13891c.removeMessages(0, g0Var);
                    if (!h0Var.f13873a.containsKey(c0Var)) {
                        h0Var.f13873a.put(c0Var, c0Var);
                        int i10 = h0Var.f13874b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                aVar = h0.a(h0Var, str, null);
                            }
                        } else {
                            c0Var.onServiceConnected(h0Var.f13876f, h0Var.d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(g0Var.toString()));
                    }
                }
                if (h0Var.f13875c) {
                    return k6.a.e;
                }
                if (aVar == null) {
                    aVar = new k6.a(-1);
                }
                return aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z10) {
        g0 g0Var = new g0(str, str2, z10);
        l.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f13889a) {
            try {
                h0 h0Var = (h0) this.f13889a.get(g0Var);
                if (h0Var != null) {
                    if (h0Var.f13873a.containsKey(serviceConnection)) {
                        h0Var.f13873a.remove(serviceConnection);
                        if (h0Var.f13873a.isEmpty()) {
                            this.f13891c.sendMessageDelayed(this.f13891c.obtainMessage(0, g0Var), this.e);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(g0Var.toString()));
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(g0Var.toString()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
