package ia;

import java.util.ArrayList;
import java.util.List;

public final class m extends tc.i implements ad.p {

    public final int f11051a;

    public int f11052b;

    public Object f11053c;
    public final Object d;

    public m(Object obj, Object obj2, rc.c cVar, int i10) {
        super(2, cVar);
        this.f11051a = i10;
        this.f11053c = obj;
        this.d = obj2;
    }

    @Override
    public final rc.c create(Object obj, rc.c cVar) {
        switch (this.f11051a) {
            case 0:
                return new m((n) this.f11053c, (rc.h) this.d, cVar, 0);
            case 1:
                return new m((d0) this.f11053c, (String) this.d, cVar, 1);
            case 2:
                return new m((com.google.firebase.messaging.t) this.f11053c, (ArrayList) this.d, cVar, 2);
            case 3:
                m mVar = new m((List) this.d, cVar, 3);
                mVar.f11053c = obj;
                return mVar;
            case 4:
                return new m((com.google.firebase.messaging.t) this.d, cVar, 4);
            case 5:
                return new m((ad.p) this.f11053c, this.d, cVar, 5);
            default:
                return new m((ka.k) this.d, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11051a) {
            case 0:
                return ((m) create((id.c0) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
            case 1:
                return ((m) create((id.c0) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
            case 2:
                return ((m) create((id.c0) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
            case 3:
                return ((m) create((k1.s) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
            case 4:
                return ((m) create((id.c0) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
            case 5:
                return ((m) create((id.c0) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
            default:
                return ((m) create((id.c0) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: ia.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public m(Object obj, rc.c cVar, int i10) {
        super(2, cVar);
        this.f11051a = i10;
        this.d = obj;
    }
}
