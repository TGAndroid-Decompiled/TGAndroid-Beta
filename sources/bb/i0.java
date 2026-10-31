package bb;

import java.util.List;
import java.util.Map;
public final class i0 extends ed.j implements ld.p {
    public k0 f2571a;
    public f0 f2572b;
    public l9.h f2573c;
    public d0 d;
    public db.h e;
    public q f2574f;
    public List h;
    public Map f2575n;
    public int f2576r;
    public final k0 f2577s;
    public final d0 f2578w;

    public i0(k0 k0Var, d0 d0Var, cd.c cVar) {
        super(2, cVar);
        this.f2577s = k0Var;
        this.f2578w = d0Var;
    }

    @Override
    public final cd.c create(Object obj, cd.c cVar) {
        return new i0(this.f2577s, this.f2578w, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((td.c0) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: bb.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
