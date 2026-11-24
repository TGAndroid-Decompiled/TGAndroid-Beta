package defpackage;

import java.io.Serializable;
import java.util.Iterator;
public final class l83 extends eeb implements rr4 {
    public Object a;
    public Serializable b;
    public Object c;
    public Object d;
    public Iterator e;
    public int f;
    public byte h;
    public final h93 n;
    public final e7a r;

    public l83(h93 h93Var, e7a e7aVar, px2 px2Var) {
        super(1, px2Var);
        this.n = h93Var;
        this.r = e7aVar;
    }

    @Override
    public final px2 create(px2 px2Var) {
        return new l83(this.n, this.r, px2Var);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((l83) create((px2) obj)).invokeSuspend(g7c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l83.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
