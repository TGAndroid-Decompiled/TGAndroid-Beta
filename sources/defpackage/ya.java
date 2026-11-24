package defpackage;

import android.content.Context;
import android.view.ViewGroup;
public final class ya extends wf2 {
    public final byte d;
    public final ViewGroup e;

    public ya(or4 or4Var, Context context, f53 f53Var) {
        super(24, f53Var, context);
        this.d = (byte) 2;
        this.e = or4Var;
    }

    @Override
    public final void invalidate() {
        byte b = this.d;
        ViewGroup viewGroup = this.e;
        switch (b) {
            case 0:
                super.invalidate();
                ((bb) viewGroup).invalidate();
                return;
            case 1:
                super.invalidate();
                ((ue3) viewGroup).invalidate();
                return;
            default:
                super.invalidate();
                ((or4) viewGroup).invalidate();
                return;
        }
    }

    public ya(ViewGroup viewGroup, Context context, wjb wjbVar, byte b) {
        super(21, wjbVar, context);
        this.d = b;
        this.e = viewGroup;
    }
}
