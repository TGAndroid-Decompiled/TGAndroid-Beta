package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qm0;
public final class h0 extends qm0 {
    public final Context f11258c;
    public final ArrayList d = new ArrayList();
    public String f11259e;
    public final j0 f11260f;

    public h0(j0 j0Var, Context context) {
        this.f11260f = j0Var;
        this.f11258c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47786f == 0) {
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
        this.f11260f.O();
    }

    @Override
    public final void v(s4.d1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: hg.h0.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View y1Var;
        Context context = this.f11258c;
        if (i10 != 0) {
            if (i10 != 1) {
                y1Var = new View(context);
                y1Var.setTag(-33024);
            } else {
                y1Var = new View(context);
                y1Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                y1Var.setTag(-33024);
            }
        } else {
            y1Var = new y1(context, this.f11260f.f30244a, false);
        }
        return new s4.d1(y1Var);
    }
}
