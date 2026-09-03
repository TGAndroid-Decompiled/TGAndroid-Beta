package oh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q70;
public final class v1 implements View.OnLongClickListener {
    public final int f17844a;
    public final f4 f17845b;

    public v1(f4 f4Var, int i10) {
        this.f17844a = i10;
        this.f17845b = f4Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f17844a) {
            case 0:
                f4 f4Var = this.f17845b;
                boolean z4 = false;
                if (f4Var.D0(true)) {
                    return false;
                }
                q70 F = q70.F(f4Var.G0.v, f4Var.f17129y0, view);
                F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new w1(f4Var, 6), false);
                if (f4Var.I3 > 0) {
                    z4 = true;
                }
                F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new w1(f4Var, 7), z4);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                f4 f4Var2 = this.f17845b;
                f4Var2.I0.k(f4Var2.D0(false));
                return true;
        }
    }
}
