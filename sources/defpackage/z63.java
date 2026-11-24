package defpackage;

import java.io.Serializable;
import java.util.Iterator;
public final class z63 extends ccb implements qp4 {
    public Object a;
    public Serializable b;
    public Object c;
    public Object d;
    public Iterator e;
    public int f;
    public byte h;
    public final v73 n;
    public final c5a r;

    public z63(v73 v73Var, c5a c5aVar, fw2 fw2Var) {
        super(1, fw2Var);
        this.n = v73Var;
        this.r = c5aVar;
    }

    @Override
    public final fw2 create(fw2 fw2Var) {
        return new z63(this.n, this.r, fw2Var);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((z63) create((fw2) obj)).invokeSuspend(g5c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z63.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
