package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class fzc extends s0d {
    public final IBinder h;
    public final b5a n;

    public fzc(b5a b5aVar, IBinder iBinder) {
        this.h = iBinder;
        this.n = b5aVar;
    }

    @Override
    public final void b() {
        hzc hzcVar = (hzc) this.n.b;
        hzcVar.n = (IInterface) hzcVar.i.a(this.h);
        q0d q0dVar = hzcVar.b;
        int i = 0;
        q0dVar.b("linkToDeath", new Object[0]);
        try {
            hzcVar.n.asBinder().linkToDeath(hzcVar.k, 0);
        } catch (RemoteException e) {
            q0dVar.a(e, "linkToDeath failed", new Object[0]);
        }
        hzcVar.g = false;
        ArrayList arrayList = hzcVar.d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        hzcVar.d.clear();
    }
}
