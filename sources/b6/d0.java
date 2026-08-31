package b6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
public final class d0 implements ServiceConnection {
    public final int f1693a;
    public final g f1694b;

    public d0(g gVar, int i10) {
        this.f1694b = gVar;
        this.f1693a = i10;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        z zVar;
        g gVar = this.f1694b;
        if (iBinder == null) {
            g.D(gVar);
            return;
        }
        synchronized (gVar.f1722x) {
            try {
                g gVar2 = this.f1694b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof z)) {
                    zVar = (z) queryLocalInterface;
                } else {
                    zVar = new z(iBinder);
                }
                gVar2.f1723y = zVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar3 = this.f1694b;
        int i10 = this.f1693a;
        f0 f0Var = new f0(gVar3, 0, null);
        b0 b0Var = gVar3.v;
        b0Var.sendMessage(b0Var.obtainMessage(7, i10, -1, f0Var));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        g gVar;
        synchronized (this.f1694b.f1722x) {
            gVar = this.f1694b;
            gVar.f1723y = null;
        }
        int i10 = this.f1693a;
        b0 b0Var = gVar.v;
        b0Var.sendMessage(b0Var.obtainMessage(6, i10, 1));
    }
}
