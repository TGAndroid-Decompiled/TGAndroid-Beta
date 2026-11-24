package defpackage;

import android.location.Location;
public final class i52 implements gu2 {
    public final byte a;
    public final n52 b;

    public i52(n52 n52Var, byte b) {
        this.a = b;
        this.b = n52Var;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        n52 n52Var = this.b;
        switch (b) {
            case 0:
                n52Var.S((s05) obj);
                return;
            default:
                n52Var.a0((Location) obj);
                return;
        }
    }
}
