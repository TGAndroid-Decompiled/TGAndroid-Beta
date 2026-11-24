package defpackage;

import org.telegram.ui.o;
public final class tt extends sod {
    public final byte a;
    public final Object b;

    public tt(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void x() {
        switch (this.a) {
            case 3:
                ((taa) this.b).T1 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean y() {
        boolean z;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                o oVar = (o) obj;
                fib fibVar = oVar.R0;
                if (fibVar == null || !fibVar.w()) {
                    return true;
                }
                oVar.R0.e(false);
                return false;
            case 1:
                z = ((s25) obj).m;
                break;
            case 2:
                z = ((j35) obj).d;
                break;
            default:
                return super.y();
        }
        return !z;
    }
}
