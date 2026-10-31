package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class b extends k0 {
    public final IBinder h;
    public final d f319n;

    public b(d dVar, IBinder iBinder) {
        this.h = iBinder;
        this.f319n = dVar;
    }

    @Override
    public final void b() {
        e eVar = (e) this.f319n.f322b;
        eVar.f335n = (IInterface) eVar.f330i.a(this.h);
        j0 j0Var = eVar.f326b;
        int i10 = 0;
        j0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.f335n.asBinder().linkToDeath(eVar.f332k, 0);
        } catch (RemoteException e) {
            j0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        eVar.f329g = false;
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
