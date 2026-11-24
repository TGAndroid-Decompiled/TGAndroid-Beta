package defpackage;

import java.util.List;
import org.telegram.ui.ActionBar.d;
public final class dv7 implements Runnable {
    public final byte a;
    public final xv7 b;

    public dv7(xv7 xv7Var, byte b) {
        this.a = b;
        this.b = xv7Var;
    }

    @Override
    public final void run() {
        int d;
        byte b = this.a;
        xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                aw7 aw7Var = xv7Var.T0;
                if (aw7Var != null) {
                    aw7Var.invalidate();
                    return;
                }
                return;
            case 1:
                new kj8((d) new qv0(xv7Var, (byte) 8), 14, true).show();
                return;
            case 2:
                aw7 aw7Var2 = xv7Var.T0;
                if (aw7Var2 != null) {
                    aw7Var2.invalidate();
                    return;
                }
                return;
            case 3:
                xv7Var.y0(false);
                return;
            default:
                boolean z = m58.e(xv7Var.v1).k;
                int i = 0;
                while (true) {
                    List list = t11.c;
                    if (i < list.size()) {
                        t11 t11Var = (t11) list.get(i);
                        if (z) {
                            d = t11Var.l();
                        } else {
                            d = t11Var.d();
                        }
                        String m = t11Var.m();
                        h65 h65Var = new h65(xv7Var, t11Var, d, (byte) 19);
                        vv7 vv7Var = new vv7(xv7Var, xv7Var.getContext());
                        vv7Var.setIcon(d);
                        vv7Var.setText(m);
                        vv7Var.setSelected(false);
                        vv7Var.setOnClickListener(new m67(h65Var, (byte) 4));
                        vv7Var.setOnLongClickListener(new au(xv7Var, (byte) 6));
                        xv7Var.y1.a(vv7Var, qoe.o(-1, 48));
                        i++;
                    } else {
                        return;
                    }
                }
        }
    }
}
