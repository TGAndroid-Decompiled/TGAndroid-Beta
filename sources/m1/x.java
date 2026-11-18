package m1;

import java.io.Serializable;
public final class x extends kd.j implements rd.l {
    public final int f20463a = 0;
    public int f20464b;
    public final b0 f20465c;
    public Object d;
    public final Object f20466e;
    public final Serializable f20467f;

    public x(kotlin.jvm.internal.r rVar, b0 b0Var, kotlin.jvm.internal.p pVar, id.c cVar) {
        super(1, cVar);
        this.f20466e = rVar;
        this.f20465c = b0Var;
        this.f20467f = pVar;
    }

    @Override
    public final id.c create(id.c cVar) {
        switch (this.f20463a) {
            case 0:
                return new x((kotlin.jvm.internal.r) this.f20466e, this.f20465c, (kotlin.jvm.internal.p) this.f20467f, cVar);
            default:
                return new x(this.f20465c, (id.h) this.f20466e, (rd.p) ((kd.j) this.f20467f), cVar);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.f20463a) {
            case 0:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13488a);
            default:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13488a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public x(b0 b0Var, id.h hVar, rd.p pVar, id.c cVar) {
        super(1, cVar);
        this.f20465c = b0Var;
        this.f20466e = hVar;
        this.f20467f = (kd.j) pVar;
    }
}
