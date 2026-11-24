package defpackage;

import java.io.File;
public final class h73 extends ccb implements eq4 {
    public final byte a;
    public byte b;
    public Object c;
    public Object d;
    public final Object e;

    public h73(Object obj, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.e = obj;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                h73 h73Var = new h73((v73) obj2, fw2Var, (byte) 0);
                h73Var.c = obj;
                return h73Var;
            default:
                h73 h73Var2 = new h73((File) obj2, fw2Var, (byte) 1);
                h73Var2.c = obj;
                return h73Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        switch (b) {
            case 0:
                return ((h73) create((ik4) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            default:
                return ((h73) create((fl8) obj, (fw2) obj2)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
