package n6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class c0 implements ServiceConnection {
    public final int f13559a;
    public final g f13560b;

    public c0(g gVar, int i10) {
        this.f13560b = gVar;
        this.f13559a = i10;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y yVar;
        g gVar = this.f13560b;
        if (iBinder == null) {
            g.E(gVar);
            return;
        }
        synchronized (gVar.f13591y) {
            try {
                g gVar2 = this.f13560b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof y)) {
                    yVar = (y) queryLocalInterface;
                } else {
                    yVar = new y(iBinder);
                }
                gVar2.D = yVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar3 = this.f13560b;
        int i10 = this.f13559a;
        e0 e0Var = new e0(gVar3, 0, null);
        a0 a0Var = gVar3.f13589w;
        a0Var.sendMessage(a0Var.obtainMessage(7, i10, -1, e0Var));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar;
        synchronized (this.f13560b.f13591y) {
            gVar = this.f13560b;
            gVar.D = null;
        }
        int i10 = this.f13559a;
        a0 a0Var = gVar.f13589w;
        a0Var.sendMessage(a0Var.obtainMessage(6, i10, 1));
    }
}
