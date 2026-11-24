package defpackage;

import androidx.datastore.core.NativeSharedCounter;
public final class ng7 extends ccb implements eq4 {
    public final byte a;
    public final rg7 b;

    public ng7(rg7 rg7Var, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.b = rg7Var;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        rg7 rg7Var = this.b;
        switch (b) {
            case 0:
                return new ng7(rg7Var, fw2Var, (byte) 0);
            default:
                return new ng7(rg7Var, fw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        ax2 ax2Var = (ax2) obj;
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
            case 0:
                return ((ng7) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
            default:
                return ((ng7) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        NativeSharedCounter nativeSharedCounter = hba.b;
        rg7 rg7Var = this.b;
        qse.b(obj);
        switch (b) {
            case 0:
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((hba) rg7Var.i.getValue()).a));
            default:
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((hba) rg7Var.i.getValue()).a));
        }
    }
}
