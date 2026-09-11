package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class b extends j0 {
    public final IBinder h;
    public final d f326n;

    public b(d dVar, IBinder iBinder) {
        this.h = iBinder;
        this.f326n = dVar;
    }

    @Override
    public final void b() {
        e eVar = (e) this.f326n.f330b;
        eVar.f343n = (IInterface) eVar.f338i.a(this.h);
        i0 i0Var = eVar.f333b;
        int i10 = 0;
        i0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.f343n.asBinder().linkToDeath(eVar.f340k, 0);
        } catch (RemoteException e7) {
            i0Var.a(e7, "linkToDeath failed", new Object[0]);
        }
        eVar.f337g = false;
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
