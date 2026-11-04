package c9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class a extends h0 {
    public final IBinder h;
    public final bg.a f4243n;

    public a(bg.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.f4243n = aVar;
    }

    @Override
    public final void b() {
        c cVar = (c) this.f4243n.f3297b;
        cVar.f4258n = (IInterface) cVar.f4253i.a(this.h);
        g0 g0Var = cVar.f4248b;
        int i3 = 0;
        g0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.f4258n.asBinder().linkToDeath(cVar.f4255k, 0);
        } catch (RemoteException e10) {
            g0Var.a(e10, "linkToDeath failed", new Object[0]);
        }
        cVar.f4252g = false;
        ArrayList arrayList = cVar.d;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((Runnable) obj).run();
        }
        cVar.d.clear();
    }
}
