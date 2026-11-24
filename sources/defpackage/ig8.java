package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
public final class ig8 extends ccb implements eq4 {
    public final byte a;
    public boolean b;
    public Object c;
    public final eq4 d;

    public ig8(eq4 eq4Var, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.d = eq4Var;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        eq4 eq4Var = this.d;
        switch (b) {
            case 0:
                ig8 ig8Var = new ig8(eq4Var, fw2Var, (byte) 0);
                ig8Var.c = obj;
                return ig8Var;
            default:
                ig8 ig8Var2 = new ig8(eq4Var, fw2Var, (byte) 1);
                ig8Var2.c = obj;
                return ig8Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        ih7 ih7Var = (ih7) obj;
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
            case 0:
                return ((ig8) create(ih7Var, fw2Var)).invokeSuspend(g5cVar);
            default:
                return ((ig8) create(ih7Var, fw2Var)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        eq4 eq4Var = this.d;
        bx2 bx2Var = bx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        qse.b(obj);
                    } else {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    qse.b(obj);
                    this.b = true;
                    obj = eq4Var.invoke((ih7) this.c, this);
                    if (obj == bx2Var) {
                        return bx2Var;
                    }
                }
                ih7 ih7Var = (ih7) obj;
                ih7Var.getClass();
                ((AtomicBoolean) ih7Var.b.b).set(true);
                return ih7Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        ih7 ih7Var2 = (ih7) this.c;
                        qse.b(obj);
                        return ih7Var2;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
                ih7 ih7Var3 = new ih7(new LinkedHashMap(((ih7) this.c).a()), false);
                this.c = ih7Var3;
                this.b = true;
                if (eq4Var.invoke(ih7Var3, this) == bx2Var) {
                    return bx2Var;
                }
                return ih7Var3;
        }
    }
}
