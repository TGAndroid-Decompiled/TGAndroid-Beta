package defpackage;

import android.net.Uri;
public final class k78 implements p8c {
    public final byte a;
    public final p78 b;
    public final boolean c;

    public k78(p78 p78Var, boolean z, byte b) {
        this.a = b;
        this.b = p78Var;
        this.c = z;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        p78 p78Var = this.b;
        Uri uri = (Uri) obj;
        switch (b) {
            case 0:
                u21.F(p78Var.b.f0, z).j();
                return;
            default:
                u21.F(p78Var.b.f0, z).j();
                return;
        }
    }
}
