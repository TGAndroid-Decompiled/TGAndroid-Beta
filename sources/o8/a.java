package o8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class a extends g0 {
    public final IBinder h;
    public final jf.a f16465n;

    public a(jf.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.f16465n = aVar;
    }

    @Override
    public final void b() {
        c cVar = (c) this.f16465n.f9369b;
        cVar.f16478n = (IInterface) cVar.f16473i.a(this.h);
        f0 f0Var = cVar.f16469b;
        int i10 = 0;
        f0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.f16478n.asBinder().linkToDeath(cVar.f16475k, 0);
        } catch (RemoteException e) {
            f0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        cVar.f16472g = false;
        ArrayList arrayList = cVar.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        cVar.d.clear();
    }
}
