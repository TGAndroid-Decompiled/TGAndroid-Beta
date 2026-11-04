package l1;

import java.io.Serializable;
import java.util.Iterator;
public final class k extends hd.j implements od.l {
    public Object f17573a;
    public Serializable f17574b;
    public Object f17575c;
    public Object d;
    public Iterator f17576e;
    public int f17577f;
    public int h;
    public final b0 f17578n;
    public final za.p f17579r;

    public k(b0 b0Var, za.p pVar, fd.c cVar) {
        super(1, cVar);
        this.f17578n = b0Var;
        this.f17579r = pVar;
    }

    @Override
    public final fd.c create(fd.c cVar) {
        return new k(this.f17578n, this.f17579r, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((k) create((fd.c) obj)).invokeSuspend(dd.k.f8801a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: l1.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
