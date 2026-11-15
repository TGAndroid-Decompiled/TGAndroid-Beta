package m1;

import java.io.Serializable;
public final class x extends kd.j implements rd.l {
    public final int f20096a = 0;
    public int f20097b;
    public final b0 f20098c;
    public Object d;
    public final Object f20099e;
    public final Serializable f20100f;

    public x(kotlin.jvm.internal.r rVar, b0 b0Var, kotlin.jvm.internal.p pVar, id.c cVar) {
        super(1, cVar);
        this.f20099e = rVar;
        this.f20098c = b0Var;
        this.f20100f = pVar;
    }

    @Override
    public final id.c create(id.c cVar) {
        switch (this.f20096a) {
            case 0:
                return new x((kotlin.jvm.internal.r) this.f20099e, this.f20098c, (kotlin.jvm.internal.p) this.f20100f, cVar);
            default:
                return new x(this.f20098c, (id.h) this.f20099e, (rd.p) ((kd.j) this.f20100f), cVar);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.f20096a) {
            case 0:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13173a);
            default:
                return ((x) create(cVar)).invokeSuspend(gd.k.f13173a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public x(b0 b0Var, id.h hVar, rd.p pVar, id.c cVar) {
        super(1, cVar);
        this.f20098c = b0Var;
        this.f20099e = hVar;
        this.f20100f = (kd.j) pVar;
    }
}
