package ag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.tk0;
public final class f1 extends tk0 {
    public final Context f513c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final h1 f514f;

    public f1(h1 h1Var, Context context) {
        this.f514f = h1Var;
        this.f513c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.size() + 2;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == b() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void f() {
        super.f();
        this.f514f.O();
    }

    @Override
    public final void t(s4.c1 r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: ag.f1.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View y2Var;
        Context context = this.f513c;
        if (i10 != 0) {
            if (i10 != 1) {
                y2Var = new View(context);
                y2Var.setTag(-33024);
            } else {
                y2Var = new View(context);
                y2Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
                y2Var.setTag(-33024);
            }
        } else {
            y2Var = new y2(context, this.f514f.f30963a, false);
        }
        return new s4.c1(y2Var);
    }
}
