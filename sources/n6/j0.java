package n6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
public final class j0 {
    public static final Object f15285g = new Object();
    public static j0 h;
    public static HandlerThread f15286i;
    public final HashMap f15287a = new HashMap();
    public final Context f15288b;
    public volatile com.google.android.gms.internal.cast.c0 f15289c;
    public final t6.a d;
    public final long e;
    public final long f15290f;

    public j0(Context context, Looper looper) {
        i0 i0Var = new i0(this);
        this.f15288b = context.getApplicationContext();
        ?? handler = new Handler(looper, i0Var);
        Looper.getMainLooper();
        this.f15289c = handler;
        this.d = t6.a.a();
        this.e = 5000L;
        this.f15290f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f15285g) {
            try {
                HandlerThread handlerThread = f15286i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f15286i = handlerThread2;
                handlerThread2.start();
                return f15286i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final k6.a b(g0 g0Var, c0 c0Var, String str) {
        synchronized (this.f15287a) {
            try {
                h0 h0Var = (h0) this.f15287a.get(g0Var);
                k6.a aVar = null;
                if (h0Var == null) {
                    h0Var = new h0(this, g0Var);
                    h0Var.f15271a.put(c0Var, c0Var);
                    aVar = h0.a(h0Var, str, null);
                    this.f15287a.put(g0Var, h0Var);
                } else {
                    this.f15289c.removeMessages(0, g0Var);
                    if (!h0Var.f15271a.containsKey(c0Var)) {
                        h0Var.f15271a.put(c0Var, c0Var);
                        int i10 = h0Var.f15272b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                aVar = h0.a(h0Var, str, null);
                            }
                        } else {
                            c0Var.onServiceConnected(h0Var.f15274f, h0Var.d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(g0Var.toString()));
                    }
                }
                if (h0Var.f15273c) {
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
        synchronized (this.f15287a) {
            try {
                h0 h0Var = (h0) this.f15287a.get(g0Var);
                if (h0Var != null) {
                    if (h0Var.f15271a.containsKey(serviceConnection)) {
                        h0Var.f15271a.remove(serviceConnection);
                        if (h0Var.f15271a.isEmpty()) {
                            this.f15289c.sendMessageDelayed(this.f15289c.obtainMessage(0, g0Var), this.e);
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
