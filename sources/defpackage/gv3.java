package defpackage;

import android.content.Context;
public final class gv3 extends v26 {
    public final byte q;
    public final Object r;

    public gv3(byte b, Context context, Object obj) {
        super(context, 2);
        this.q = b;
        this.r = obj;
    }

    @Override
    public final void e() {
        byte b = this.q;
        Object obj = this.r;
        switch (b) {
            case 0:
                ((jv3) obj).j3 = true;
                return;
            case 1:
                ((t14) obj).g0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((tx9) obj).y1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        byte b = this.q;
        Object obj = this.r;
        switch (b) {
            case 0:
                ((jv3) obj).j3 = false;
                return;
            case 1:
                ((t14) obj).g0 = false;
                return;
            case 2:
                ((uz3) obj).Q.g0 = false;
                return;
            case 3:
                ((iw9) obj).R.y1 = false;
                return;
            case 4:
                ((tx9) obj).y1 = false;
                return;
            default:
                ((iw9) obj).R.y1 = false;
                return;
        }
    }
}
