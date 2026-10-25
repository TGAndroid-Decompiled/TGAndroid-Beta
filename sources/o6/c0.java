package o6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class c0 implements ServiceConnection {
    public final int f19100a;
    public final g f19101b;

    public c0(g gVar, int i10) {
        this.f19101b = gVar;
        this.f19100a = i10;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y yVar;
        g gVar = this.f19101b;
        if (iBinder == null) {
            g.D(gVar);
            return;
        }
        synchronized (gVar.f19131x) {
            try {
                g gVar2 = this.f19101b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof y)) {
                    yVar = (y) queryLocalInterface;
                } else {
                    yVar = new y(iBinder);
                }
                gVar2.f19132y = yVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar3 = this.f19101b;
        int i10 = this.f19100a;
        e0 e0Var = new e0(gVar3, 0, null);
        a0 a0Var = gVar3.v;
        a0Var.sendMessage(a0Var.obtainMessage(7, i10, -1, e0Var));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar;
        synchronized (this.f19101b.f19131x) {
            gVar = this.f19101b;
            gVar.f19132y = null;
        }
        int i10 = this.f19100a;
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(6, i10, 1));
    }
}
