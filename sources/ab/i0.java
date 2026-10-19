package ab;

import java.util.List;
import java.util.Map;
public final class i0 extends md.i implements td.p {
    public k0 f413a;
    public f0 f414b;
    public l9.h f415c;
    public d0 d;
    public cb.h e;
    public q f416f;
    public List h;
    public Map f417n;
    public int f418r;
    public final k0 f419s;
    public final d0 v;

    public i0(k0 k0Var, d0 d0Var, kd.c cVar) {
        super(2, cVar);
        this.f419s = k0Var;
        this.v = d0Var;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        return new i0(this.f419s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((be.c0) obj, (kd.c) obj2)).invokeSuspend(id.i.f12777a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: ab.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
