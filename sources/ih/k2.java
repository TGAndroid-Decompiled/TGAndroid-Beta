package ih;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.y71;
import org.telegram.ui.ProfileActivity;
public final class k2 implements Utilities.Callback {
    public final int f9265a;
    public final x3 f9266b;

    public k2(x3 x3Var, int i10) {
        this.f9265a = i10;
        this.f9266b = x3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9265a) {
            case 0:
                x3 x3Var = this.f9266b;
                x3Var.f9504e.b((String) obj, new k2(x3Var, 1));
                return;
            default:
                x3 x3Var2 = this.f9266b;
                x3Var2.f(true);
                y71 y71Var = x3Var2.f9506n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                y71Var.d(i10, x3Var2.f9504e.f(i10) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = x3Var2.f9501a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                x3Var2.n();
                return;
        }
    }
}
