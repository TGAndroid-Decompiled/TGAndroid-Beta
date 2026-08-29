package m8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class a extends h0 {
    public final IBinder h;
    public final gf.a f16888n;

    public a(gf.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.f16888n = aVar;
    }

    @Override
    public final void b() {
        c cVar = (c) this.f16888n.f7275b;
        cVar.f16903n = (IInterface) cVar.f16898i.a(this.h);
        g0 g0Var = cVar.f16893b;
        int i10 = 0;
        g0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.f16903n.asBinder().linkToDeath(cVar.f16900k, 0);
        } catch (RemoteException e10) {
            g0Var.a(e10, "linkToDeath failed", new Object[0]);
        }
        cVar.f16897g = false;
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
