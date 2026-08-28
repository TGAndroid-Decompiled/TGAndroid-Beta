package k8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class a extends h0 {
    public final IBinder h;
    public final df.a f14667n;

    public a(df.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.f14667n = aVar;
    }

    @Override
    public final void b() {
        c cVar = (c) this.f14667n.f4482b;
        cVar.f14682n = (IInterface) cVar.f14677i.a(this.h);
        g0 g0Var = cVar.f14672b;
        int i9 = 0;
        g0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.f14682n.asBinder().linkToDeath(cVar.f14679k, 0);
        } catch (RemoteException e10) {
            g0Var.a(e10, "linkToDeath failed", new Object[0]);
        }
        cVar.f14676g = false;
        ArrayList arrayList = cVar.d;
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((Runnable) obj).run();
        }
        cVar.d.clear();
    }
}
