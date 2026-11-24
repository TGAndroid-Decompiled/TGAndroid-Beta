package defpackage;

import java.io.File;
public final class t83 extends eeb implements fs4 {
    public final byte a;
    public byte b;
    public Object c;
    public Object d;
    public final Object e;

    public t83(Object obj, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.e = obj;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                t83 t83Var = new t83((h93) obj2, px2Var, (byte) 0);
                t83Var.c = obj;
                return t83Var;
            default:
                t83 t83Var2 = new t83((File) obj2, px2Var, (byte) 1);
                t83Var2.c = obj;
                return t83Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        switch (b) {
            case 0:
                return ((t83) create((jm4) obj, (px2) obj2)).invokeSuspend(g7cVar);
            default:
                return ((t83) create((hn8) obj, (px2) obj2)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t83.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
