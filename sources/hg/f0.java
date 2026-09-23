package hg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f0 extends s4.d0 {
    public final g0 f10256r;

    public f0(g0 g0Var, Context context) {
        super(context);
        this.f10256r = g0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.z0.z(8.0f, ((k0) this.f10256r.V).f10312s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
