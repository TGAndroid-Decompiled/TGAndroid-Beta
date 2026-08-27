package jh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b70;

public final class u1 implements View.OnLongClickListener {

    public final int f14022a;

    public final e4 f14023b;

    public u1(e4 e4Var, int i10) {
        this.f14022a = i10;
        this.f14023b = e4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f14022a) {
            case 0:
                e4 e4Var = this.f14023b;
                if (e4Var.D0(true)) {
                    return false;
                }
                b70 b70VarF = b70.F(e4Var.F0.v, e4Var.f13290x0, view);
                b70VarF.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new v1(e4Var, 6), false);
                b70VarF.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new v1(e4Var, 7), e4Var.H3 > 0);
                b70VarF.V(5);
                b70VarF.U = true;
                b70VarF.Z();
                return true;
            default:
                e4 e4Var2 = this.f14023b;
                e4Var2.H0.k(e4Var2.D0(false));
                return true;
        }
    }
}
