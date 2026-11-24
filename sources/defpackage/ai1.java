package defpackage;

import java.util.List;
import org.json.JSONObject;
public final class ai1 extends ccb implements eq4 {
    public final byte a;
    public boolean b;
    public Object c;
    public final Object d;

    public ai1(Object obj, Object obj2, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ai1 ai1Var = new ai1((bi1) obj2, fw2Var, (byte) 0);
                ai1Var.c = obj;
                return ai1Var;
            case 1:
                ai1 ai1Var2 = new ai1((bi1) obj2, fw2Var, (byte) 1);
                ai1Var2.c = obj;
                return ai1Var2;
            case 2:
                ai1 ai1Var3 = new ai1((v0a) obj2, fw2Var, (byte) 2);
                ai1Var3.c = obj;
                return ai1Var3;
            case 3:
                ai1 ai1Var4 = new ai1((List) obj2, fw2Var, (byte) 3);
                ai1Var4.c = obj;
                return ai1Var4;
            case 4:
                return new ai1((eq4) this.c, (s53) obj2, fw2Var, (byte) 4);
            case 5:
                ai1 ai1Var5 = new ai1((v73) obj2, fw2Var, (byte) 5);
                ai1Var5.c = obj;
                return ai1Var5;
            case 6:
                return new ai1((xs5) this.c, (qp4) obj2, fw2Var, (byte) 6);
            case 7:
                ai1 ai1Var6 = new ai1((n69) obj2, fw2Var, (byte) 7);
                ai1Var6.c = obj;
                return ai1Var6;
            default:
                ai1 ai1Var7 = new ai1((ik4) obj2, fw2Var, (byte) 8);
                ai1Var7.c = obj;
                return ai1Var7;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        switch (b) {
            case 0:
                return ((ai1) create((fl8) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 1:
                return ((ai1) create((ik4) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 2:
                return ((ai1) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 3:
                return ((ai1) create((y63) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 4:
                return ((ai1) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 5:
                return ((ai1) create((d17) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 6:
                return ((ai1) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 7:
                return ((ai1) create((JSONObject) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            default:
                return ((ai1) create(obj, (fw2) obj2)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public ai1(Object obj, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.d = obj;
    }
}
