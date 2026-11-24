package defpackage;

import androidx.datastore.core.NativeSharedCounter;
public final class qi7 extends eeb implements fs4 {
    public final byte a;
    public final ui7 b;

    public qi7(ui7 ui7Var, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.b = ui7Var;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        ui7 ui7Var = this.b;
        switch (b) {
            case 0:
                return new qi7(ui7Var, px2Var, (byte) 0);
            default:
                return new qi7(ui7Var, px2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        ky2 ky2Var = (ky2) obj;
        px2 px2Var = (px2) obj2;
        switch (b) {
            case 0:
                return ((qi7) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
            default:
                return ((qi7) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        NativeSharedCounter nativeSharedCounter = hda.b;
        ui7 ui7Var = this.b;
        tue.b(obj);
        switch (b) {
            case 0:
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((hda) ui7Var.i.getValue()).a));
            default:
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((hda) ui7Var.i.getValue()).a));
        }
    }
}
