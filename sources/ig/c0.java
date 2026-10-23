package ig;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c0 extends s4.c0 {
    public final d0 f12874r;

    public c0(d0 d0Var, Context context) {
        super(context);
        this.f12874r = d0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.v0.z(8.0f, ((h0) this.f12874r.V).f12943s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
