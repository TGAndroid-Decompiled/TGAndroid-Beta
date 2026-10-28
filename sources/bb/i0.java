package bb;

import java.util.List;
import java.util.Map;
public final class i0 extends nd.i implements ud.p {
    public k0 f3771a;
    public f0 f3772b;
    public m9.h f3773c;
    public d0 d;
    public db.h e;
    public q f3774f;
    public List h;
    public Map f3775n;
    public int f3776r;
    public final k0 f3777s;
    public final d0 v;

    public i0(k0 k0Var, d0 d0Var, ld.c cVar) {
        super(2, cVar);
        this.f3777s = k0Var;
        this.v = d0Var;
    }

    @Override
    public final ld.c create(Object obj, ld.c cVar) {
        return new i0(this.f3777s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((ce.c0) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15579a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: bb.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
