package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
public final class j7f implements ServiceConnection {
    public final HashMap a = new HashMap();
    public byte b = 2;
    public boolean c;
    public IBinder d;
    public final z4f e;
    public ComponentName f;
    public final lbf h;

    public j7f(lbf lbfVar, z4f z4fVar) {
        this.h = lbfVar;
        this.e = z4fVar;
    }

    public final ot2 a(String str) {
        try {
            Intent a = b9d.a(this.h.b, this.e);
            this.b = (byte) 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(ijd.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                lbf lbfVar = this.h;
                sz4 sz4Var = lbfVar.d;
                Context context = lbfVar.b;
                z4f z4fVar = this.e;
                boolean L = sz4Var.L(context, str, a, this, 4225);
                this.c = L;
                if (L) {
                    lbfVar.c.sendMessageDelayed(lbfVar.c.obtainMessage(1, z4fVar), lbfVar.f);
                    return ot2.f;
                }
                this.b = (byte) 2;
                try {
                    lbfVar.d.K(lbfVar.b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new ot2(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (q8d e) {
            return e.a;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        lbf lbfVar = this.h;
        synchronized (lbfVar.a) {
            lbfVar.c.removeMessages(1, this.e);
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
        lbf lbfVar = this.h;
        synchronized (lbfVar.a) {
            lbfVar.c.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.b = (byte) 2;
        }
    }
}
