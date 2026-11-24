package defpackage;

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class xp8 implements p8c {
    public final byte a;
    public final tq8 b;

    public xp8(tq8 tq8Var, byte b) {
        this.a = b;
        this.b = tq8Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        tq8 tq8Var = this.b;
        switch (b) {
            case 0:
                tq8Var.f(true);
                vec vecVar = tq8Var.n;
                int i = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                vecVar.e(i, tq8Var.e.f(i) + 1);
                d dVar = tq8Var.a;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).j3(true);
                }
                tq8Var.o();
                return;
            default:
                tq8Var.e.b(new xp8(tq8Var, (byte) 0), (String) obj);
                return;
        }
    }
}
