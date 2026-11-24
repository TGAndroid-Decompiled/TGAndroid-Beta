package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
public final class j9f {
    public static final Object g = new Object();
    public static j9f h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile o59 c;
    public final qx4 d;
    public final short e;
    public final int f;

    public j9f(Context context, Looper looper) {
        f5f f5fVar = new f5f(this, (byte) 1);
        this.b = context.getApplicationContext();
        ?? handler = new Handler(looper, f5fVar);
        Looper.getMainLooper();
        this.c = handler;
        this.d = qx4.H();
        this.e = (short) 5000;
        this.f = 300000;
    }

    public static HandlerThread a() {
        synchronized (g) {
            HandlerThread handlerThread = i;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            i = handlerThread2;
            handlerThread2.start();
            return i;
        }
    }

    public final ds2 b(x2f x2fVar, ntd ntdVar, String str) {
        ds2 ds2Var;
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            h5f h5fVar = (h5f) hashMap.get(x2fVar);
            if (h5fVar == null) {
                h5fVar = new h5f(this, x2fVar);
                h5fVar.a.put(ntdVar, ntdVar);
                ds2Var = h5fVar.a(str);
                hashMap.put(x2fVar, h5fVar);
            } else {
                this.c.removeMessages(0, x2fVar);
                if (!h5fVar.a.containsKey(ntdVar)) {
                    h5fVar.a.put(ntdVar, ntdVar);
                    byte b = h5fVar.b;
                    if (b != 1) {
                        if (b == 2) {
                            ds2Var = h5fVar.a(str);
                        }
                    } else {
                        ntdVar.onServiceConnected(h5fVar.f, h5fVar.d);
                    }
                    ds2Var = null;
                } else {
                    String x2fVar2 = x2fVar.toString();
                    StringBuilder sb = new StringBuilder(x2fVar2.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(x2fVar2);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (h5fVar.c) {
                return ds2.f;
            }
            if (ds2Var == null) {
                ds2Var = new ds2(-1, null, null);
            }
            return ds2Var;
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        x2f x2fVar = new x2f(str, str2, z);
        fre.i(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            h5f h5fVar = (h5f) hashMap.get(x2fVar);
            if (h5fVar != null) {
                if (h5fVar.a.containsKey(serviceConnection)) {
                    h5fVar.a.remove(serviceConnection);
                    if (h5fVar.a.isEmpty()) {
                        this.c.sendMessageDelayed(this.c.obtainMessage(0, x2fVar), this.e);
                    }
                } else {
                    String x2fVar2 = x2fVar.toString();
                    StringBuilder sb = new StringBuilder(x2fVar2.length() + 76);
                    sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb.append(x2fVar2);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                String x2fVar3 = x2fVar.toString();
                StringBuilder sb2 = new StringBuilder(x2fVar3.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(x2fVar3);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
