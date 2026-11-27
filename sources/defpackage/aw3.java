package defpackage;

import android.content.Context;
public final class aw3 extends z46 {
    public final byte q;
    public final Object r;

    public aw3(byte b, Context context, Object obj) {
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
                ((dw3) obj).j3 = true;
                return;
            case 1:
                ((o24) obj).g0 = true;
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                ((n1a) obj).y1 = true;
                return;
        }
    }

    @Override
    public final void i() {
        byte b = this.q;
        Object obj = this.r;
        switch (b) {
            case 0:
                ((dw3) obj).j3 = false;
                return;
            case 1:
                ((o24) obj).g0 = false;
                return;
            case 2:
                ((p04) obj).Q.g0 = false;
                return;
            case 3:
                ((b0a) obj).R.y1 = false;
                return;
            case 4:
                ((n1a) obj).y1 = false;
                return;
            default:
                ((b0a) obj).R.y1 = false;
                return;
        }
    }
}
