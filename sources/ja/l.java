package ja;

import java.util.ArrayList;
import java.util.List;
public final class l extends uc.i implements bd.p {
    public final int f11374a;
    public int f11375b;
    public Object f11376c;
    public final Object d;

    public l(Object obj, Object obj2, sc.c cVar, int i10) {
        super(2, cVar);
        this.f11374a = i10;
        this.f11376c = obj;
        this.d = obj2;
    }

    @Override
    public final sc.c create(Object obj, sc.c cVar) {
        switch (this.f11374a) {
            case 0:
                return new l((m) this.f11376c, (sc.h) this.d, cVar, 0);
            case 1:
                return new l((c0) this.f11376c, (String) this.d, cVar, 1);
            case 2:
                return new l((com.google.firebase.messaging.s) this.f11376c, (ArrayList) this.d, cVar, 2);
            case 3:
                l lVar = new l((List) this.d, cVar, 3);
                lVar.f11376c = obj;
                return lVar;
            case 4:
                return new l((com.google.firebase.messaging.s) this.d, cVar, 4);
            case 5:
                return new l((bd.p) this.f11376c, this.d, cVar, 5);
            default:
                return new l((la.k) this.d, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11374a) {
            case 0:
                return ((l) create((jd.c0) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
            case 1:
                return ((l) create((jd.c0) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
            case 2:
                return ((l) create((jd.c0) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
            case 3:
                return ((l) create((k1.t) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
            case 4:
                return ((l) create((jd.c0) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
            case 5:
                return ((l) create((jd.c0) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
            default:
                return ((l) create((jd.c0) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: ja.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public l(Object obj, sc.c cVar, int i10) {
        super(2, cVar);
        this.f11374a = i10;
        this.d = obj;
    }
}
