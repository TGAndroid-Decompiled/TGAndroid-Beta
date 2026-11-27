package defpackage;

import java.io.File;
public final class a83 extends yfb implements is4 {
    public final byte a;
    public byte b;
    public Object c;
    public Object d;
    public final Object e;

    public a83(Object obj, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.e = obj;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                a83 a83Var = new a83((o83) obj2, zw2Var, (byte) 0);
                a83Var.c = obj;
                return a83Var;
            default:
                a83 a83Var2 = new a83((File) obj2, zw2Var, (byte) 1);
                a83Var2.c = obj;
                return a83Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        switch (b) {
            case 0:
                return ((a83) create((nm4) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            default:
                return ((a83) create((so8) obj, (zw2) obj2)).invokeSuspend(f9cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a83.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
