package jh;

import android.content.Context;
public final class n extends nh.d {
    public final int f12480d0;

    public n(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, z10);
        this.f12480d0 = i10;
    }

    @Override
    public boolean i() {
        switch (this.f12480d0) {
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
