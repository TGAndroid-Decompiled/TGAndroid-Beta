package defpackage;
public final class d93 extends eeb implements rr4 {
    public final byte a = 0;
    public byte b;
    public final h93 c;
    public Object d;
    public final Object e;
    public final Object f;

    public d93(e79 e79Var, h93 h93Var, c79 c79Var, px2 px2Var) {
        super(1, px2Var);
        this.e = e79Var;
        this.c = h93Var;
        this.f = c79Var;
    }

    @Override
    public final px2 create(px2 px2Var) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        h93 h93Var = this.c;
        switch (b) {
            case 0:
                return new d93((e79) obj2, h93Var, (c79) obj, px2Var);
            default:
                return new d93(h93Var, (cy2) obj2, (fs4) obj, px2Var);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        px2 px2Var = (px2) obj;
        switch (b) {
            case 0:
                return ((d93) create(px2Var)).invokeSuspend(g7cVar);
            default:
                return ((d93) create(px2Var)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d93.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public d93(h93 h93Var, cy2 cy2Var, fs4 fs4Var, px2 px2Var) {
        super(1, px2Var);
        this.c = h93Var;
        this.e = cy2Var;
        this.f = fs4Var;
    }
}
