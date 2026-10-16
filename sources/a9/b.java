package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class b extends k0 {
    public final IBinder h;
    public final d f321n;

    public b(d dVar, IBinder iBinder) {
        this.h = iBinder;
        this.f321n = dVar;
    }

    @Override
    public final void b() {
        e eVar = (e) this.f321n.f324b;
        eVar.f337n = (IInterface) eVar.f332i.a(this.h);
        j0 j0Var = eVar.f328b;
        int i10 = 0;
        j0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.f337n.asBinder().linkToDeath(eVar.f334k, 0);
        } catch (RemoteException e) {
            j0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        eVar.f331g = false;
        ArrayList arrayList = eVar.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        eVar.d.clear();
    }
}
