package lh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.j70;
public final class u1 implements View.OnLongClickListener {
    public final int f16289a;
    public final d4 f16290b;

    public u1(d4 d4Var, int i10) {
        this.f16289a = i10;
        this.f16290b = d4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f16289a) {
            case 0:
                d4 d4Var = this.f16290b;
                boolean z10 = false;
                if (d4Var.D0(true)) {
                    return false;
                }
                j70 F = j70.F(d4Var.F0.v, d4Var.f15539x0, view);
                F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new v1(d4Var, 6), false);
                if (d4Var.H3 > 0) {
                    z10 = true;
                }
                F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new v1(d4Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                d4 d4Var2 = this.f16290b;
                d4Var2.H0.k(d4Var2.D0(false));
                return true;
        }
    }
}
