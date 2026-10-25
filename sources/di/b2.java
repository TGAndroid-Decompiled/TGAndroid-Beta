package di;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k80;
public final class b2 implements View.OnLongClickListener {
    public final int f8416a;
    public final q4 f8417b;

    public b2(q4 q4Var, int i10) {
        this.f8416a = i10;
        this.f8417b = q4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f8416a) {
            case 0:
                q4 q4Var = this.f8417b;
                boolean z10 = false;
                if (q4Var.B0(true)) {
                    return false;
                }
                k80 F = k80.F(q4Var.f9047y0.v, q4Var.f9015q0, view);
                F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new c2(q4Var, 6), false);
                if (q4Var.A3 > 0) {
                    z10 = true;
                }
                F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new c2(q4Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                q4 q4Var2 = this.f8417b;
                q4Var2.A0.k(q4Var2.B0(false));
                return true;
        }
    }
}
