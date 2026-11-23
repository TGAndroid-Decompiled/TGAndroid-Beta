package m1;

import java.io.Serializable;
public final class x extends kd.j implements rd.l {
    public final int f20491a = 0;
    public int f20492b;
    public final b0 f20493c;
    public Object d;
    public final Object f20494e;
    public final Serializable f20495f;

    public x(kotlin.jvm.internal.r rVar, b0 b0Var, kotlin.jvm.internal.p pVar, id.c cVar) {
        super(1, cVar);
        this.f20494e = rVar;
        this.f20493c = b0Var;
        this.f20495f = pVar;
    }

    @Override
    public final id.c create(id.c cVar) {
        switch (this.f20491a) {
            case 0:
                return new x((kotlin.jvm.internal.r) this.f20494e, this.f20493c, (kotlin.jvm.internal.p) this.f20495f, cVar);
            default:
                return new x(this.f20493c, (id.h) this.f20494e, (rd.p) ((kd.j) this.f20495f), cVar);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.f20491a) {
            case 0:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13517a);
            default:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13517a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public x(b0 b0Var, id.h hVar, rd.p pVar, id.c cVar) {
        super(1, cVar);
        this.f20493c = b0Var;
        this.f20494e = hVar;
        this.f20495f = (kd.j) pVar;
    }
}
