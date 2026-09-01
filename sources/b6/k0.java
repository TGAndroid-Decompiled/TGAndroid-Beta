package b6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
public final class k0 {
    public static final Object f1749g = new Object();
    public static k0 h;
    public static HandlerThread f1750i;
    public final HashMap f1751a = new HashMap();
    public final Context f1752b;
    public volatile a7.e f1753c;
    public final h6.a d;
    public final long f1754e;
    public final long f1755f;

    public k0(Context context, Looper looper) {
        j0 j0Var = new j0(this);
        this.f1752b = context.getApplicationContext();
        ?? handler = new Handler(looper, j0Var);
        Looper.getMainLooper();
        this.f1753c = handler;
        this.d = h6.a.a();
        this.f1754e = 5000L;
        this.f1755f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f1749g) {
            try {
                HandlerThread handlerThread = f1750i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f1750i = handlerThread2;
                handlerThread2.start();
                return f1750i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final y5.a b(h0 h0Var, d0 d0Var, String str) {
        synchronized (this.f1751a) {
            try {
                i0 i0Var = (i0) this.f1751a.get(h0Var);
                y5.a aVar = null;
                if (i0Var == null) {
                    i0Var = new i0(this, h0Var);
                    i0Var.f1733a.put(d0Var, d0Var);
                    aVar = i0.a(i0Var, str, null);
                    this.f1751a.put(h0Var, i0Var);
                } else {
                    this.f1753c.removeMessages(0, h0Var);
                    if (!i0Var.f1733a.containsKey(d0Var)) {
                        i0Var.f1733a.put(d0Var, d0Var);
                        int i10 = i0Var.f1734b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                aVar = i0.a(i0Var, str, null);
                            }
                        } else {
                            d0Var.onServiceConnected(i0Var.f1737f, i0Var.d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(h0Var.toString()));
                    }
                }
                if (i0Var.f1735c) {
                    return y5.a.f50757e;
                }
                if (aVar == null) {
                    aVar = new y5.a(-1);
                }
                return aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z4) {
        h0 h0Var = new h0(str, str2, z4);
        m.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1751a) {
            try {
                i0 i0Var = (i0) this.f1751a.get(h0Var);
                if (i0Var != null) {
                    if (i0Var.f1733a.containsKey(serviceConnection)) {
                        i0Var.f1733a.remove(serviceConnection);
                        if (i0Var.f1733a.isEmpty()) {
                            this.f1753c.sendMessageDelayed(this.f1753c.obtainMessage(0, h0Var), this.f1754e);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(h0Var.toString()));
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(h0Var.toString()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
