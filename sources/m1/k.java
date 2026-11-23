package m1;

import java.io.Serializable;
import java.util.Iterator;
public final class k extends kd.j implements rd.l {
    public Object f20402a;
    public Serializable f20403b;
    public Object f20404c;
    public Object d;
    public Iterator f20405e;
    public int f20406f;
    public int h;
    public final b0 f20407n;
    public final ab.c0 f20408r;

    public k(b0 b0Var, ab.c0 c0Var, id.c cVar) {
        super(1, cVar);
        this.f20407n = b0Var;
        this.f20408r = c0Var;
    }

    @Override
    public final id.c create(id.c cVar) {
        return new k(this.f20407n, this.f20408r, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((k) create((id.c) obj)).invokeSuspend(gd.k.f13517a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: m1.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
