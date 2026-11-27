package defpackage;
public final class n83 extends yfb implements is4 {
    public n89 a;
    public byte b;
    public Object c;
    public final n89 d;
    public final o83 e;
    public final Object f;
    public final boolean h;

    public n83(n89 n89Var, o83 o83Var, Object obj, boolean z, zw2 zw2Var) {
        super(2, zw2Var);
        this.d = n89Var;
        this.e = o83Var;
        this.f = obj;
        this.h = z;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        n83 n83Var = new n83(this.d, this.e, this.f, this.h, zw2Var);
        n83Var.c = obj;
        return n83Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((n83) create((pd4) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n83.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
