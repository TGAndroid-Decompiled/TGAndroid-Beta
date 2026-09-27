package n6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class c0 implements ServiceConnection {
    public final int f15270a;
    public final g f15271b;

    public c0(g gVar, int i10) {
        this.f15271b = gVar;
        this.f15270a = i10;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y yVar;
        g gVar = this.f15271b;
        if (iBinder == null) {
            g.D(gVar);
            return;
        }
        synchronized (gVar.f15301x) {
            try {
                g gVar2 = this.f15271b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof y)) {
                    yVar = (y) queryLocalInterface;
                } else {
                    yVar = new y(iBinder);
                }
                gVar2.f15302y = yVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar3 = this.f15271b;
        int i10 = this.f15270a;
        e0 e0Var = new e0(gVar3, 0, null);
        a0 a0Var = gVar3.v;
        a0Var.sendMessage(a0Var.obtainMessage(7, i10, -1, e0Var));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar;
        synchronized (this.f15271b.f15301x) {
            gVar = this.f15271b;
            gVar.f15302y = null;
        }
        int i10 = this.f15270a;
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(6, i10, 1));
    }
}
