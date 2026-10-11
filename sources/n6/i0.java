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
    public final HashMap f16715a = new HashMap();
    public int f16716b = 2;
    public boolean f16717c;
    public IBinder d;
    public final h0 f16718e;
    public ComponentName f16719f;
    public final k0 h;

    public i0(k0 k0Var, h0 h0Var) {
        this.h = k0Var;
        this.f16718e = h0Var;
    }

    public static k6.a a(i0 i0Var, String str, Executor executor) {
        try {
            Intent a2 = i0Var.f16718e.a(i0Var.h.f16734b);
            i0Var.f16716b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(u6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                k0 k0Var = i0Var.h;
                boolean c10 = k0Var.d.c(k0Var.f16734b, str, a2, i0Var, 4225, executor);
                i0Var.f16717c = c10;
                if (c10) {
                    i0Var.h.f16735c.sendMessageDelayed(i0Var.h.f16735c.obtainMessage(1, i0Var.f16718e), i0Var.h.f16737f);
                    k6.a aVar = k6.a.f14694e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar;
                }
                i0Var.f16716b = 2;
                try {
                    k0 k0Var2 = i0Var.h;
                    k0Var2.d.b(k0Var2.f16734b, i0Var);
                } catch (IllegalArgumentException unused) {
                }
                k6.a aVar2 = new k6.a(16);
                StrictMode.setVmPolicy(vmPolicy);
                return aVar2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (a0 e7) {
            return e7.f16668a;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.h.f16733a) {
            try {
                this.h.f16735c.removeMessages(1, this.f16718e);
                this.d = iBinder;
                this.f16719f = componentName;
                for (ServiceConnection serviceConnection : this.f16715a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f16716b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.h.f16733a) {
            try {
                this.h.f16735c.removeMessages(1, this.f16718e);
                this.d = null;
                this.f16719f = componentName;
                for (ServiceConnection serviceConnection : this.f16715a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f16716b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
