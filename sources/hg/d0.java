package hg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d0 extends s4.d0 {
    public final e0 f10252r;

    public d0(e0 e0Var, Context context) {
        super(context);
        this.f10252r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.B(8.0f, ((i0) this.f10252r.V).f10312s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
