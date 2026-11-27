package defpackage;

import java.util.ArrayList;
public final class lt9 implements Runnable {
    public final byte a;
    public final nt9 b;

    public lt9(nt9 nt9Var, byte b) {
        this.a = b;
        this.b = nt9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nt9 nt9Var = this.b;
        switch (b) {
            case 0:
                nt9Var.o = false;
                nt9Var.l = false;
                return;
            case 1:
                nt9Var.o = false;
                return;
            case 2:
                nt9Var.k();
                return;
            case 3:
                nt9Var.g(false);
                return;
            default:
                if (!nt9Var.o) {
                    nt9Var.o = true;
                    ArrayList arrayList = new ArrayList(nt9Var.j);
                    jf7 Y = jf7.Y(nt9Var.a);
                    Y.a.c(new jr9(nt9Var, Y, arrayList, (byte) 1));
                    return;
                }
                return;
        }
    }
}
