package defpackage;

import android.net.Uri;
public final class j78 implements p8c {
    public final byte a;
    public final o78 b;
    public final boolean c;

    public j78(o78 o78Var, boolean z, byte b) {
        this.a = b;
        this.b = o78Var;
        this.c = z;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        o78 o78Var = this.b;
        Uri uri = (Uri) obj;
        switch (b) {
            case 0:
                u21.F(o78Var.b.f0, z).j();
                return;
            default:
                u21.F(o78Var.b.f0, z).j();
                return;
        }
    }
}
