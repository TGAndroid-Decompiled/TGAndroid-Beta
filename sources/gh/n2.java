package gh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.o71;
import org.telegram.ui.ProfileActivity;

public final class n2 implements Utilities.Callback {

    public final int f7461a;

    public final d4 f7462b;

    public n2(d4 d4Var, int i10) {
        this.f7461a = i10;
        this.f7462b = d4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f7461a) {
            case 0:
                d4 d4Var = this.f7462b;
                d4Var.f7200e.b((String) obj, new n2(d4Var, 1));
                break;
            default:
                d4 d4Var2 = this.f7462b;
                d4Var2.f(true);
                o71 o71Var = d4Var2.f7202n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                o71Var.d(i10, d4Var2.f7200e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = d4Var2.f7197a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                d4Var2.n();
                break;
        }
    }
}
