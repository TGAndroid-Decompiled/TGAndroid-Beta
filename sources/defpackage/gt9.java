package defpackage;

import android.app.Activity;
public final class gt9 extends zya {
    public final byte L;
    public final hi3 M;

    public gt9(hi3 hi3Var, Activity activity, pi4 pi4Var, byte b) {
        super(activity, pi4Var, 1, null);
        this.L = b;
        this.M = hi3Var;
    }

    @Override
    public final void setVisibility(int i) {
        byte b = this.L;
        hi3 hi3Var = this.M;
        switch (b) {
            case 0:
                if (hi3Var.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i);
                    return;
                }
            case 1:
                if (hi3Var.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i);
                    return;
                }
            case 2:
                if (hi3Var.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i);
                    return;
                }
            default:
                if (hi3Var.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i);
                    return;
                }
        }
    }
}
