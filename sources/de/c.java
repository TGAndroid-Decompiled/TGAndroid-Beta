package de;

import be.s;
import java.io.File;
import m1.b0;
import rd.p;
import zd.z;
public final class c extends kd.j implements p {
    public final int f8670a;
    public int f8671b;
    public Object f8672c;
    public Object d;
    public final Object f8673e;

    public c(ce.d dVar, ce.b bVar, id.c cVar) {
        super(2, cVar);
        this.f8670a = 0;
        this.d = dVar;
        this.f8673e = bVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f8670a) {
            case 0:
                c cVar2 = new c((ce.d) this.d, (ce.b) this.f8673e, cVar);
                cVar2.f8672c = obj;
                return cVar2;
            case 1:
                return new c((ka.d) this.d, (q1.e) this.f8673e, this.f8672c, cVar);
            case 2:
                return new c((ka.d) this.f8672c, (q1.e) this.d, (Long) this.f8673e, cVar);
            case 3:
                c cVar3 = new c((b0) this.f8673e, cVar, 3);
                cVar3.f8672c = obj;
                return cVar3;
            case 4:
                c cVar4 = new c((b0) this.d, (p) ((kd.j) this.f8673e), cVar);
                cVar4.f8672c = obj;
                return cVar4;
            default:
                c cVar5 = new c((File) this.f8673e, cVar, 5);
                cVar5.f8672c = obj;
                return cVar5;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8670a) {
            case 0:
                return ((c) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13829a);
            case 1:
                return ((c) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13829a);
            case 2:
                return ((c) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13829a);
            case 3:
                return ((c) create((ce.d) obj, (id.c) obj2)).invokeSuspend(gd.k.f13829a);
            case 4:
                return ((c) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.f13829a);
            default:
                return ((c) create((s) obj, (id.c) obj2)).invokeSuspend(gd.k.f13829a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: de.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public c(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.f8670a = i7;
        this.f8673e = obj;
    }

    public c(ka.d dVar, q1.e eVar, Long l10, id.c cVar) {
        super(2, cVar);
        this.f8670a = 2;
        this.f8672c = dVar;
        this.d = eVar;
        this.f8673e = l10;
    }

    public c(ka.d dVar, q1.e eVar, Object obj, id.c cVar) {
        super(2, cVar);
        this.f8670a = 1;
        this.d = dVar;
        this.f8673e = eVar;
        this.f8672c = obj;
    }

    public c(b0 b0Var, p pVar, id.c cVar) {
        super(2, cVar);
        this.f8670a = 4;
        this.d = b0Var;
        this.f8673e = (kd.j) pVar;
    }
}
