package ka;

import gd.k;
import java.util.Set;
import kd.j;
import m1.e1;
import rd.l;
import rd.p;
import zd.z;
public final class b extends j implements p {
    public final int f17245a;
    public Object f17246b;
    public final Object f17247c;

    public b(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.f17245a = i7;
        this.f17247c = obj;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f17245a) {
            case 0:
                b bVar = new b((l) this.f17247c, cVar, 0);
                bVar.f17246b = obj;
                return bVar;
            case 1:
                b bVar2 = new b((e1) this.f17247c, cVar, 1);
                bVar2.f17246b = obj;
                return bVar2;
            case 2:
                b bVar3 = new b((Set) this.f17247c, cVar, 2);
                bVar3.f17246b = obj;
                return bVar3;
            default:
                b bVar4 = new b((androidx.activity.d) this.f17247c, cVar, 3);
                bVar4.f17246b = obj;
                return bVar4;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17245a) {
            case 0:
                k kVar = k.f13829a;
                ((b) create((q1.b) obj, (id.c) obj2)).invokeSuspend(kVar);
                return kVar;
            case 1:
                return ((b) create((e1) obj, (id.c) obj2)).invokeSuspend(k.f13829a);
            case 2:
                return ((b) create((q1.b) obj, (id.c) obj2)).invokeSuspend(k.f13829a);
            default:
                k kVar2 = k.f13829a;
                ((b) create((z) obj, (id.c) obj2)).invokeSuspend(kVar2);
                return kVar2;
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: ka.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
