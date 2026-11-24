package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class g1d extends u2d {
    public final IBinder h;
    public final d7a n;

    public g1d(d7a d7aVar, IBinder iBinder) {
        this.h = iBinder;
        this.n = d7aVar;
    }

    @Override
    public final void b() {
        i1d i1dVar = (i1d) this.n.b;
        i1dVar.n = (IInterface) i1dVar.i.a(this.h);
        s2d s2dVar = i1dVar.b;
        int i = 0;
        s2dVar.b("linkToDeath", new Object[0]);
        try {
            i1dVar.n.asBinder().linkToDeath(i1dVar.k, 0);
        } catch (RemoteException e) {
            s2dVar.a(e, "linkToDeath failed", new Object[0]);
        }
        i1dVar.g = false;
        ArrayList arrayList = i1dVar.d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        i1dVar.d.clear();
    }
}
