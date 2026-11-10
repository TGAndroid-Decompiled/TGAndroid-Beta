package m1;

import java.io.Serializable;
public final class x extends kd.j implements rd.l {
    public final int f19507a = 0;
    public int f19508b;
    public final b0 f19509c;
    public Object d;
    public final Object f19510e;
    public final Serializable f19511f;

    public x(kotlin.jvm.internal.r rVar, b0 b0Var, kotlin.jvm.internal.p pVar, id.c cVar) {
        super(1, cVar);
        this.f19510e = rVar;
        this.f19509c = b0Var;
        this.f19511f = pVar;
    }

    @Override
    public final id.c create(id.c cVar) {
        switch (this.f19507a) {
            case 0:
                return new x((kotlin.jvm.internal.r) this.f19510e, this.f19509c, (kotlin.jvm.internal.p) this.f19511f, cVar);
            default:
                return new x(this.f19509c, (id.h) this.f19510e, (rd.p) ((kd.j) this.f19511f), cVar);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.f19507a) {
            case 0:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13831a);
            default:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13831a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public x(b0 b0Var, id.h hVar, rd.p pVar, id.c cVar) {
        super(1, cVar);
        this.f19509c = b0Var;
        this.f19510e = hVar;
        this.f19511f = (kd.j) pVar;
    }
}
