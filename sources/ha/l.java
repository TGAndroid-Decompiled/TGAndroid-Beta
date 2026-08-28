package ha;

import java.util.ArrayList;
import java.util.List;
public final class l extends sc.i implements zc.p {
    public final int f10339a;
    public int f10340b;
    public Object f10341c;
    public final Object d;

    public l(Object obj, Object obj2, qc.c cVar, int i9) {
        super(2, cVar);
        this.f10339a = i9;
        this.f10341c = obj;
        this.d = obj2;
    }

    @Override
    public final qc.c create(Object obj, qc.c cVar) {
        switch (this.f10339a) {
            case 0:
                return new l((m) this.f10341c, (qc.h) this.d, cVar, 0);
            case 1:
                return new l((c0) this.f10341c, (String) this.d, cVar, 1);
            case 2:
                return new l((com.google.firebase.messaging.t) this.f10341c, (ArrayList) this.d, cVar, 2);
            case 3:
                return new l((ja.k) this.d, cVar, 3);
            case 4:
                l lVar = new l((List) this.d, cVar, 4);
                lVar.f10341c = obj;
                return lVar;
            case 5:
                return new l((com.google.firebase.messaging.t) this.d, cVar, 5);
            default:
                return new l((zc.p) this.f10341c, this.d, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10339a) {
            case 0:
                return ((l) create((hd.c0) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
            case 1:
                return ((l) create((hd.c0) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
            case 2:
                return ((l) create((hd.c0) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
            case 3:
                return ((l) create((hd.c0) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
            case 4:
                return ((l) create((k1.s) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
            case 5:
                return ((l) create((hd.c0) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
            default:
                return ((l) create((hd.c0) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: ha.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public l(Object obj, qc.c cVar, int i9) {
        super(2, cVar);
        this.f10339a = i9;
        this.d = obj;
    }
}
