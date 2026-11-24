package defpackage;
public final class lt5 extends ra9 implements eq4 {
    public rj7 b;
    public gg2 c;
    public byte d;
    public Object e;
    public final pt5 f;

    public lt5(fw2 fw2Var, pt5 pt5Var) {
        super(2, fw2Var);
        this.f = pt5Var;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        lt5 lt5Var = new lt5(fw2Var, this.f);
        lt5Var.e = obj;
        return lt5Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((lt5) create((o4a) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
