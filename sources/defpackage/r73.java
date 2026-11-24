package defpackage;
public final class r73 extends ccb implements qp4 {
    public final byte a = 0;
    public byte b;
    public final v73 c;
    public Object d;
    public final Object e;
    public final Object f;

    public r73(c59 c59Var, v73 v73Var, a59 a59Var, fw2 fw2Var) {
        super(1, fw2Var);
        this.e = c59Var;
        this.c = v73Var;
        this.f = a59Var;
    }

    @Override
    public final fw2 create(fw2 fw2Var) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        v73 v73Var = this.c;
        switch (b) {
            case 0:
                return new r73((c59) obj2, v73Var, (a59) obj, fw2Var);
            default:
                return new r73(v73Var, (sw2) obj2, (eq4) obj, fw2Var);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        fw2 fw2Var = (fw2) obj;
        switch (b) {
            case 0:
                return ((r73) create(fw2Var)).invokeSuspend(g5cVar);
            default:
                return ((r73) create(fw2Var)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r73.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public r73(v73 v73Var, sw2 sw2Var, eq4 eq4Var, fw2 fw2Var) {
        super(1, fw2Var);
        this.c = v73Var;
        this.e = sw2Var;
        this.f = eq4Var;
    }
}
