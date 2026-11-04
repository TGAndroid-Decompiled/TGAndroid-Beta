package ae;

import db.e1;
import db.j0;
import db.x0;
import java.util.List;
import l1.b0;
import l1.n0;
import org.json.JSONObject;
import wd.z;
import yd.r;
public final class d extends hd.j implements od.p {
    public final int f391a;
    public int f392b;
    public Object f393c;
    public final Object d;

    public d(Object obj, fd.c cVar, int i3) {
        super(2, cVar);
        this.f391a = i3;
        this.d = obj;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.f391a) {
            case 0:
                d dVar = new d((e) this.d, cVar, 0);
                dVar.f393c = obj;
                return dVar;
            case 1:
                d dVar2 = new d((e) this.d, cVar, 1);
                dVar2.f393c = obj;
                return dVar2;
            case 2:
                d dVar3 = new d((zd.c) this.d, cVar, 2);
                dVar3.f393c = obj;
                return dVar3;
            case 3:
                return new d((db.n) this.f393c, (x0) this.d, cVar, 3);
            case 4:
                return new d((e1) this.f393c, (j0) this.d, cVar, 4);
            case 5:
                d dVar4 = new d((gb.d) this.d, cVar, 5);
                dVar4.f393c = obj;
                return dVar4;
            case 6:
                return new d((ja.d) this.f393c, (od.l) this.d, cVar, 6);
            case 7:
                d dVar5 = new d((List) this.d, cVar, 7);
                dVar5.f393c = obj;
                return dVar5;
            case 8:
                return new d((od.p) ((hd.j) this.f393c), (l1.c) this.d, cVar);
            case 9:
                d dVar6 = new d((b0) this.d, cVar, 9);
                dVar6.f393c = obj;
                return dVar6;
            case 10:
                return new d((ui.f) this.d, cVar, 10);
            default:
                d dVar7 = new d((r) this.d, cVar, 11);
                dVar7.f393c = obj;
                return dVar7;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f391a) {
            case 0:
                return ((d) create((yd.p) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 1:
                return ((d) create((zd.c) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 2:
                return ((d) create(obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 3:
                return ((d) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 4:
                return ((d) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 5:
                return ((d) create((JSONObject) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 6:
                return ((d) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 7:
                return ((d) create((l1.j) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 8:
                return ((d) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 9:
                return ((d) create((n0) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            case 10:
                return ((d) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
            default:
                return ((d) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: ae.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public d(Object obj, Object obj2, fd.c cVar, int i3) {
        super(2, cVar);
        this.f391a = i3;
        this.f393c = obj;
        this.d = obj2;
    }

    public d(od.p pVar, l1.c cVar, fd.c cVar2) {
        super(2, cVar2);
        this.f391a = 8;
        this.f393c = (hd.j) pVar;
        this.d = cVar;
    }
}
