package defpackage;

import androidx.datastore.core.NativeSharedCounter;
public final class wi7 extends yfb implements is4 {
    public final byte a;
    public final aj7 b;

    public wi7(aj7 aj7Var, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.b = aj7Var;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        aj7 aj7Var = this.b;
        switch (b) {
            case 0:
                return new wi7(aj7Var, zw2Var, (byte) 0);
            default:
                return new wi7(aj7Var, zw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
            case 0:
                return ((wi7) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
            default:
                return ((wi7) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        NativeSharedCounter nativeSharedCounter = yea.b;
        aj7 aj7Var = this.b;
        ixe.b(obj);
        switch (b) {
            case 0:
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((yea) aj7Var.i.getValue()).a));
            default:
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((yea) aj7Var.i.getValue()).a));
        }
    }
}
