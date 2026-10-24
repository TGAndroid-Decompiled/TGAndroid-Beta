package ci;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h80;
public final class b2 implements View.OnLongClickListener {
    public final int f5168a;
    public final p4 f5169b;

    public b2(p4 p4Var, int i10) {
        this.f5168a = i10;
        this.f5169b = p4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f5168a) {
            case 0:
                p4 p4Var = this.f5169b;
                boolean z10 = false;
                if (p4Var.C0(true)) {
                    return false;
                }
                h80 F = h80.F(p4Var.J0.v, p4Var.B0, view);
                F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new c2(p4Var, 6), false);
                if (p4Var.L3 > 0) {
                    z10 = true;
                }
                F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new c2(p4Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                p4 p4Var2 = this.f5169b;
                p4Var2.L0.k(p4Var2.C0(false));
                return true;
        }
    }
}
