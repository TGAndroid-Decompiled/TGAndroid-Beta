package defpackage;

import java.util.List;
public final class wv5 implements Runnable {
    public final byte a;
    public final rw5 b;

    public wv5(rw5 rw5Var, byte b) {
        this.a = b;
        this.b = rw5Var;
    }

    @Override
    public final void run() {
        int d;
        byte b = this.a;
        rw5 rw5Var = this.b;
        switch (b) {
            case 0:
                ijb ijbVar = rw5Var.Q0;
                if (ijbVar != null) {
                    rw5Var.Q0 = null;
                    rw5Var.removeView(ijbVar);
                    return;
                }
                return;
            case 1:
                if (rw5Var.u0 != null) {
                    rw5Var.w0.postRunnable(new wv5(rw5Var, (byte) 4), 200L);
                    return;
                }
                return;
            case 2:
                zt7 zt7Var = rw5Var.b1;
                if (zt7Var != null) {
                    zt7Var.invalidate();
                    return;
                }
                return;
            case 3:
                zt7 zt7Var2 = rw5Var.b1;
                if (zt7Var2 != null) {
                    zt7Var2.invalidate();
                    return;
                }
                return;
            case 4:
                rw5Var.k0();
                return;
            default:
                boolean z = k38.e(rw5Var.F1).k;
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
                        j45 j45Var = new j45(rw5Var, l01Var, d, (byte) 3);
                        pw5 pw5Var = new pw5(rw5Var, rw5Var.getContext());
                        pw5Var.setIcon(d);
                        pw5Var.setText(m);
                        pw5Var.setSelected(false);
                        pw5Var.setOnClickListener(new b95(j45Var, (byte) 14));
                        pw5Var.setOnLongClickListener(new zs(rw5Var, (byte) 5));
                        rw5Var.I1.a(pw5Var, nme.o(-1, 48));
                        i++;
                    } else {
                        return;
                    }
                }
        }
    }
}
