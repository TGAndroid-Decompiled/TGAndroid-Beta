package o8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class a extends g0 {
    public final IBinder h;
    public final jf.a f16623n;

    public a(jf.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.f16623n = aVar;
    }

    @Override
    public final void b() {
        c cVar = (c) this.f16623n.f10005b;
        cVar.f16637n = (IInterface) cVar.f16632i.a(this.h);
        f0 f0Var = cVar.f16627b;
        int i10 = 0;
        f0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.f16637n.asBinder().linkToDeath(cVar.f16634k, 0);
        } catch (RemoteException e6) {
            f0Var.a(e6, "linkToDeath failed", new Object[0]);
        }
        cVar.f16631g = false;
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
