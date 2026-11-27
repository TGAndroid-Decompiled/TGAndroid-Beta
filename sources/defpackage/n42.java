package defpackage;

import android.location.Location;
public final class n42 implements pt2 {
    public final byte a;
    public final s42 b;

    public n42(s42 s42Var, byte b) {
        this.a = b;
        this.b = s42Var;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        s42 s42Var = this.b;
        switch (b) {
            case 0:
                s42Var.S((x05) obj);
                return;
            default:
                s42Var.Z((Location) obj);
                return;
        }
    }
}
