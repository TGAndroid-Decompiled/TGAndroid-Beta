package defpackage;

import android.app.Activity;
public final class ax9 extends z2b {
    public final byte L;
    public final bj3 M;

    public ax9(bj3 bj3Var, Activity activity, tk4 tk4Var, byte b) {
        super(activity, tk4Var, 1, null);
        this.L = b;
        this.M = bj3Var;
    }

    @Override
    public final void setVisibility(int i) {
        byte b = this.L;
        bj3 bj3Var = this.M;
        switch (b) {
            case 0:
                if (bj3Var.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i);
                    return;
                }
            case 1:
                if (bj3Var.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i);
                    return;
                }
            case 2:
                if (bj3Var.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i);
                    return;
                }
            default:
                if (bj3Var.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i);
                    return;
                }
        }
    }
}
