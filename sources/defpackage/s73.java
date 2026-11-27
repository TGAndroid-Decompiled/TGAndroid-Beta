package defpackage;

import java.io.Serializable;
import java.util.Iterator;
public final class s73 extends yfb implements ur4 {
    public Object a;
    public Serializable b;
    public Object c;
    public Object d;
    public Iterator e;
    public int f;
    public byte h;
    public final o83 n;
    public final u8a r;

    public s73(o83 o83Var, u8a u8aVar, zw2 zw2Var) {
        super(1, zw2Var);
        this.n = o83Var;
        this.r = u8aVar;
    }

    @Override
    public final zw2 create(zw2 zw2Var) {
        return new s73(this.n, this.r, zw2Var);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((s73) create((zw2) obj)).invokeSuspend(g9c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
