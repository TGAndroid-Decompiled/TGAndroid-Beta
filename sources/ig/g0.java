package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hm0;
public final class g0 extends hm0 {
    public final Context f12906c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final i0 f12907f;

    public g0(i0 i0Var, Context context) {
        this.f12907f = i0Var;
        this.f12906c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45941f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == h() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void l() {
        super.l();
        this.f12907f.O();
    }

    @Override
    public final void v(s4.b1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: ig.g0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View u1Var;
        Context context = this.f12906c;
        if (i10 != 0) {
            if (i10 != 1) {
                u1Var = new View(context);
                u1Var.setTag(-33024);
            } else {
                u1Var = new View(context);
                u1Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                u1Var.setTag(-33024);
            }
        } else {
            u1Var = new u1(context, this.f12907f.f28237a, false);
        }
        return new s4.b1(u1Var);
    }
}
