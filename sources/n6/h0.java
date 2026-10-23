package n6;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class h0 implements ServiceConnection {
    public final HashMap f17256a = new HashMap();
    public int f17257b = 2;
    public boolean f17258c;
    public IBinder d;
    public final g0 e;
    public ComponentName f17259f;
    public final j0 h;

    public h0(j0 j0Var, g0 g0Var) {
        this.h = j0Var;
        this.e = g0Var;
    }

    public static k6.a a(h0 h0Var, String str, Executor executor) {
        try {
            Intent a2 = h0Var.e.a(h0Var.h.f17273b);
            h0Var.f17257b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(u6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                j0 j0Var = h0Var.h;
                boolean c10 = j0Var.d.c(j0Var.f17273b, str, a2, h0Var, 4225, executor);
                h0Var.f17258c = c10;
                if (c10) {
                    h0Var.h.f17274c.sendMessageDelayed(h0Var.h.f17274c.obtainMessage(1, h0Var.e), h0Var.h.f17275f);
                    k6.a aVar = k6.a.e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar;
                }
                h0Var.f17257b = 2;
                try {
                    j0 j0Var2 = h0Var.h;
                    j0Var2.d.b(j0Var2.f17273b, h0Var);
                } catch (IllegalArgumentException unused) {
                }
                k6.a aVar2 = new k6.a(16);
                StrictMode.setVmPolicy(vmPolicy);
                return aVar2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (z e) {
            return e.f17315a;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.h.f17272a) {
            try {
                this.h.f17274c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f17259f = componentName;
                for (ServiceConnection serviceConnection : this.f17256a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f17257b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.h.f17272a) {
            try {
                this.h.f17274c.removeMessages(1, this.e);
                this.d = null;
                this.f17259f = componentName;
                for (ServiceConnection serviceConnection : this.f17256a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f17257b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
