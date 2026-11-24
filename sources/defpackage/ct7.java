package defpackage;

import java.util.List;
import org.telegram.ui.ActionBar.d;
public final class ct7 implements Runnable {
    public final byte a;
    public final wt7 b;

    public ct7(wt7 wt7Var, byte b) {
        this.a = b;
        this.b = wt7Var;
    }

    @Override
    public final void run() {
        int d;
        byte b = this.a;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                zt7 zt7Var = wt7Var.T0;
                if (zt7Var != null) {
                    zt7Var.invalidate();
                    return;
                }
                return;
            case 1:
                new jh8((d) new hu0(wt7Var, (byte) 8), 14, true).show();
                return;
            case 2:
                zt7 zt7Var2 = wt7Var.T0;
                if (zt7Var2 != null) {
                    zt7Var2.invalidate();
                    return;
                }
                return;
            case 3:
                wt7Var.y0(false);
                return;
            default:
                boolean z = k38.e(wt7Var.v1).k;
                int i = 0;
                while (true) {
                    List list = l01.c;
                    if (i < list.size()) {
                        l01 l01Var = (l01) list.get(i);
                        if (z) {
                            d = l01Var.l();
                        } else {
                            d = l01Var.d();
                        }
                        String m = l01Var.m();
                        j45 j45Var = new j45(wt7Var, l01Var, d, (byte) 19);
                        ut7 ut7Var = new ut7(wt7Var, wt7Var.getContext());
                        ut7Var.setIcon(d);
                        ut7Var.setText(m);
                        ut7Var.setSelected(false);
                        ut7Var.setOnClickListener(new fr7(j45Var, (byte) 1));
                        ut7Var.setOnLongClickListener(new zs(wt7Var, (byte) 6));
                        wt7Var.y1.a(ut7Var, nme.o(-1, 48));
                        i++;
                    } else {
                        return;
                    }
                }
        }
    }
}
