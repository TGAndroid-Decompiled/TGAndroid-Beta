package ja;

import java.util.List;
import java.util.Map;
public final class i0 extends uc.i implements bd.p {
    public k0 f11351a;
    public f0 f11352b;
    public u8.g f11353c;
    public d0 d;
    public la.h f11354e;
    public q f11355f;
    public List h;
    public Map f11356n;
    public int f11357r;
    public final k0 f11358s;
    public final d0 v;

    public i0(k0 k0Var, d0 d0Var, sc.c cVar) {
        super(2, cVar);
        this.f11358s = k0Var;
        this.v = d0Var;
    }

    @Override
    public final sc.c create(Object obj, sc.c cVar) {
        return new i0(this.f11358s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((jd.c0) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: ja.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
