package nh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.p70;
public final class v1 implements View.OnLongClickListener {
    public final int f15963a;
    public final d4 f15964b;

    public v1(d4 d4Var, int i10) {
        this.f15963a = i10;
        this.f15964b = d4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f15963a) {
            case 0:
                d4 d4Var = this.f15964b;
                boolean z4 = false;
                if (d4Var.D0(true)) {
                    return false;
                }
                p70 F = p70.F(d4Var.G0.v, d4Var.f15237y0, view);
                F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new w1(d4Var, 6), false);
                if (d4Var.I3 > 0) {
                    z4 = true;
                }
                F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new w1(d4Var, 7), z4);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                d4 d4Var2 = this.f15964b;
                d4Var2.I0.k(d4Var2.D0(false));
                return true;
        }
    }
}
