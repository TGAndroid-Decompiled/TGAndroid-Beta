package ci;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i80;
public final class b2 implements View.OnLongClickListener {
    public final int f5166a;
    public final p4 f5167b;

    public b2(p4 p4Var, int i10) {
        this.f5166a = i10;
        this.f5167b = p4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f5166a) {
            case 0:
                p4 p4Var = this.f5167b;
                boolean z10 = false;
                if (p4Var.D0(true)) {
                    return false;
                }
                i80 F = i80.F(p4Var.J0.v, p4Var.B0, view);
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
                p4 p4Var2 = this.f5167b;
                p4Var2.L0.k(p4Var2.D0(false));
                return true;
        }
    }
}
