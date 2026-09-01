package b6;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class i0 implements ServiceConnection {
    public final HashMap f1733a = new HashMap();
    public int f1734b = 2;
    public boolean f1735c;
    public IBinder d;
    public final h0 f1736e;
    public ComponentName f1737f;
    public final k0 h;

    public i0(k0 k0Var, h0 h0Var) {
        this.h = k0Var;
        this.f1736e = h0Var;
    }

    public static y5.a a(i0 i0Var, String str, Executor executor) {
        try {
            Intent a2 = i0Var.f1736e.a(i0Var.h.f1752b);
            i0Var.f1734b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(i6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                k0 k0Var = i0Var.h;
                boolean c3 = k0Var.d.c(k0Var.f1752b, str, a2, i0Var, 4225, executor);
                i0Var.f1735c = c3;
                if (c3) {
                    i0Var.h.f1753c.sendMessageDelayed(i0Var.h.f1753c.obtainMessage(1, i0Var.f1736e), i0Var.h.f1755f);
                    y5.a aVar = y5.a.f50757e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar;
                }
                i0Var.f1734b = 2;
                try {
                    k0 k0Var2 = i0Var.h;
                    k0Var2.d.b(k0Var2.f1752b, i0Var);
                } catch (IllegalArgumentException unused) {
                }
                y5.a aVar2 = new y5.a(16);
                StrictMode.setVmPolicy(vmPolicy);
                return aVar2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (a0 e6) {
            return e6.f1686a;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.h.f1751a) {
            try {
                this.h.f1753c.removeMessages(1, this.f1736e);
                this.d = iBinder;
                this.f1737f = componentName;
                for (ServiceConnection serviceConnection : this.f1733a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f1734b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.h.f1751a) {
            try {
                this.h.f1753c.removeMessages(1, this.f1736e);
                this.d = null;
                this.f1737f = componentName;
                for (ServiceConnection serviceConnection : this.f1733a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f1734b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
