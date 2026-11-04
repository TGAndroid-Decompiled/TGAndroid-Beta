package ja;

import dd.k;
import hd.j;
import java.util.Set;
import l1.f1;
import od.l;
import od.p;
import wd.z;
public final class b extends j implements p {
    public final int f16226a;
    public Object f16227b;
    public final Object f16228c;

    public b(Object obj, fd.c cVar, int i3) {
        super(2, cVar);
        this.f16226a = i3;
        this.f16228c = obj;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.f16226a) {
            case 0:
                b bVar = new b((l) this.f16228c, cVar, 0);
                bVar.f16227b = obj;
                return bVar;
            case 1:
                b bVar2 = new b((f1) this.f16228c, cVar, 1);
                bVar2.f16227b = obj;
                return bVar2;
            case 2:
                b bVar3 = new b((Set) this.f16228c, cVar, 2);
                bVar3.f16227b = obj;
                return bVar3;
            default:
                b bVar4 = new b((androidx.activity.d) this.f16228c, cVar, 3);
                bVar4.f16227b = obj;
                return bVar4;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16226a) {
            case 0:
                k kVar = k.f8801a;
                ((b) create((p1.b) obj, (fd.c) obj2)).invokeSuspend(kVar);
                return kVar;
            case 1:
                return ((b) create((f1) obj, (fd.c) obj2)).invokeSuspend(k.f8801a);
            case 2:
                return ((b) create((p1.b) obj, (fd.c) obj2)).invokeSuspend(k.f8801a);
            default:
                k kVar2 = k.f8801a;
                ((b) create((z) obj, (fd.c) obj2)).invokeSuspend(kVar2);
                return kVar2;
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: ja.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
