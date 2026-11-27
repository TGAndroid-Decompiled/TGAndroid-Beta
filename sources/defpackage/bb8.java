package defpackage;

import android.net.Uri;
public final class bb8 implements pcc {
    public final byte a;
    public final gb8 b;
    public final boolean c;

    public bb8(gb8 gb8Var, boolean z, byte b) {
        this.a = b;
        this.b = gb8Var;
        this.c = z;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        gb8 gb8Var = this.b;
        Uri uri = (Uri) obj;
        switch (b) {
            case 0:
                d31.F(gb8Var.b.f0, z).j();
                return;
            default:
                d31.F(gb8Var.b.f0, z).j();
                return;
        }
    }
}
