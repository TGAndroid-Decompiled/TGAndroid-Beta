package ai;

import android.content.Context;
public final class v extends ei.d {
    public final int f2280h0;

    public v(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, z10);
        this.f2280h0 = i10;
    }

    @Override
    public boolean i() {
        switch (this.f2280h0) {
            case 0:
                return false;
            case 1:
            default:
                return super.i();
            case 2:
                return false;
        }
    }
}
