package ci;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i80;
public final class c2 implements View.OnLongClickListener {
    public final int f5270a;
    public final q4 f5271b;

    public c2(q4 q4Var, int i10) {
        this.f5270a = i10;
        this.f5271b = q4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f5270a) {
            case 0:
                q4 q4Var = this.f5271b;
                boolean z10 = false;
                if (q4Var.D0(true)) {
                    return false;
                }
                i80 F = i80.F(q4Var.J0.v, q4Var.B0, view);
                F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new d2(q4Var, 6), false);
                if (q4Var.L3 > 0) {
                    z10 = true;
                }
                F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new d2(q4Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                q4 q4Var2 = this.f5271b;
                q4Var2.L0.k(q4Var2.D0(false));
                return true;
        }
    }
}
