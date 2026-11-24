package defpackage;

import android.content.Context;
import android.view.ViewGroup;
public final class ya extends jh2 {
    public final byte d;
    public final ViewGroup e;

    public ya(pt4 pt4Var, Context context, r63 r63Var) {
        super(24, r63Var, context);
        this.d = (byte) 2;
        this.e = pt4Var;
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
                ((hg3) viewGroup).invalidate();
                return;
            default:
                super.invalidate();
                ((pt4) viewGroup).invalidate();
                return;
        }
    }

    public ya(ViewGroup viewGroup, Context context, ylb ylbVar, byte b) {
        super(21, ylbVar, context);
        this.d = b;
        this.e = viewGroup;
    }
}
