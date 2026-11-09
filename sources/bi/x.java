package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.sj0;
public final class x extends n61 {
    public final y[] f5002a = new y[3];
    public final Context f5003b;
    public final sj0 f5004c;
    public final z d;

    public x(z zVar, Context context, sj0 sj0Var) {
        this.d = zVar;
        this.f5003b = context;
        this.f5004c = sj0Var;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f5004c.L(view);
    }

    @Override
    public final View d(int i7) {
        y[] yVarArr = this.f5002a;
        if (yVarArr[i7] == null) {
            yVarArr[i7] = new y(this.d, this.f5003b, i7);
        }
        return yVarArr[i7];
    }

    @Override
    public final int e() {
        return this.f5002a.length;
    }

    @Override
    public final CharSequence g(int i7) {
        int i10;
        if (i7 == 1) {
            i10 = 2131744919;
        } else if (i7 == 2) {
            i10 = 2131744918;
        } else {
            i10 = 2131744920;
        }
        return org.telegram.messenger.id.M0(i10, null);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }
}
