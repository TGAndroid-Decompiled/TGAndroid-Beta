package m1;

import java.io.Serializable;
import java.util.Iterator;
public final class k extends kd.j implements rd.l {
    public Object f20399a;
    public Serializable f20400b;
    public Object f20401c;
    public Object d;
    public Iterator f20402e;
    public int f20403f;
    public int h;
    public final b0 f20404n;
    public final ab.c0 f20405r;

    public k(b0 b0Var, ab.c0 c0Var, id.c cVar) {
        super(1, cVar);
        this.f20404n = b0Var;
        this.f20405r = c0Var;
    }

    @Override
    public final id.c create(id.c cVar) {
        return new k(this.f20404n, this.f20405r, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((k) create((id.c) obj)).invokeSuspend(gd.k.f13514a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: m1.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
