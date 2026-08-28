package ih;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.x60;
public final class w1 implements View.OnLongClickListener {
    public final int f12286a;
    public final i4 f12287b;

    public w1(i4 i4Var, int i9) {
        this.f12286a = i9;
        this.f12287b = i4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f12286a) {
            case 0:
                i4 i4Var = this.f12287b;
                boolean z10 = false;
                if (i4Var.D0(true)) {
                    return false;
                }
                x60 F = x60.F(i4Var.F0.v, i4Var.f11603x0, view);
                F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new x1(i4Var, 6), false);
                if (i4Var.H3 > 0) {
                    z10 = true;
                }
                F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new x1(i4Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                i4 i4Var2 = this.f12287b;
                i4Var2.H0.k(i4Var2.D0(false));
                return true;
        }
    }
}
