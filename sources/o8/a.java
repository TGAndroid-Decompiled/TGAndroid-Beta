package o8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class a extends g0 {
    public final IBinder h;
    public final jf.a f16625n;

    public a(jf.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.f16625n = aVar;
    }

    @Override
    public final void b() {
        c cVar = (c) this.f16625n.f10005b;
        cVar.f16639n = (IInterface) cVar.f16634i.a(this.h);
        f0 f0Var = cVar.f16629b;
        int i10 = 0;
        f0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.f16639n.asBinder().linkToDeath(cVar.f16636k, 0);
        } catch (RemoteException e6) {
            f0Var.a(e6, "linkToDeath failed", new Object[0]);
        }
        cVar.f16633g = false;
        ArrayList arrayList = cVar.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        cVar.d.clear();
    }
}
