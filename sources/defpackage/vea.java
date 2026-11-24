package defpackage;

import android.content.Context;
public final class vea extends gb2 {
    public final byte Ld = 1;

    public vea(Context context, int i) {
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
                    L = gl.L(24.0f);
                } else {
                    i = gl.q.x;
                    L = gl.L(24.0f);
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

    public vea(Context context, int i, boolean z, mv6 mv6Var, wjb wjbVar) {
        super(context, i, z, mv6Var, wjbVar);
    }
}
