package la;

import java.util.List;
import java.util.Map;
public final class f0 extends wc.i implements dd.p {
    public h0 f11761a;
    public c0 f11762b;
    public w8.g f11763c;
    public a0 d;
    public na.h e;
    public p f11764f;
    public List h;
    public Map f11765n;
    public int f11766r;
    public final h0 f11767s;
    public final a0 v;

    public f0(h0 h0Var, a0 a0Var, uc.c cVar) {
        super(2, cVar);
        this.f11767s = h0Var;
        this.v = a0Var;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        return new f0(this.f11767s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44253a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: la.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
