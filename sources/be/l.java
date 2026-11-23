package be;

import gb.d1;
import gb.j0;
import gb.w0;
import java.util.List;
import m1.b0;
import m1.n0;
import org.json.JSONObject;
import zd.z;
public final class l extends kd.j implements rd.p {
    public final int f3194a;
    public int f3195b;
    public Object f3196c;
    public final Object d;

    public l(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.f3194a = i7;
        this.d = obj;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f3194a) {
            case 0:
                l lVar = new l((u) this.d, cVar, 0);
                lVar.f3196c = obj;
                return lVar;
            case 1:
                l lVar2 = new l((ce.b) this.d, cVar, 1);
                lVar2.f3196c = obj;
                return lVar2;
            case 2:
                l lVar3 = new l((ce.b) this.d, cVar, 2);
                lVar3.f3196c = obj;
                return lVar3;
            case 3:
                l lVar4 = new l((ce.d) this.d, cVar, 3);
                lVar4.f3196c = obj;
                return lVar4;
            case 4:
                return new l((gb.n) this.f3196c, (w0) this.d, cVar, 4);
            case 5:
                return new l((d1) this.f3196c, (j0) this.d, cVar, 5);
            case 6:
                l lVar5 = new l((jb.d) this.d, cVar, 6);
                lVar5.f3196c = obj;
                return lVar5;
            case 7:
                return new l((ka.d) this.f3196c, (rd.l) this.d, cVar, 7);
            case 8:
                l lVar6 = new l((List) this.d, cVar, 8);
                lVar6.f3196c = obj;
                return lVar6;
            case 9:
                return new l((rd.p) ((kd.j) this.f3196c), (m1.c) this.d, cVar);
            case 10:
                l lVar7 = new l((b0) this.d, cVar, 10);
                lVar7.f3196c = obj;
                return lVar7;
            default:
                return new l((xi.e) this.d, cVar, 11);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3194a) {
            case 0:
                return ((l) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            case 1:
                return ((l) create((s) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            case 2:
                return ((l) create((ce.d) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            case 3:
                return ((l) create(obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            case 4:
                return ((l) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            case 5:
                return ((l) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            case 6:
                return ((l) create((JSONObject) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            case 7:
                return ((l) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            case 8:
                return ((l) create((m1.j) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            case 9:
                return ((l) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            case 10:
                return ((l) create((n0) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
            default:
                return ((l) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        throw new UnsupportedOperationException("Method not decompiled: be.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public l(Object obj, Object obj2, id.c cVar, int i7) {
        super(2, cVar);
        this.f3194a = i7;
        this.f3196c = obj;
        this.d = obj2;
    }

    public l(rd.p pVar, m1.c cVar, id.c cVar2) {
        super(2, cVar2);
        this.f3194a = 9;
        this.f3196c = (kd.j) pVar;
        this.d = cVar;
    }
}
