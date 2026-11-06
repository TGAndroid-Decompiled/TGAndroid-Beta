package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.rj0;
public final class x extends h61 {
    public final y[] f5004a = new y[3];
    public final Context f5005b;
    public final rj0 f5006c;
    public final z d;

    public x(z zVar, Context context, rj0 rj0Var) {
        this.d = zVar;
        this.f5005b = context;
        this.f5006c = rj0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f5006c.L(view);
    }

    @Override
    public final View d(int i7) {
        y[] yVarArr = this.f5004a;
        if (yVarArr[i7] == null) {
            yVarArr[i7] = new y(this.d, this.f5005b, i7);
        }
        return yVarArr[i7];
    }

    @Override
    public final int e() {
        return this.f5004a.length;
    }

    @Override
    public final CharSequence g(int i7) {
        int i10;
        if (i7 == 1) {
            i10 = 2131744920;
        } else if (i7 == 2) {
            i10 = 2131744919;
        } else {
            i10 = 2131744921;
        }
        return org.telegram.messenger.hd.M0(i10, null);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }
}
