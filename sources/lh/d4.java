package lh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.ui.Components.n41;
import org.telegram.ui.c60;

public final class d4 implements d5.d {

    public final int f15854a;

    public final int f15855b;

    public final Object f15856c;

    public d4(Object obj, int i10, int i11) {
        this.f15854a = i11;
        this.f15856c = obj;
        this.f15855b = i10;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f15854a) {
            case 0:
                k4 k4Var = (k4) this.f15856c;
                View view = (View) obj;
                f4 f4Var = k4Var.f16228b;
                if (view instanceof j4) {
                    f4Var.getClass();
                    int iR = RecyclerView.R(view);
                    n41 n41VarG = f4Var.U2.G(iR);
                    if (n41VarG != null) {
                        j4 j4Var = (j4) view;
                        j4Var.setPosition(k4Var.b(iR));
                        j4Var.b(this.f15855b == n41VarG.d, true);
                        view.setPressed(false);
                        break;
                    }
                }
                break;
            default:
                c60.e1((c60) this.f15856c, this.f15855b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
