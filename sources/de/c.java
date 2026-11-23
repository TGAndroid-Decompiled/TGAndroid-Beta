package de;

import be.s;
import java.io.File;
import m1.b0;
import rd.p;
import zd.z;
public final class c extends kd.j implements p {
    public final int f8335a;
    public int f8336b;
    public Object f8337c;
    public Object d;
    public final Object f8338e;

    public c(ce.d dVar, ce.b bVar, id.c cVar) {
        super(2, cVar);
        this.f8335a = 0;
        this.d = dVar;
        this.f8338e = bVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f8335a) {
            case 0:
                c cVar2 = new c((ce.d) this.d, (ce.b) this.f8338e, cVar);
                cVar2.f8337c = obj;
                return cVar2;
            case 1:
                return new c((ka.d) this.d, (q1.e) this.f8338e, this.f8337c, cVar);
            case 2:
                return new c((ka.d) this.f8337c, (q1.e) this.d, (Long) this.f8338e, cVar);
            case 3:
                c cVar3 = new c((b0) this.f8338e, cVar, 3);
                cVar3.f8337c = obj;
                return cVar3;
            case 4:
                c cVar4 = new c((b0) this.d, (p) ((kd.j) this.f8338e), cVar);
                cVar4.f8337c = obj;
                return cVar4;
            default:
                c cVar5 = new c((File) this.f8338e, cVar, 5);
                cVar5.f8337c = obj;
                return cVar5;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8335a) {
            case 0:
                return ((c) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13480a);
            case 1:
                return ((c) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13480a);
            case 2:
                return ((c) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13480a);
            case 3:
                return ((c) create((ce.d) obj, (id.c) obj2)).invokeSuspend(gd.k.f13480a);
            case 4:
                return ((c) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13480a);
            default:
                return ((c) create((s) obj, (id.c) obj2)).invokeSuspend(gd.k.f13480a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: de.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public c(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.f8335a = i7;
        this.f8338e = obj;
    }

    public c(ka.d dVar, q1.e eVar, Long l10, id.c cVar) {
        super(2, cVar);
        this.f8335a = 2;
        this.f8337c = dVar;
        this.d = eVar;
        this.f8338e = l10;
    }

    public c(ka.d dVar, q1.e eVar, Object obj, id.c cVar) {
        super(2, cVar);
        this.f8335a = 1;
        this.d = dVar;
        this.f8338e = eVar;
        this.f8337c = obj;
    }

    public c(b0 b0Var, p pVar, id.c cVar) {
        super(2, cVar);
        this.f8335a = 4;
        this.d = b0Var;
        this.f8338e = (kd.j) pVar;
    }
}
