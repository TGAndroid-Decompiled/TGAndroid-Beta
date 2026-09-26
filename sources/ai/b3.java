package ai;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.z70;
public final class b3 implements View.OnLongClickListener {
    public final int f580a;
    public final e6 f581b;

    public b3(e6 e6Var, int i10) {
        this.f580a = i10;
        this.f581b = e6Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f580a) {
            case 0:
                e6 e6Var = this.f581b;
                boolean z10 = false;
                if (e6Var.D0(true)) {
                    return false;
                }
                z70 F = z70.F(e6Var.J0.v, e6Var.B0, view);
                F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new c3(e6Var, 6), false);
                if (e6Var.L3 > 0) {
                    z10 = true;
                }
                F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new c3(e6Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                e6 e6Var2 = this.f581b;
                e6Var2.L0.k(e6Var2.D0(false));
                return true;
        }
    }
}
