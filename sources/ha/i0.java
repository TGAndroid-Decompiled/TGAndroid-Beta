package ha;

import java.util.List;
import java.util.Map;
public final class i0 extends sc.i implements zc.p {
    public k0 f10316a;
    public f0 f10317b;
    public s8.h f10318c;
    public d0 d;
    public ja.h f10319e;
    public q f10320f;
    public List h;
    public Map f10321n;
    public int f10322r;
    public final k0 f10323s;
    public final d0 v;

    public i0(k0 k0Var, d0 d0Var, qc.c cVar) {
        super(2, cVar);
        this.f10323s = k0Var;
        this.v = d0Var;
    }

    @Override
    public final qc.c create(Object obj, qc.c cVar) {
        return new i0(this.f10323s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((hd.c0) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: ha.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
