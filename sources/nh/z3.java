package nh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.ui.Components.w41;
import org.telegram.ui.a60;
public final class z3 implements f5.d {
    public final int f18955a;
    public final int f18956b;
    public final Object f18957c;

    public z3(Object obj, int i10, int i11) {
        this.f18955a = i11;
        this.f18957c = obj;
        this.f18956b = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        switch (this.f18955a) {
            case 0:
                g4 g4Var = (g4) this.f18957c;
                View view = (View) obj;
                b4 b4Var = g4Var.f17694b;
                if (view instanceof f4) {
                    b4Var.getClass();
                    int R = RecyclerView.R(view);
                    w41 G = b4Var.U2.G(R);
                    if (G != null) {
                        f4 f4Var = (f4) view;
                        f4Var.setPosition(g4Var.b(R));
                        if (this.f18956b == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f4Var.b(z10, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                a60.e1((a60) this.f18957c, this.f18956b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
