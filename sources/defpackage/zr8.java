package defpackage;

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class zr8 implements qac {
    public final byte a;
    public final vs8 b;

    public zr8(vs8 vs8Var, byte b) {
        this.a = b;
        this.b = vs8Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        vs8 vs8Var = this.b;
        switch (b) {
            case 0:
                vs8Var.f(true);
                vgc vgcVar = vs8Var.n;
                int i = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                vgcVar.e(i, vs8Var.e.f(i) + 1);
                d dVar = vs8Var.a;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).n3(true);
                }
                vs8Var.o();
                return;
            default:
                vs8Var.e.b(new zr8(vs8Var, (byte) 0), (String) obj);
                return;
        }
    }
}
