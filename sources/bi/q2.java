package bi;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m80;
public final class q2 implements View.OnLongClickListener {
    public final int f3495a;
    public final q5 f3496b;

    public q2(q5 q5Var, int i10) {
        this.f3495a = i10;
        this.f3496b = q5Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f3495a) {
            case 0:
                q5 q5Var = this.f3496b;
                boolean z10 = false;
                if (q5Var.D0(true)) {
                    return false;
                }
                m80 F = m80.F(q5Var.J0.v, q5Var.B0, view);
                F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new r2(q5Var, 6), false);
                if (q5Var.L3 > 0) {
                    z10 = true;
                }
                F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new r2(q5Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                q5 q5Var2 = this.f3496b;
                q5Var2.L0.k(q5Var2.D0(false));
                return true;
        }
    }
}
