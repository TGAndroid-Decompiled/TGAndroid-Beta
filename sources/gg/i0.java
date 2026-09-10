package gg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i0 extends s4.d0 {
    public final j0 f8908r;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f8908r = j0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.a2.z(8.0f, ((n0) this.f8908r.V).f8964s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
