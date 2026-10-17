package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class b extends k0 {
    public final IBinder h;
    public final d f320n;

    public b(d dVar, IBinder iBinder) {
        this.h = iBinder;
        this.f320n = dVar;
    }

    @Override
    public final void b() {
        e eVar = (e) this.f320n.f323b;
        eVar.f336n = (IInterface) eVar.f331i.a(this.h);
        j0 j0Var = eVar.f327b;
        int i10 = 0;
        j0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.f336n.asBinder().linkToDeath(eVar.f333k, 0);
        } catch (RemoteException e) {
            j0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        eVar.f330g = false;
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
