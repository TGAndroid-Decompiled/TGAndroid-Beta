package b9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class a extends i0 {
    public final IBinder h;
    public final c f3679n;

    public a(c cVar, IBinder iBinder) {
        this.h = iBinder;
        this.f3679n = cVar;
    }

    @Override
    public final void b() {
        d dVar = (d) this.f3679n.f3683b;
        dVar.f3695n = (IInterface) dVar.f3690i.a(this.h);
        h0 h0Var = dVar.f3686b;
        int i10 = 0;
        h0Var.b("linkToDeath", new Object[0]);
        try {
            dVar.f3695n.asBinder().linkToDeath(dVar.f3692k, 0);
        } catch (RemoteException e) {
            h0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        dVar.f3689g = false;
        ArrayList arrayList = dVar.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        dVar.d.clear();
    }
}
