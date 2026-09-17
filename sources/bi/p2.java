package bi;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n70;
public final class p2 implements View.OnLongClickListener {
    public final int f3496a;
    public final o5 f3497b;

    public p2(o5 o5Var, int i10) {
        this.f3496a = i10;
        this.f3497b = o5Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f3496a) {
            case 0:
                o5 o5Var = this.f3497b;
                boolean z10 = false;
                if (o5Var.D0(true)) {
                    return false;
                }
                n70 F = n70.F(o5Var.J0.v, o5Var.B0, view);
                F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new q2(o5Var, 6), false);
                if (o5Var.L3 > 0) {
                    z10 = true;
                }
                F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new q2(o5Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                o5 o5Var2 = this.f3497b;
                o5Var2.L0.k(o5Var2.D0(false));
                return true;
        }
    }
}
