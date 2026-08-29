package md;

import ag.o1;
public final class a extends uc.c {
    public nd.g f16978a;
    public Object f16979b;
    public final o1 f16980c;
    public int d;

    public a(o1 o1Var, uc.c cVar) {
        super(cVar);
        this.f16980c = o1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16979b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16980c.e(null, this);
    }
}
