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
    public final HashMap f15271a = new HashMap();
    public int f15272b = 2;
    public boolean f15273c;
    public IBinder d;
    public final g0 e;
    public ComponentName f15274f;
    public final j0 h;

    public h0(j0 j0Var, g0 g0Var) {
        this.h = j0Var;
        this.e = g0Var;
    }

    public static k6.a a(h0 h0Var, String str, Executor executor) {
        try {
            Intent a2 = h0Var.e.a(h0Var.h.f15288b);
            h0Var.f15272b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(u6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                j0 j0Var = h0Var.h;
                boolean c10 = j0Var.d.c(j0Var.f15288b, str, a2, h0Var, 4225, executor);
                h0Var.f15273c = c10;
                if (c10) {
                    h0Var.h.f15289c.sendMessageDelayed(h0Var.h.f15289c.obtainMessage(1, h0Var.e), h0Var.h.f15290f);
                    k6.a aVar = k6.a.e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar;
                }
                h0Var.f15272b = 2;
                try {
                    j0 j0Var2 = h0Var.h;
                    j0Var2.d.b(j0Var2.f15288b, h0Var);
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
            return e.f15330a;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.h.f15287a) {
            try {
                this.h.f15289c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f15274f = componentName;
                for (ServiceConnection serviceConnection : this.f15271a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f15272b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.h.f15287a) {
            try {
                this.h.f15289c.removeMessages(1, this.e);
                this.d = null;
                this.f15274f = componentName;
                for (ServiceConnection serviceConnection : this.f15271a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f15272b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
