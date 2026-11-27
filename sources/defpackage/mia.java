package defpackage;

import android.content.Context;
public final class mia extends wb2 {
    public final byte Ld = 1;

    public mia(Context context, int i) {
        super(context, i);
    }

    @Override
    public final int getParentWidth() {
        int i;
        int L;
        switch (this.Ld) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i = getMeasuredWidth();
                    L = hl.L(24.0f);
                } else {
                    i = hl.q.x;
                    L = hl.L(24.0f);
                }
                return i - L;
            default:
                return super.getParentWidth();
        }
    }

    @Override
    public final boolean isPressed() {
        byte b = this.Ld;
        return false;
    }

    public mia(Context context, int i, boolean z, rx6 rx6Var, vnb vnbVar) {
        super(context, i, z, rx6Var, vnbVar);
    }
}
