package m1;

import java.io.Serializable;
public final class x extends kd.j implements rd.l {
    public final int f19499a = 0;
    public int f19500b;
    public final b0 f19501c;
    public Object d;
    public final Object f19502e;
    public final Serializable f19503f;

    public x(kotlin.jvm.internal.r rVar, b0 b0Var, kotlin.jvm.internal.p pVar, id.c cVar) {
        super(1, cVar);
        this.f19502e = rVar;
        this.f19501c = b0Var;
        this.f19503f = pVar;
    }

    @Override
    public final id.c create(id.c cVar) {
        switch (this.f19499a) {
            case 0:
                return new x((kotlin.jvm.internal.r) this.f19502e, this.f19501c, (kotlin.jvm.internal.p) this.f19503f, cVar);
            default:
                return new x(this.f19501c, (id.h) this.f19502e, (rd.p) ((kd.j) this.f19503f), cVar);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.f19499a) {
            case 0:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13829a);
            default:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13829a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public x(b0 b0Var, id.h hVar, rd.p pVar, id.c cVar) {
        super(1, cVar);
        this.f19501c = b0Var;
        this.f19502e = hVar;
        this.f19503f = (kd.j) pVar;
    }
}
