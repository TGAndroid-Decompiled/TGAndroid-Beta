package defpackage;

import org.telegram.ui.o;
public final class ut extends itd {
    public final byte a;
    public final Object b;

    public ut(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void x() {
        switch (this.a) {
            case 3:
                ((kea) this.b).T1 = true;
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
                amb ambVar = oVar.R0;
                if (ambVar == null || !ambVar.w()) {
                    return true;
                }
                oVar.R0.e(false);
                return false;
            case 1:
                z = ((w45) obj).m;
                break;
            case 2:
                z = ((n55) obj).d;
                break;
            default:
                return super.y();
        }
        return !z;
    }
}
