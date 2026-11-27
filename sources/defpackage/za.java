package defpackage;

import android.content.Context;
import android.view.ViewGroup;
public final class za extends og2 {
    public final byte d;
    public final ViewGroup e;

    public za(st4 st4Var, Context context, x53 x53Var) {
        super(24, x53Var, context);
        this.d = (byte) 2;
        this.e = st4Var;
    }

    @Override
    public final void invalidate() {
        byte b = this.d;
        ViewGroup viewGroup = this.e;
        switch (b) {
            case 0:
                super.invalidate();
                ((cb) viewGroup).invalidate();
                return;
            case 1:
                super.invalidate();
                ((of3) viewGroup).invalidate();
                return;
            default:
                super.invalidate();
                ((st4) viewGroup).invalidate();
                return;
        }
    }

    public za(ViewGroup viewGroup, Context context, vnb vnbVar, byte b) {
        super(21, vnbVar, context);
        this.d = b;
        this.e = viewGroup;
    }
}
