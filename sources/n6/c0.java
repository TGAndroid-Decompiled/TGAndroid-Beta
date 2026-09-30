package n6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class c0 implements ServiceConnection {
    public final int f15251a;
    public final g f15252b;

    public c0(g gVar, int i10) {
        this.f15252b = gVar;
        this.f15251a = i10;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y yVar;
        g gVar = this.f15252b;
        if (iBinder == null) {
            g.D(gVar);
            return;
        }
        synchronized (gVar.f15282x) {
            try {
                g gVar2 = this.f15252b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof y)) {
                    yVar = (y) queryLocalInterface;
                } else {
                    yVar = new y(iBinder);
                }
                gVar2.f15283y = yVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar3 = this.f15252b;
        int i10 = this.f15251a;
        e0 e0Var = new e0(gVar3, 0, null);
        a0 a0Var = gVar3.v;
        a0Var.sendMessage(a0Var.obtainMessage(7, i10, -1, e0Var));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar;
        synchronized (this.f15252b.f15282x) {
            gVar = this.f15252b;
            gVar.f15283y = null;
        }
        int i10 = this.f15251a;
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(6, i10, 1));
    }
}
