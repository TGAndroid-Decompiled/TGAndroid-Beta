package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class b extends k0 {
    public final IBinder h;
    public final d f317n;

    public b(d dVar, IBinder iBinder) {
        this.h = iBinder;
        this.f317n = dVar;
    }

    @Override
    public final void b() {
        e eVar = (e) this.f317n.f320b;
        eVar.f333n = (IInterface) eVar.f328i.a(this.h);
        j0 j0Var = eVar.f324b;
        int i10 = 0;
        j0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.f333n.asBinder().linkToDeath(eVar.f330k, 0);
        } catch (RemoteException e) {
            j0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        eVar.f327g = false;
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
