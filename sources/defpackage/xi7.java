package defpackage;

import androidx.datastore.core.NativeSharedCounter;
public final class xi7 extends yfb implements is4 {
    public final byte a;
    public final bj7 b;

    public xi7(bj7 bj7Var, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.b = bj7Var;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        bj7 bj7Var = this.b;
        switch (b) {
            case 0:
                return new xi7(bj7Var, zw2Var, (byte) 0);
            default:
                return new xi7(bj7Var, zw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
            case 0:
                return ((xi7) create(ux2Var, zw2Var)).invokeSuspend(g9cVar);
            default:
                return ((xi7) create(ux2Var, zw2Var)).invokeSuspend(g9cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        NativeSharedCounter nativeSharedCounter = yea.b;
        bj7 bj7Var = this.b;
        ixe.b(obj);
        switch (b) {
            case 0:
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((yea) bj7Var.i.getValue()).a));
            default:
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((yea) bj7Var.i.getValue()).a));
        }
    }
}
