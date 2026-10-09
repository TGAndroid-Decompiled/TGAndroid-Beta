package n6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
public final class k0 {
    public static final Object f16682g = new Object();
    public static k0 h;
    public static HandlerThread f16683i;
    public final HashMap f16684a = new HashMap();
    public final Context f16685b;
    public volatile com.google.android.gms.internal.cast.a0 f16686c;
    public final t6.a d;
    public final long f16687e;
    public final long f16688f;

    public k0(Context context, Looper looper) {
        j0 j0Var = new j0(this);
        this.f16685b = context.getApplicationContext();
        ?? handler = new Handler(looper, j0Var);
        Looper.getMainLooper();
        this.f16686c = handler;
        this.d = t6.a.a();
        this.f16687e = 5000L;
        this.f16688f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f16682g) {
            try {
                HandlerThread handlerThread = f16683i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f16683i = handlerThread2;
                handlerThread2.start();
                return f16683i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final k6.a b(h0 h0Var, d0 d0Var, String str) {
        synchronized (this.f16684a) {
            try {
                i0 i0Var = (i0) this.f16684a.get(h0Var);
                k6.a aVar = null;
                if (i0Var == null) {
                    i0Var = new i0(this, h0Var);
                    i0Var.f16669a.put(d0Var, d0Var);
                    aVar = i0.a(i0Var, str, null);
                    this.f16684a.put(h0Var, i0Var);
                } else {
                    this.f16686c.removeMessages(0, h0Var);
                    if (!i0Var.f16669a.containsKey(d0Var)) {
                        i0Var.f16669a.put(d0Var, d0Var);
                        int i10 = i0Var.f16670b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                aVar = i0.a(i0Var, str, null);
                            }
                        } else {
                            d0Var.onServiceConnected(i0Var.f16673f, i0Var.d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(h0Var.toString()));
                    }
                }
                if (i0Var.f16671c) {
                    return k6.a.f14695e;
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
        synchronized (this.f16684a) {
            try {
                i0 i0Var = (i0) this.f16684a.get(h0Var);
                if (i0Var != null) {
                    if (i0Var.f16669a.containsKey(serviceConnection)) {
                        i0Var.f16669a.remove(serviceConnection);
                        if (i0Var.f16669a.isEmpty()) {
                            this.f16686c.sendMessageDelayed(this.f16686c.obtainMessage(0, h0Var), this.f16687e);
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
