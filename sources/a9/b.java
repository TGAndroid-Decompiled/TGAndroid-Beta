package a9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class b extends k0 {
    public final IBinder h;
    public final d f315n;

    public b(d dVar, IBinder iBinder) {
        this.h = iBinder;
        this.f315n = dVar;
    }

    @Override
    public final void b() {
        e eVar = (e) this.f315n.f318b;
        eVar.f331n = (IInterface) eVar.f326i.a(this.h);
        j0 j0Var = eVar.f322b;
        int i10 = 0;
        j0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.f331n.asBinder().linkToDeath(eVar.f328k, 0);
        } catch (RemoteException e) {
            j0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        eVar.f325g = false;
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
