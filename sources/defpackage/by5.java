package defpackage;

import java.util.List;
public final class by5 implements Runnable {
    public final byte a;
    public final wy5 b;

    public by5(wy5 wy5Var, byte b) {
        this.a = b;
        this.b = wy5Var;
    }

    @Override
    public final void run() {
        int d;
        byte b = this.a;
        wy5 wy5Var = this.b;
        switch (b) {
            case 0:
                hnb hnbVar = wy5Var.K0;
                if (hnbVar != null) {
                    wy5Var.K0 = null;
                    wy5Var.removeView(hnbVar);
                    return;
                }
                return;
            case 1:
                if (wy5Var.o0 != null) {
                    wy5Var.q0.postRunnable(new by5(wy5Var, (byte) 4), 200L);
                    return;
                }
                return;
            case 2:
                gx7 gx7Var = wy5Var.V0;
                if (gx7Var != null) {
                    gx7Var.invalidate();
                    return;
                }
                return;
            case 3:
                gx7 gx7Var2 = wy5Var.V0;
                if (gx7Var2 != null) {
                    gx7Var2.invalidate();
                    return;
                }
                return;
            case 4:
                wy5Var.k0();
                return;
            default:
                boolean z = a78.e(wy5Var.z1).k;
                int i = 0;
                while (true) {
                    List list = u01.c;
                    if (i < list.size()) {
                        u01 u01Var = (u01) list.get(i);
                        if (z) {
                            d = u01Var.l();
                        } else {
                            d = u01Var.d();
                        }
                        String m = u01Var.m();
                        l65 l65Var = new l65(wy5Var, u01Var, d, (byte) 3);
                        uy5 uy5Var = new uy5(wy5Var, wy5Var.getContext());
                        uy5Var.setIcon(d);
                        uy5Var.setText(m);
                        uy5Var.setSelected(false);
                        uy5Var.setOnClickListener(new sa5(l65Var, (byte) 15));
                        uy5Var.setOnLongClickListener(new zs(wy5Var, (byte) 5));
                        wy5Var.C1.a(uy5Var, tre.o(-1, 48));
                        i++;
                    } else {
                        return;
                    }
                }
        }
    }
}
