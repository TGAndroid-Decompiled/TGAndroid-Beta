package bb;

import java.util.ArrayList;
import java.util.List;
public final class l extends nd.i implements ud.p {
    public final int f3792a;
    public int f3793b;
    public Object f3794c;
    public final Object d;

    public l(Object obj, Object obj2, ld.c cVar, int i10) {
        super(2, cVar);
        this.f3792a = i10;
        this.f3794c = obj;
        this.d = obj2;
    }

    @Override
    public final ld.c create(Object obj, ld.c cVar) {
        switch (this.f3792a) {
            case 0:
                return new l((m) this.f3794c, (ld.h) this.d, cVar, 0);
            case 1:
                return new l((c0) this.f3794c, (String) this.d, cVar, 1);
            case 2:
                return new l((com.google.firebase.messaging.q) this.f3794c, (ArrayList) this.d, cVar, 2);
            case 3:
                return new l((db.k) this.d, cVar, 3);
            case 4:
                l lVar = new l((List) this.d, cVar, 4);
                lVar.f3794c = obj;
                return lVar;
            case 5:
                return new l((com.google.firebase.messaging.q) this.d, cVar, 5);
            default:
                return new l((ud.p) this.f3794c, this.d, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3792a) {
            case 0:
                return ((l) create((ce.c0) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15580a);
            case 1:
                return ((l) create((ce.c0) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15580a);
            case 2:
                return ((l) create((ce.c0) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15580a);
            case 3:
                return ((l) create((ce.c0) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15580a);
            case 4:
                return ((l) create((k1.s) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15580a);
            case 5:
                return ((l) create((ce.c0) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15580a);
            default:
                return ((l) create((ce.c0) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15580a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        throw new UnsupportedOperationException("Method not decompiled: bb.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public l(Object obj, ld.c cVar, int i10) {
        super(2, cVar);
        this.f3792a = i10;
        this.d = obj;
    }
}
