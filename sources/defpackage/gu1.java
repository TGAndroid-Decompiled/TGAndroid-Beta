package defpackage;

import android.view.View;
public final class gu1 extends ro {
    public final byte b;
    public final fu1 c;

    public gu1(fu1 fu1Var, byte b) {
        super("p2", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = fu1Var;
                super("progress", (byte) 0);
                return;
            case 2:
                this.c = fu1Var;
                super("alpha", (byte) 0);
                return;
            default:
                this.c = fu1Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f) {
        byte b = this.b;
        fu1 fu1Var = this.c;
        switch (b) {
            case 0:
                ((g47) obj).e = f;
                View view = fu1Var.c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ((g47) obj).g = f;
                View view2 = fu1Var.c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                ((g47) obj).f = f;
                View view3 = fu1Var.c.R.fragmentView;
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
                return Float.valueOf(((g47) obj).e);
            case 1:
                return Float.valueOf(((g47) obj).g);
            default:
                return Float.valueOf(((g47) obj).f);
        }
    }
}
