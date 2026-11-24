package defpackage;

import android.content.Context;
public final class vga extends rc2 {
    public final byte Ld = 1;

    public vga(Context context, int i) {
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
                    L = gm.L(24.0f);
                } else {
                    i = gm.q.x;
                    L = gm.L(24.0f);
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

    public vga(Context context, int i, boolean z, mx6 mx6Var, ylb ylbVar) {
        super(context, i, z, mx6Var, ylbVar);
    }
}
