package ig;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d0 extends s4.c0 {
    public final e0 f12851r;

    public d0(e0 e0Var, Context context) {
        super(context);
        this.f12851r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.g0.A(8.0f, ((i0) this.f12851r.V).f12917s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
