package m1;

import java.io.Serializable;
import java.util.Iterator;
public final class k extends kd.j implements rd.l {
    public Object f19418a;
    public Serializable f19419b;
    public Object f19420c;
    public Object d;
    public Iterator f19421e;
    public int f19422f;
    public int h;
    public final b0 f19423n;
    public final ui.e f19424r;

    public k(b0 b0Var, ui.e eVar, id.c cVar) {
        super(1, cVar);
        this.f19423n = b0Var;
        this.f19424r = eVar;
    }

    @Override
    public final id.c create(id.c cVar) {
        return new k(this.f19423n, this.f19424r, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((k) create((id.c) obj)).invokeSuspend(gd.k.f13831a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: m1.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
