package kg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tk0;
public final class w1 extends tk0 {
    public final b1 f11321c;

    public w1(b1 b1Var) {
        this.f11321c = b1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int b() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        b1 b1Var = this.f11321c;
        ArrayList arrayList = b1Var.f11353e3;
        if (arrayList.isEmpty()) {
            return;
        }
        y1 y1Var = (y1) c1Var.f47909a;
        y1Var.f11345r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        y1Var.f11346s = true;
        y1Var.a(true ^ b1Var.f11358j3, false, false);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        y1 y1Var = new y1(this.f11321c, viewGroup.getContext());
        y1Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(y1Var);
    }
}
