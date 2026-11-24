package defpackage;

import android.view.View;
public final class us1 extends qn {
    public final byte b;
    public final ts1 c;

    public us1(ts1 ts1Var, byte b) {
        super("p2", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = ts1Var;
                super("progress", (byte) 0);
                return;
            case 2:
                this.c = ts1Var;
                super("alpha", (byte) 0);
                return;
            default:
                this.c = ts1Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f) {
        byte b = this.b;
        ts1 ts1Var = this.c;
        switch (b) {
            case 0:
                ((g27) obj).e = f;
                View view = ts1Var.c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ((g27) obj).g = f;
                View view2 = ts1Var.c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                ((g27) obj).f = f;
                View view3 = ts1Var.c.R.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((g27) obj).e);
            case 1:
                return Float.valueOf(((g27) obj).g);
            default:
                return Float.valueOf(((g27) obj).f);
        }
    }
}
