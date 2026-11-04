package gb;

import android.util.Log;
import b8.ib;
import l1.f1;
import l1.l0;
public final class c extends hd.j implements od.p {
    public final int f12203a;
    public Object f12204b;

    public c(int i3, fd.c cVar, int i10) {
        super(i3, cVar);
        this.f12203a = i10;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.f12203a) {
            case 0:
                c cVar2 = new c(2, cVar, 0);
                cVar2.f12204b = obj;
                return cVar2;
            case 1:
                c cVar3 = new c(2, cVar, 1);
                cVar3.f12204b = obj;
                return cVar3;
            default:
                return new c((i) this.f12204b, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12203a) {
            case 0:
                dd.k kVar = dd.k.f8801a;
                ((c) create((String) obj, (fd.c) obj2)).invokeSuspend(kVar);
                return kVar;
            case 1:
                return ((c) create((f1) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            default:
                return ((c) create((i) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f12203a) {
            case 0:
                gd.a aVar = gd.a.f12241a;
                ib.b(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f12204b));
                return dd.k.f8801a;
            case 1:
                gd.a aVar2 = gd.a.f12241a;
                ib.b(obj);
                return Boolean.valueOf(!(((f1) this.f12204b) instanceof l0));
            default:
                gd.a aVar3 = gd.a.f12241a;
                ib.b(obj);
                return (i) this.f12204b;
        }
    }

    public c(i iVar, fd.c cVar) {
        super(2, cVar);
        this.f12203a = 2;
        this.f12204b = iVar;
    }
}
