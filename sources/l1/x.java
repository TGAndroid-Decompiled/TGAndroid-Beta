package l1;

import java.io.Serializable;
public final class x extends hd.j implements od.l {
    public final int f17664a = 0;
    public int f17665b;
    public final b0 f17666c;
    public Object d;
    public final Object f17667e;
    public final Serializable f17668f;

    public x(kotlin.jvm.internal.r rVar, b0 b0Var, kotlin.jvm.internal.p pVar, fd.c cVar) {
        super(1, cVar);
        this.f17667e = rVar;
        this.f17666c = b0Var;
        this.f17668f = pVar;
    }

    @Override
    public final fd.c create(fd.c cVar) {
        switch (this.f17664a) {
            case 0:
                return new x((kotlin.jvm.internal.r) this.f17667e, this.f17666c, (kotlin.jvm.internal.p) this.f17668f, cVar);
            default:
                return new x(this.f17666c, (fd.h) this.f17667e, (od.p) ((hd.j) this.f17668f), cVar);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        fd.c cVar = (fd.c) obj;
        switch (this.f17664a) {
            case 0:
                return ((x) create(cVar)).invokeSuspend(dd.k.f8801a);
            default:
                return ((x) create(cVar)).invokeSuspend(dd.k.f8801a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: l1.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public x(b0 b0Var, fd.h hVar, od.p pVar, fd.c cVar) {
        super(1, cVar);
        this.f17666c = b0Var;
        this.f17667e = hVar;
        this.f17668f = (hd.j) pVar;
    }
}
