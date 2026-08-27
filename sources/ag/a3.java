package ag;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

public final class a3 extends yk0 {

    public final w1 f290c;

    public a3(w1 w1Var) {
        this.f290c = w1Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final int h() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        w1 w1Var = this.f290c;
        ArrayList arrayList = w1Var.T2;
        if (arrayList.isEmpty()) {
            return;
        }
        c3 c3Var = (c3) o1Var.f5789a;
        c3Var.f325r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        c3Var.f326s = true;
        c3Var.a(true ^ w1Var.Y2, false, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        c3 c3Var = new c3(this.f290c, viewGroup.getContext());
        c3Var.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(c3Var);
    }
}
