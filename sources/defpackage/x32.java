package defpackage;

import android.location.Location;
public final class x32 implements vs2 {
    public final byte a;
    public final c42 b;

    public x32(c42 c42Var, byte b) {
        this.a = b;
        this.b = c42Var;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        c42 c42Var = this.b;
        switch (b) {
            case 0:
                c42Var.T((ty4) obj);
                return;
            default:
                c42Var.a0((Location) obj);
                return;
        }
    }
}
