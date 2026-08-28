package kh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.ui.Components.l41;
import org.telegram.ui.y50;
public final class e4 implements d5.d {
    public final int f15147a;
    public final int f15148b;
    public final Object f15149c;

    public e4(Object obj, int i9, int i10) {
        this.f15147a = i10;
        this.f15149c = obj;
        this.f15148b = i9;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        switch (this.f15147a) {
            case 0:
                m4 m4Var = (m4) this.f15149c;
                View view = (View) obj;
                h4 h4Var = m4Var.f15689b;
                if (view instanceof l4) {
                    h4Var.getClass();
                    int R = RecyclerView.R(view);
                    l41 G = h4Var.U2.G(R);
                    if (G != null) {
                        l4 l4Var = (l4) view;
                        l4Var.setPosition(m4Var.b(R));
                        if (this.f15148b == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l4Var.b(z10, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                y50.e1((y50) this.f15149c, this.f15148b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
