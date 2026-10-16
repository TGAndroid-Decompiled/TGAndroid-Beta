package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lm0;
public final class g0 extends lm0 {
    public final Context f11514c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final i0 f11515f;

    public g0(i0 i0Var, Context context) {
        this.f11515f = i0Var;
        this.f11514c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 0) {
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
        this.f11515f.O();
    }

    @Override
    public final void v(s4.b1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: ig.g0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View x1Var;
        Context context = this.f11514c;
        if (i10 != 0) {
            if (i10 != 1) {
                x1Var = new View(context);
                x1Var.setTag(-33024);
            } else {
                x1Var = new View(context);
                x1Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                x1Var.setTag(-33024);
            }
        } else {
            x1Var = new x1(context, this.f11515f.f27359a, false);
        }
        return new s4.b1(x1Var);
    }
}
