package m1;

import java.io.Serializable;
public final class x extends kd.j implements rd.l {
    public final int f19502a = 0;
    public int f19503b;
    public final b0 f19504c;
    public Object d;
    public final Object f19505e;
    public final Serializable f19506f;

    public x(kotlin.jvm.internal.r rVar, b0 b0Var, kotlin.jvm.internal.p pVar, id.c cVar) {
        super(1, cVar);
        this.f19505e = rVar;
        this.f19504c = b0Var;
        this.f19506f = pVar;
    }

    @Override
    public final id.c create(id.c cVar) {
        switch (this.f19502a) {
            case 0:
                return new x((kotlin.jvm.internal.r) this.f19505e, this.f19504c, (kotlin.jvm.internal.p) this.f19506f, cVar);
            default:
                return new x(this.f19504c, (id.h) this.f19505e, (rd.p) ((kd.j) this.f19506f), cVar);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.f19502a) {
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
        this.f19504c = b0Var;
        this.f19505e = hVar;
        this.f19506f = (kd.j) pVar;
    }
}
