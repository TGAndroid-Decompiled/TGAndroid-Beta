package defpackage;

import java.util.List;
import org.json.JSONObject;
public final class ii1 extends yfb implements is4 {
    public final byte a;
    public boolean b;
    public Object c;
    public final Object d;

    public ii1(Object obj, Object obj2, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ii1 ii1Var = new ii1((ji1) obj2, zw2Var, (byte) 0);
                ii1Var.c = obj;
                return ii1Var;
            case 1:
                ii1 ii1Var2 = new ii1((ji1) obj2, zw2Var, (byte) 1);
                ii1Var2.c = obj;
                return ii1Var2;
            case 2:
                ii1 ii1Var3 = new ii1((o4a) obj2, zw2Var, (byte) 2);
                ii1Var3.c = obj;
                return ii1Var3;
            case 3:
                ii1 ii1Var4 = new ii1((List) obj2, zw2Var, (byte) 3);
                ii1Var4.c = obj;
                return ii1Var4;
            case 4:
                return new ii1((is4) this.c, (k63) obj2, zw2Var, (byte) 4);
            case 5:
                ii1 ii1Var5 = new ii1((o83) obj2, zw2Var, (byte) 5);
                ii1Var5.c = obj;
                return ii1Var5;
            case 6:
                return new ii1((av5) this.c, (ur4) obj2, zw2Var, (byte) 6);
            case 7:
                ii1 ii1Var6 = new ii1((aa9) obj2, zw2Var, (byte) 7);
                ii1Var6.c = obj;
                return ii1Var6;
            default:
                ii1 ii1Var7 = new ii1((nm4) obj2, zw2Var, (byte) 8);
                ii1Var7.c = obj;
                return ii1Var7;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        switch (b) {
            case 0:
                return ((ii1) create((so8) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            case 1:
                return ((ii1) create((nm4) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            case 2:
                return ((ii1) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            case 3:
                return ((ii1) create((r73) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            case 4:
                return ((ii1) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            case 5:
                return ((ii1) create((k37) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            case 6:
                return ((ii1) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            case 7:
                return ((ii1) create((JSONObject) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            default:
                return ((ii1) create(obj, (zw2) obj2)).invokeSuspend(f9cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public ii1(Object obj, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.d = obj;
    }
}
