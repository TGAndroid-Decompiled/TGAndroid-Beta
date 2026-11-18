package m1;

import java.io.Serializable;
public final class x extends kd.j implements rd.l {
    public final int f20460a = 0;
    public int f20461b;
    public final b0 f20462c;
    public Object d;
    public final Object f20463e;
    public final Serializable f20464f;

    public x(kotlin.jvm.internal.r rVar, b0 b0Var, kotlin.jvm.internal.p pVar, id.c cVar) {
        super(1, cVar);
        this.f20463e = rVar;
        this.f20462c = b0Var;
        this.f20464f = pVar;
    }

    @Override
    public final id.c create(id.c cVar) {
        switch (this.f20460a) {
            case 0:
                return new x((kotlin.jvm.internal.r) this.f20463e, this.f20462c, (kotlin.jvm.internal.p) this.f20464f, cVar);
            default:
                return new x(this.f20462c, (id.h) this.f20463e, (rd.p) ((kd.j) this.f20464f), cVar);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.f20460a) {
            case 0:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13485a);
            default:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13485a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public x(b0 b0Var, id.h hVar, rd.p pVar, id.c cVar) {
        super(1, cVar);
        this.f20462c = b0Var;
        this.f20463e = hVar;
        this.f20464f = (kd.j) pVar;
    }
}
