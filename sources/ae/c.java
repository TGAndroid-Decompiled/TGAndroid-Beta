package ae;

import java.io.File;
import l1.b0;
import wd.z;
public final class c extends hd.j implements od.p {
    public final int f387a;
    public int f388b;
    public Object f389c;
    public Object d;
    public final Object f390e;

    public c(ja.d dVar, p1.e eVar, Long l10, fd.c cVar) {
        super(2, cVar);
        this.f387a = 2;
        this.f389c = dVar;
        this.d = eVar;
        this.f390e = l10;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.f387a) {
            case 0:
                c cVar2 = new c((zd.c) this.d, (e) this.f390e, cVar);
                cVar2.f389c = obj;
                return cVar2;
            case 1:
                return new c((ja.d) this.d, (p1.e) this.f390e, this.f389c, cVar);
            case 2:
                return new c((ja.d) this.f389c, (p1.e) this.d, (Long) this.f390e, cVar);
            case 3:
                c cVar3 = new c((b0) this.f390e, cVar, 3);
                cVar3.f389c = obj;
                return cVar3;
            case 4:
                c cVar4 = new c((b0) this.d, (od.p) ((hd.j) this.f390e), cVar);
                cVar4.f389c = obj;
                return cVar4;
            default:
                c cVar5 = new c((File) this.f390e, cVar, 5);
                cVar5.f389c = obj;
                return cVar5;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f387a) {
            case 0:
                return ((c) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 1:
                return ((c) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 2:
                return ((c) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 3:
                return ((c) create((zd.c) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 4:
                return ((c) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            default:
                return ((c) create((yd.p) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: ae.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public c(ja.d dVar, p1.e eVar, Object obj, fd.c cVar) {
        super(2, cVar);
        this.f387a = 1;
        this.d = dVar;
        this.f390e = eVar;
        this.f389c = obj;
    }

    public c(Object obj, fd.c cVar, int i3) {
        super(2, cVar);
        this.f387a = i3;
        this.f390e = obj;
    }

    public c(b0 b0Var, od.p pVar, fd.c cVar) {
        super(2, cVar);
        this.f387a = 4;
        this.d = b0Var;
        this.f390e = (hd.j) pVar;
    }

    public c(zd.c cVar, e eVar, fd.c cVar2) {
        super(2, cVar2);
        this.f387a = 0;
        this.d = cVar;
        this.f390e = eVar;
    }
}
