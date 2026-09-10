package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class b extends k0 {
    public final IBinder h;
    public final d f313n;

    public b(d dVar, IBinder iBinder) {
        this.h = iBinder;
        this.f313n = dVar;
    }

    @Override
    public final void b() {
        e eVar = (e) this.f313n.f316b;
        eVar.f329n = (IInterface) eVar.f324i.a(this.h);
        j0 j0Var = eVar.f320b;
        int i10 = 0;
        j0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.f329n.asBinder().linkToDeath(eVar.f326k, 0);
        } catch (RemoteException e) {
            j0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        eVar.f323g = false;
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
