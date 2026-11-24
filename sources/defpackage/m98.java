package defpackage;

import android.net.Uri;
public final class m98 implements qac {
    public final byte a;
    public final r98 b;
    public final boolean c;

    public m98(r98 r98Var, boolean z, byte b) {
        this.a = b;
        this.b = r98Var;
        this.c = z;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        r98 r98Var = this.b;
        Uri uri = (Uri) obj;
        switch (b) {
            case 0:
                c41.F(r98Var.b.f0, z).j();
                return;
            default:
                c41.F(r98Var.b.f0, z).j();
                return;
        }
    }
}
