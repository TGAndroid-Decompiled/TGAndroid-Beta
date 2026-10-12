package n6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
public final class k0 {
    public static final Object f16114g = new Object();
    public static k0 h;
    public static HandlerThread f16115i;
    public final HashMap f16116a = new HashMap();
    public final Context f16117b;
    public volatile com.google.android.gms.internal.cast.a0 f16118c;
    public final t6.a d;
    public final long e;
    public final long f16119f;

    public k0(Context context, Looper looper) {
        j0 j0Var = new j0(this);
        this.f16117b = context.getApplicationContext();
        ?? handler = new Handler(looper, j0Var);
        Looper.getMainLooper();
        this.f16118c = handler;
        this.d = t6.a.a();
        this.e = 5000L;
        this.f16119f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f16114g) {
            try {
                HandlerThread handlerThread = f16115i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f16115i = handlerThread2;
                handlerThread2.start();
                return f16115i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final k6.a b(h0 h0Var, d0 d0Var, String str) {
        synchronized (this.f16116a) {
            try {
                i0 i0Var = (i0) this.f16116a.get(h0Var);
                k6.a aVar = null;
                if (i0Var == null) {
                    i0Var = new i0(this, h0Var);
                    i0Var.f16103a.put(d0Var, d0Var);
                    aVar = i0.a(i0Var, str, null);
                    this.f16116a.put(h0Var, i0Var);
                } else {
                    this.f16118c.removeMessages(0, h0Var);
                    if (!i0Var.f16103a.containsKey(d0Var)) {
                        i0Var.f16103a.put(d0Var, d0Var);
                        int i10 = i0Var.f16104b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                aVar = i0.a(i0Var, str, null);
                            }
                        } else {
                            d0Var.onServiceConnected(i0Var.f16106f, i0Var.d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(h0Var.toString()));
                    }
                }
                if (i0Var.f16105c) {
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
        h0 h0Var = new h0(str, str2, z10);
        l.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f16116a) {
            try {
                i0 i0Var = (i0) this.f16116a.get(h0Var);
                if (i0Var != null) {
                    if (i0Var.f16103a.containsKey(serviceConnection)) {
                        i0Var.f16103a.remove(serviceConnection);
                        if (i0Var.f16103a.isEmpty()) {
                            this.f16118c.sendMessageDelayed(this.f16118c.obtainMessage(0, h0Var), this.e);
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
