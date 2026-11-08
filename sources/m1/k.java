package m1;

import java.io.Serializable;
import java.util.Iterator;
public final class k extends kd.j implements rd.l {
    public Object f19413a;
    public Serializable f19414b;
    public Object f19415c;
    public Object d;
    public Iterator f19416e;
    public int f19417f;
    public int h;
    public final b0 f19418n;
    public final ui.e f19419r;

    public k(b0 b0Var, ui.e eVar, id.c cVar) {
        super(1, cVar);
        this.f19418n = b0Var;
        this.f19419r = eVar;
    }

    @Override
    public final id.c create(id.c cVar) {
        return new k(this.f19418n, this.f19419r, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((k) create((id.c) obj)).invokeSuspend(gd.k.f13829a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: m1.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
