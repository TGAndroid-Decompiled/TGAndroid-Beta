package d9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class a extends h0 {
    public final IBinder h;
    public final ag.a f7881n;

    public a(ag.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.f7881n = aVar;
    }

    @Override
    public final void b() {
        c cVar = (c) this.f7881n.f1052b;
        cVar.f7896n = (IInterface) cVar.f7891i.a(this.h);
        g0 g0Var = cVar.f7886b;
        int i7 = 0;
        g0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.f7896n.asBinder().linkToDeath(cVar.f7893k, 0);
        } catch (RemoteException e10) {
            g0Var.a(e10, "linkToDeath failed", new Object[0]);
        }
        cVar.f7890g = false;
        ArrayList arrayList = cVar.d;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
        cVar.d.clear();
    }
}
