package n6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
public final class k0 {
    public static final Object f16731g = new Object();
    public static k0 h;
    public static HandlerThread f16732i;
    public final HashMap f16733a = new HashMap();
    public final Context f16734b;
    public volatile com.google.android.gms.internal.cast.a0 f16735c;
    public final t6.a d;
    public final long f16736e;
    public final long f16737f;

    public k0(Context context, Looper looper) {
        j0 j0Var = new j0(this);
        this.f16734b = context.getApplicationContext();
        ?? handler = new Handler(looper, j0Var);
        Looper.getMainLooper();
        this.f16735c = handler;
        this.d = t6.a.a();
        this.f16736e = 5000L;
        this.f16737f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f16731g) {
            try {
                HandlerThread handlerThread = f16732i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f16732i = handlerThread2;
                handlerThread2.start();
                return f16732i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final k6.a b(h0 h0Var, d0 d0Var, String str) {
        synchronized (this.f16733a) {
            try {
                i0 i0Var = (i0) this.f16733a.get(h0Var);
                k6.a aVar = null;
                if (i0Var == null) {
                    i0Var = new i0(this, h0Var);
                    i0Var.f16715a.put(d0Var, d0Var);
                    aVar = i0.a(i0Var, str, null);
                    this.f16733a.put(h0Var, i0Var);
                } else {
                    this.f16735c.removeMessages(0, h0Var);
                    if (!i0Var.f16715a.containsKey(d0Var)) {
                        i0Var.f16715a.put(d0Var, d0Var);
                        int i10 = i0Var.f16716b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                aVar = i0.a(i0Var, str, null);
                            }
                        } else {
                            d0Var.onServiceConnected(i0Var.f16719f, i0Var.d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(h0Var.toString()));
                    }
                }
                if (i0Var.f16717c) {
                    return k6.a.f14694e;
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
        h0 h0Var = new h0(str, str2, z10);
        m.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f16733a) {
            try {
                i0 i0Var = (i0) this.f16733a.get(h0Var);
                if (i0Var != null) {
                    if (i0Var.f16715a.containsKey(serviceConnection)) {
                        i0Var.f16715a.remove(serviceConnection);
                        if (i0Var.f16715a.isEmpty()) {
                            this.f16735c.sendMessageDelayed(this.f16735c.obtainMessage(0, h0Var), this.f16736e);
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
