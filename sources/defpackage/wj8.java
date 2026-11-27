package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
public final class wj8 extends yfb implements is4 {
    public final byte a;
    public boolean b;
    public Object c;
    public final is4 d;

    public wj8(is4 is4Var, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.d = is4Var;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        is4 is4Var = this.d;
        switch (b) {
            case 0:
                wj8 wj8Var = new wj8(is4Var, zw2Var, (byte) 0);
                wj8Var.c = obj;
                return wj8Var;
            default:
                wj8 wj8Var2 = new wj8(is4Var, zw2Var, (byte) 1);
                wj8Var2.c = obj;
                return wj8Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        rj7 rj7Var = (rj7) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
            case 0:
                return ((wj8) create(rj7Var, zw2Var)).invokeSuspend(f9cVar);
            default:
                return ((wj8) create(rj7Var, zw2Var)).invokeSuspend(f9cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        is4 is4Var = this.d;
        vx2 vx2Var = vx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        ixe.b(obj);
                    } else {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ixe.b(obj);
                    this.b = true;
                    obj = is4Var.invoke((rj7) this.c, this);
                    if (obj == vx2Var) {
                        return vx2Var;
                    }
                }
                rj7 rj7Var = (rj7) obj;
                rj7Var.getClass();
                ((AtomicBoolean) rj7Var.b.b).set(true);
                return rj7Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        rj7 rj7Var2 = (rj7) this.c;
                        ixe.b(obj);
                        return rj7Var2;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                rj7 rj7Var3 = new rj7(new LinkedHashMap(((rj7) this.c).a()), false);
                this.c = rj7Var3;
                this.b = true;
                if (is4Var.invoke(rj7Var3, this) == vx2Var) {
                    return vx2Var;
                }
                return rj7Var3;
        }
    }
}
