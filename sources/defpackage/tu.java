package defpackage;

import org.telegram.ui.o;
public final class tu extends vqd {
    public final byte a;
    public final Object b;

    public tu(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void w() {
        switch (this.a) {
            case 3:
                ((tca) this.b).T1 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean x() {
        boolean z;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                o oVar = (o) obj;
                gkb gkbVar = oVar.R0;
                if (gkbVar == null || !gkbVar.w()) {
                    return true;
                }
                oVar.R0.e(false);
                return false;
            case 1:
                z = ((s45) obj).m;
                break;
            case 2:
                z = ((j55) obj).d;
                break;
            default:
                return super.x();
        }
        return !z;
    }
}
