package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class b extends k0 {
    public final IBinder h;
    public final d f340n;

    public b(d dVar, IBinder iBinder) {
        this.h = iBinder;
        this.f340n = dVar;
    }

    @Override
    public final void b() {
        e eVar = (e) this.f340n.f343b;
        eVar.f357n = (IInterface) eVar.f352i.a(this.h);
        j0 j0Var = eVar.f347b;
        int i10 = 0;
        j0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.f357n.asBinder().linkToDeath(eVar.f354k, 0);
        } catch (RemoteException e7) {
            j0Var.a(e7, "linkToDeath failed", new Object[0]);
        }
        eVar.f351g = false;
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
