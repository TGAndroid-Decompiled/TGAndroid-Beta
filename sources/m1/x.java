package m1;

import java.io.Serializable;
public final class x extends kd.j implements rd.l {
    public final int f20457a = 0;
    public int f20458b;
    public final b0 f20459c;
    public Object d;
    public final Object f20460e;
    public final Serializable f20461f;

    public x(kotlin.jvm.internal.r rVar, b0 b0Var, kotlin.jvm.internal.p pVar, id.c cVar) {
        super(1, cVar);
        this.f20460e = rVar;
        this.f20459c = b0Var;
        this.f20461f = pVar;
    }

    @Override
    public final id.c create(id.c cVar) {
        switch (this.f20457a) {
            case 0:
                return new x((kotlin.jvm.internal.r) this.f20460e, this.f20459c, (kotlin.jvm.internal.p) this.f20461f, cVar);
            default:
                return new x(this.f20459c, (id.h) this.f20460e, (rd.p) ((kd.j) this.f20461f), cVar);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.f20457a) {
            case 0:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13480a);
            default:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13480a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public x(b0 b0Var, id.h hVar, rd.p pVar, id.c cVar) {
        super(1, cVar);
        this.f20459c = b0Var;
        this.f20460e = hVar;
        this.f20461f = (kd.j) pVar;
    }
}
