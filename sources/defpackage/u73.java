package defpackage;
public final class u73 extends ccb implements eq4 {
    public a59 a;
    public byte b;
    public Object c;
    public final a59 d;
    public final v73 e;
    public final Object f;
    public final boolean h;

    public u73(a59 a59Var, v73 v73Var, Object obj, boolean z, fw2 fw2Var) {
        super(2, fw2Var);
        this.d = a59Var;
        this.e = v73Var;
        this.f = obj;
        this.h = z;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        u73 u73Var = new u73(this.d, this.e, this.f, this.h, fw2Var);
        u73Var.c = obj;
        return u73Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u73) create((sb4) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
