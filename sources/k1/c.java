package k1;

import java.util.ArrayList;
import java.util.List;
public final class c extends wc.i implements dd.p {
    public final int f9557a;
    public int f9558b;
    public Object f9559c;
    public final Object d;

    public c(dd.p pVar, Object obj, uc.c cVar) {
        super(2, cVar);
        this.f9557a = 2;
        this.d = pVar;
        this.f9559c = obj;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.f9557a) {
            case 0:
                c cVar2 = new c((List) this.d, cVar, 0);
                cVar2.f9559c = obj;
                return cVar2;
            case 1:
                return new c((com.google.firebase.messaging.r) this.d, cVar, 1);
            case 2:
                return new c((dd.p) this.d, this.f9559c, cVar);
            case 3:
                return new c((la.l) this.f9559c, (uc.h) this.d, cVar, 3);
            case 4:
                return new c((la.z) this.f9559c, (String) this.d, cVar, 4);
            case 5:
                return new c((com.google.firebase.messaging.r) this.f9559c, (ArrayList) this.d, cVar, 5);
            default:
                return new c((na.k) this.d, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9557a) {
            case 0:
                return ((c) create((w) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44253a);
            case 1:
                return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44253a);
            case 2:
                return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44253a);
            case 3:
                return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44253a);
            case 4:
                return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44253a);
            case 5:
                return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44253a);
            default:
                return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44253a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: k1.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public c(Object obj, Object obj2, uc.c cVar, int i10) {
        super(2, cVar);
        this.f9557a = i10;
        this.f9559c = obj;
        this.d = obj2;
    }

    public c(Object obj, uc.c cVar, int i10) {
        super(2, cVar);
        this.f9557a = i10;
        this.d = obj;
    }
}
