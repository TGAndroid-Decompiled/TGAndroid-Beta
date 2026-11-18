package d9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class a extends h0 {
    public final IBinder h;
    public final ag.a f7886n;

    public a(ag.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.f7886n = aVar;
    }

    @Override
    public final void b() {
        c cVar = (c) this.f7886n.f1052b;
        cVar.f7901n = (IInterface) cVar.f7896i.a(this.h);
        g0 g0Var = cVar.f7891b;
        int i7 = 0;
        g0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.f7901n.asBinder().linkToDeath(cVar.f7898k, 0);
        } catch (RemoteException e10) {
            g0Var.a(e10, "linkToDeath failed", new Object[0]);
        }
        cVar.f7895g = false;
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
