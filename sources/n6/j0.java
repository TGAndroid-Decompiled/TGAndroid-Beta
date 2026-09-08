package n6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
public final class j0 {
    public static final Object f16591g = new Object();
    public static j0 h;
    public static HandlerThread f16592i;
    public final HashMap f16593a = new HashMap();
    public final Context f16594b;
    public volatile com.google.android.gms.internal.cast.c0 f16595c;
    public final t6.a d;
    public final long f16596e;
    public final long f16597f;

    public j0(Context context, Looper looper) {
        i0 i0Var = new i0(this);
        this.f16594b = context.getApplicationContext();
        ?? handler = new Handler(looper, i0Var);
        Looper.getMainLooper();
        this.f16595c = handler;
        this.d = t6.a.a();
        this.f16596e = 5000L;
        this.f16597f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f16591g) {
            try {
                HandlerThread handlerThread = f16592i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f16592i = handlerThread2;
                handlerThread2.start();
                return f16592i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final k6.a b(g0 g0Var, c0 c0Var, String str) {
        synchronized (this.f16593a) {
            try {
                h0 h0Var = (h0) this.f16593a.get(g0Var);
                k6.a aVar = null;
                if (h0Var == null) {
                    h0Var = new h0(this, g0Var);
                    h0Var.f16575a.put(c0Var, c0Var);
                    aVar = h0.a(h0Var, str, null);
                    this.f16593a.put(g0Var, h0Var);
                } else {
                    this.f16595c.removeMessages(0, g0Var);
                    if (!h0Var.f16575a.containsKey(c0Var)) {
                        h0Var.f16575a.put(c0Var, c0Var);
                        int i10 = h0Var.f16576b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                aVar = h0.a(h0Var, str, null);
                            }
                        } else {
                            c0Var.onServiceConnected(h0Var.f16579f, h0Var.d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(g0Var.toString()));
                    }
                }
                if (h0Var.f16577c) {
                    return k6.a.f14830e;
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
        synchronized (this.f16593a) {
            try {
                h0 h0Var = (h0) this.f16593a.get(g0Var);
                if (h0Var != null) {
                    if (h0Var.f16575a.containsKey(serviceConnection)) {
                        h0Var.f16575a.remove(serviceConnection);
                        if (h0Var.f16575a.isEmpty()) {
                            this.f16595c.sendMessageDelayed(this.f16595c.obtainMessage(0, g0Var), this.f16596e);
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
