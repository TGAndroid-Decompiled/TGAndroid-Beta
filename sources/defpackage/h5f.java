package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
public final class h5f implements ServiceConnection {
    public final HashMap a = new HashMap();
    public byte b = 2;
    public boolean c;
    public IBinder d;
    public final x2f e;
    public ComponentName f;
    public final j9f h;

    public h5f(j9f j9fVar, x2f x2fVar) {
        this.h = j9fVar;
        this.e = x2fVar;
    }

    public final ds2 a(String str) {
        try {
            Intent a = z6d.a(this.h.b, this.e);
            this.b = (byte) 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(hhd.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                j9f j9fVar = this.h;
                qx4 qx4Var = j9fVar.d;
                Context context = j9fVar.b;
                x2f x2fVar = this.e;
                boolean N = qx4Var.N(context, str, a, this, 4225);
                this.c = N;
                if (N) {
                    j9fVar.c.sendMessageDelayed(j9fVar.c.obtainMessage(1, x2fVar), j9fVar.f);
                    return ds2.f;
                }
                this.b = (byte) 2;
                try {
                    j9fVar.d.M(j9fVar.b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new ds2(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (o6d e) {
            return e.a;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j9f j9fVar = this.h;
        synchronized (j9fVar.a) {
            j9fVar.c.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.b = (byte) 1;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        j9f j9fVar = this.h;
        synchronized (j9fVar.a) {
            j9fVar.c.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.b = (byte) 2;
        }
    }
}
