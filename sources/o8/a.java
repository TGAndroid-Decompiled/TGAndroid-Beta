package o8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
public final class a extends g0 {
    public final IBinder h;
    public final hf.a f16447n;

    public a(hf.a aVar, IBinder iBinder) {
        this.h = iBinder;
        this.f16447n = aVar;
    }

    @Override
    public final void b() {
        c cVar = (c) this.f16447n.f7049b;
        cVar.f16460n = (IInterface) cVar.f16455i.a(this.h);
        f0 f0Var = cVar.f16451b;
        int i10 = 0;
        f0Var.b("linkToDeath", new Object[0]);
        try {
            cVar.f16460n.asBinder().linkToDeath(cVar.f16457k, 0);
        } catch (RemoteException e) {
            f0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        cVar.f16454g = false;
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
