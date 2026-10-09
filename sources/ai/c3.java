package ai;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.p80;
public final class c3 implements View.OnLongClickListener {
    public final int f753a;
    public final f6 f754b;

    public c3(f6 f6Var, int i10) {
        this.f753a = i10;
        this.f754b = f6Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f753a) {
            case 0:
                f6 f6Var = this.f754b;
                boolean z10 = false;
                if (f6Var.D0(true)) {
                    return false;
                }
                p80 F = p80.F(f6Var.J0.v, f6Var.B0, view);
                F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new d3(f6Var, 6), false);
                if (f6Var.L3 > 0) {
                    z10 = true;
                }
                F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new d3(f6Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                f6 f6Var2 = this.f754b;
                f6Var2.L0.k(f6Var2.D0(false));
                return true;
        }
    }
}
