package l8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

public final class a extends g0 {
    public final IBinder h;

    public final ef.a f15449n;

    public a(ef.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.f15449n = aVar;
    }

    @Override
    public final void b() {
        c cVar = (c) this.f15449n.f5381b;
        cVar.f15463n = (IInterface) cVar.f15458i.a(this.h);
        f0 f0Var = cVar.f15453b;
        int i10 = 0;
        f0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.f15463n.asBinder().linkToDeath(cVar.f15460k, 0);
        } catch (RemoteException e9) {
            f0Var.a(e9, "linkToDeath failed", new Object[0]);
        }
        cVar.f15457g = false;
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
