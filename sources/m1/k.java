package m1;

import java.io.Serializable;
import java.util.Iterator;
public final class k extends kd.j implements rd.l {
    public Object f20007a;
    public Serializable f20008b;
    public Object f20009c;
    public Object d;
    public Iterator f20010e;
    public int f20011f;
    public int h;
    public final b0 f20012n;
    public final ab.c0 f20013r;

    public k(b0 b0Var, ab.c0 c0Var, id.c cVar) {
        super(1, cVar);
        this.f20012n = b0Var;
        this.f20013r = c0Var;
    }

    @Override
    public final id.c create(id.c cVar) {
        return new k(this.f20012n, this.f20013r, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((k) create((id.c) obj)).invokeSuspend(gd.k.f13173a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: m1.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
