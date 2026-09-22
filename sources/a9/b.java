package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class b extends k0 {
    public final IBinder h;
    public final d f314n;

    public b(d dVar, IBinder iBinder) {
        this.h = iBinder;
        this.f314n = dVar;
    }

    @Override
    public final void b() {
        e eVar = (e) this.f314n.f317b;
        eVar.f330n = (IInterface) eVar.f325i.a(this.h);
        j0 j0Var = eVar.f321b;
        int i10 = 0;
        j0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.f330n.asBinder().linkToDeath(eVar.f327k, 0);
        } catch (RemoteException e) {
            j0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        eVar.f324g = false;
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
