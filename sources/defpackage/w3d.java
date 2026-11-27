package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class w3d extends j5d {
    public final IBinder h;
    public final t8a n;

    public w3d(t8a t8aVar, IBinder iBinder) {
        this.h = iBinder;
        this.n = t8aVar;
    }

    @Override
    public final void b() {
        y3d y3dVar = (y3d) this.n.b;
        y3dVar.n = (IInterface) y3dVar.i.a(this.h);
        h5d h5dVar = y3dVar.b;
        int i = 0;
        h5dVar.b("linkToDeath", new Object[0]);
        try {
            y3dVar.n.asBinder().linkToDeath(y3dVar.k, 0);
        } catch (RemoteException e) {
            h5dVar.a(e, "linkToDeath failed", new Object[0]);
        }
        y3dVar.g = false;
        ArrayList arrayList = y3dVar.d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        y3dVar.d.clear();
    }
}
