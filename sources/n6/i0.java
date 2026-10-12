package n6;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class i0 implements ServiceConnection {
    public final HashMap f16103a = new HashMap();
    public int f16104b = 2;
    public boolean f16105c;
    public IBinder d;
    public final h0 e;
    public ComponentName f16106f;
    public final k0 h;

    public i0(k0 k0Var, h0 h0Var) {
        this.h = k0Var;
        this.e = h0Var;
    }

    public static k6.a a(i0 i0Var, String str, Executor executor) {
        try {
            Intent a2 = i0Var.e.a(i0Var.h.f16117b);
            i0Var.f16104b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(u6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                k0 k0Var = i0Var.h;
                boolean c10 = k0Var.d.c(k0Var.f16117b, str, a2, i0Var, 4225, executor);
                i0Var.f16105c = c10;
                if (c10) {
                    i0Var.h.f16118c.sendMessageDelayed(i0Var.h.f16118c.obtainMessage(1, i0Var.e), i0Var.h.f16119f);
                    k6.a aVar = k6.a.e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar;
                }
                i0Var.f16104b = 2;
                try {
                    k0 k0Var2 = i0Var.h;
                    k0Var2.d.b(k0Var2.f16117b, i0Var);
                } catch (IllegalArgumentException unused) {
                }
                k6.a aVar2 = new k6.a(16);
                StrictMode.setVmPolicy(vmPolicy);
                return aVar2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (a0 e) {
            return e.f16059a;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.h.f16116a) {
            try {
                this.h.f16118c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f16106f = componentName;
                for (ServiceConnection serviceConnection : this.f16103a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f16104b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.h.f16116a) {
            try {
                this.h.f16118c.removeMessages(1, this.e);
                this.d = null;
                this.f16106f = componentName;
                for (ServiceConnection serviceConnection : this.f16103a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f16104b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
