package hg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e0 extends s4.e0 {
    public final f0 f11204r;

    public e0(f0 f0Var, Context context) {
        super(context);
        this.f11204r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(8.0f, ((j0) this.f11204r.V).f11276s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
