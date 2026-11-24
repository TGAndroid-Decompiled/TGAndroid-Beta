package defpackage;

import android.app.Activity;
public final class iv9 extends a1b {
    public final byte L;
    public final sj3 M;

    public iv9(sj3 sj3Var, Activity activity, tk4 tk4Var, byte b) {
        super(activity, tk4Var, 1, null);
        this.L = b;
        this.M = sj3Var;
    }

    @Override
    public final void setVisibility(int i) {
        byte b = this.L;
        sj3 sj3Var = this.M;
        switch (b) {
            case 0:
                if (sj3Var.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i);
                    return;
                }
            case 1:
                if (sj3Var.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i);
                    return;
                }
            case 2:
                if (sj3Var.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i);
                    return;
                }
            default:
                if (sj3Var.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i);
                    return;
                }
        }
    }
}
