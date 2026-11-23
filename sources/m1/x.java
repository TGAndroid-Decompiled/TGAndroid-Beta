package m1;

import java.io.Serializable;
public final class x extends kd.j implements rd.l {
    public final int f20553a = 0;
    public int f20554b;
    public final b0 f20555c;
    public Object d;
    public final Object f20556e;
    public final Serializable f20557f;

    public x(kotlin.jvm.internal.r rVar, b0 b0Var, kotlin.jvm.internal.p pVar, id.c cVar) {
        super(1, cVar);
        this.f20556e = rVar;
        this.f20555c = b0Var;
        this.f20557f = pVar;
    }

    @Override
    public final id.c create(id.c cVar) {
        switch (this.f20553a) {
            case 0:
                return new x((kotlin.jvm.internal.r) this.f20556e, this.f20555c, (kotlin.jvm.internal.p) this.f20557f, cVar);
            default:
                return new x(this.f20555c, (id.h) this.f20556e, (rd.p) ((kd.j) this.f20557f), cVar);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.f20553a) {
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
        this.f20555c = b0Var;
        this.f20556e = hVar;
        this.f20557f = (kd.j) pVar;
    }
}
