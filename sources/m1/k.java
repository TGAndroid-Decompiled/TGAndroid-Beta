package m1;

import java.io.Serializable;
import java.util.Iterator;
public final class k extends kd.j implements rd.l {
    public Object f20464a;
    public Serializable f20465b;
    public Object f20466c;
    public Object d;
    public Iterator f20467e;
    public int f20468f;
    public int h;
    public final b0 f20469n;
    public final ab.c0 f20470r;

    public k(b0 b0Var, ab.c0 c0Var, id.c cVar) {
        super(1, cVar);
        this.f20469n = b0Var;
        this.f20470r = c0Var;
    }

    @Override
    public final id.c create(id.c cVar) {
        return new k(this.f20469n, this.f20470r, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((k) create((id.c) obj)).invokeSuspend(gd.k.f13480a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: m1.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
