package defpackage;

import java.util.List;
import org.json.JSONObject;
public final class hj1 extends eeb implements fs4 {
    public final byte a;
    public boolean b;
    public Object c;
    public final Object d;

    public hj1(Object obj, Object obj2, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                hj1 hj1Var = new hj1((ij1) obj2, px2Var, (byte) 0);
                hj1Var.c = obj;
                return hj1Var;
            case 1:
                hj1 hj1Var2 = new hj1((ij1) obj2, px2Var, (byte) 1);
                hj1Var2.c = obj;
                return hj1Var2;
            case 2:
                hj1 hj1Var3 = new hj1((x2a) obj2, px2Var, (byte) 2);
                hj1Var3.c = obj;
                return hj1Var3;
            case 3:
                hj1 hj1Var4 = new hj1((List) obj2, px2Var, (byte) 3);
                hj1Var4.c = obj;
                return hj1Var4;
            case 4:
                return new hj1((fs4) this.c, (e73) obj2, px2Var, (byte) 4);
            case 5:
                hj1 hj1Var5 = new hj1((h93) obj2, px2Var, (byte) 5);
                hj1Var5.c = obj;
                return hj1Var5;
            case 6:
                return new hj1((wu5) this.c, (rr4) obj2, px2Var, (byte) 6);
            case 7:
                hj1 hj1Var6 = new hj1((p89) obj2, px2Var, (byte) 7);
                hj1Var6.c = obj;
                return hj1Var6;
            default:
                hj1 hj1Var7 = new hj1((jm4) obj2, px2Var, (byte) 8);
                hj1Var7.c = obj;
                return hj1Var7;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        switch (b) {
            case 0:
                return ((hj1) create((hn8) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 1:
                return ((hj1) create((jm4) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 2:
                return ((hj1) create((ky2) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 3:
                return ((hj1) create((k83) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 4:
                return ((hj1) create((ky2) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 5:
                return ((hj1) create((d37) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 6:
                return ((hj1) create((ky2) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 7:
                return ((hj1) create((JSONObject) obj, (px2) obj2)).invokeSuspend(g7cVar);
            default:
                return ((hj1) create(obj, (px2) obj2)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public hj1(Object obj, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.d = obj;
    }
}
