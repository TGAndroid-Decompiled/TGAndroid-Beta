package ab;

import java.util.ArrayList;
import java.util.List;
public final class l extends md.i implements td.p {
    public final int f434a;
    public int f435b;
    public Object f436c;
    public final Object d;

    public l(Object obj, Object obj2, kd.c cVar, int i10) {
        super(2, cVar);
        this.f434a = i10;
        this.f436c = obj;
        this.d = obj2;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        switch (this.f434a) {
            case 0:
                return new l((m) this.f436c, (kd.h) this.d, cVar, 0);
            case 1:
                return new l((c0) this.f436c, (String) this.d, cVar, 1);
            case 2:
                return new l((com.google.firebase.messaging.r) this.f436c, (ArrayList) this.d, cVar, 2);
            case 3:
                return new l((cb.k) this.d, cVar, 3);
            case 4:
                l lVar = new l((List) this.d, cVar, 4);
                lVar.f436c = obj;
                return lVar;
            case 5:
                return new l((com.google.firebase.messaging.r) this.d, cVar, 5);
            default:
                return new l((td.p) this.f436c, this.d, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f434a) {
            case 0:
                return ((l) create((be.c0) obj, (kd.c) obj2)).invokeSuspend(id.i.f12807a);
            case 1:
                return ((l) create((be.c0) obj, (kd.c) obj2)).invokeSuspend(id.i.f12807a);
            case 2:
                return ((l) create((be.c0) obj, (kd.c) obj2)).invokeSuspend(id.i.f12807a);
            case 3:
                return ((l) create((be.c0) obj, (kd.c) obj2)).invokeSuspend(id.i.f12807a);
            case 4:
                return ((l) create((k1.s) obj, (kd.c) obj2)).invokeSuspend(id.i.f12807a);
            case 5:
                return ((l) create((be.c0) obj, (kd.c) obj2)).invokeSuspend(id.i.f12807a);
            default:
                return ((l) create((be.c0) obj, (kd.c) obj2)).invokeSuspend(id.i.f12807a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        throw new UnsupportedOperationException("Method not decompiled: ab.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public l(Object obj, kd.c cVar, int i10) {
        super(2, cVar);
        this.f434a = i10;
        this.d = obj;
    }
}
