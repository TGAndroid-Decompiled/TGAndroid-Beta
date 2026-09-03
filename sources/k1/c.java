package k1;

import java.util.ArrayList;
import java.util.List;
public final class c extends wc.i implements dd.p {
    public final int f10259a;
    public int f10260b;
    public Object f10261c;
    public final Object d;

    public c(dd.p pVar, Object obj, uc.c cVar) {
        super(2, cVar);
        this.f10259a = 2;
        this.d = pVar;
        this.f10261c = obj;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.f10259a) {
            case 0:
                c cVar2 = new c((List) this.d, cVar, 0);
                cVar2.f10261c = obj;
                return cVar2;
            case 1:
                return new c((com.google.firebase.messaging.s) this.d, cVar, 1);
            case 2:
                return new c((dd.p) this.d, this.f10261c, cVar);
            case 3:
                return new c((la.l) this.f10261c, (uc.h) this.d, cVar, 3);
            case 4:
                return new c((la.z) this.f10261c, (String) this.d, cVar, 4);
            case 5:
                return new c((sf.f) this.f10261c, (ArrayList) this.d, cVar, 5);
            default:
                return new c((na.k) this.d, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10259a) {
            case 0:
                return ((c) create((w) obj, (uc.c) obj2)).invokeSuspend(sc.i.f47274a);
            case 1:
                return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f47274a);
            case 2:
                return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f47274a);
            case 3:
                return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f47274a);
            case 4:
                return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f47274a);
            case 5:
                return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f47274a);
            default:
                return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f47274a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: k1.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public c(Object obj, Object obj2, uc.c cVar, int i10) {
        super(2, cVar);
        this.f10259a = i10;
        this.f10261c = obj;
        this.d = obj2;
    }

    public c(Object obj, uc.c cVar, int i10) {
        super(2, cVar);
        this.f10259a = i10;
        this.d = obj;
    }
}
