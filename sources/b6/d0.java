package b6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class d0 implements ServiceConnection {
    public final int f1566a;
    public final g f1567b;

    public d0(g gVar, int i10) {
        this.f1567b = gVar;
        this.f1566a = i10;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        z zVar;
        g gVar = this.f1567b;
        if (iBinder == null) {
            g.D(gVar);
            return;
        }
        synchronized (gVar.f1592x) {
            try {
                g gVar2 = this.f1567b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof z)) {
                    zVar = (z) queryLocalInterface;
                } else {
                    zVar = new z(iBinder);
                }
                gVar2.f1593y = zVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar3 = this.f1567b;
        int i10 = this.f1566a;
        f0 f0Var = new f0(gVar3, 0, null);
        b0 b0Var = gVar3.v;
        b0Var.sendMessage(b0Var.obtainMessage(7, i10, -1, f0Var));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar;
        synchronized (this.f1567b.f1592x) {
            gVar = this.f1567b;
            gVar.f1593y = null;
        }
        int i10 = this.f1566a;
        b0 b0Var = gVar.v;
        b0Var.sendMessage(b0Var.obtainMessage(6, i10, 1));
    }
}
