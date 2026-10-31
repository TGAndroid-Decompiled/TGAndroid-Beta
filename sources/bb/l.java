package bb;

import java.util.ArrayList;
import java.util.List;
public final class l extends ed.j implements ld.p {
    public final int f2593a;
    public int f2594b;
    public Object f2595c;
    public final Object d;

    public l(Object obj, cd.c cVar, int i10) {
        super(2, cVar);
        this.f2593a = i10;
        this.d = obj;
    }

    @Override
    public final cd.c create(Object obj, cd.c cVar) {
        switch (this.f2593a) {
            case 0:
                return new l((m) this.f2595c, (cd.h) this.d, cVar, 0);
            case 1:
                return new l((c0) this.f2595c, (String) this.d, cVar, 1);
            case 2:
                return new l((ji.f) this.f2595c, (ArrayList) this.d, cVar, 2);
            case 3:
                return new l((db.k) this.d, cVar, 3);
            case 4:
                l lVar = new l((List) this.d, cVar, 4);
                lVar.f2595c = obj;
                return lVar;
            case 5:
                return new l((ji.f) this.d, cVar, 5);
            default:
                return new l((ld.p) this.f2595c, this.d, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2593a) {
            case 0:
                return ((l) create((td.c0) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
            case 1:
                return ((l) create((td.c0) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
            case 2:
                return ((l) create((td.c0) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
            case 3:
                return ((l) create((td.c0) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
            case 4:
                return ((l) create((k1.s) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
            case 5:
                return ((l) create((td.c0) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
            default:
                return ((l) create((td.c0) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        throw new UnsupportedOperationException("Method not decompiled: bb.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public l(Object obj, Object obj2, cd.c cVar, int i10) {
        super(2, cVar);
        this.f2593a = i10;
        this.f2595c = obj;
        this.d = obj2;
    }
}
