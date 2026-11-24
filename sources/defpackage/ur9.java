package defpackage;

import java.util.ArrayList;
public final class ur9 implements Runnable {
    public final byte a;
    public final wr9 b;

    public ur9(wr9 wr9Var, byte b) {
        this.a = b;
        this.b = wr9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wr9 wr9Var = this.b;
        switch (b) {
            case 0:
                wr9Var.g(false);
                return;
            case 1:
                wr9Var.o = false;
                return;
            case 2:
                wr9Var.o = false;
                wr9Var.l = false;
                return;
            case 3:
                wr9Var.k();
                return;
            default:
                if (!wr9Var.o) {
                    wr9Var.o = true;
                    ArrayList arrayList = new ArrayList(wr9Var.j);
                    cf7 Y = cf7.Y(wr9Var.a);
                    Y.a.c(new ak8(wr9Var, Y, arrayList, (byte) 25));
                    return;
                }
                return;
        }
    }
}
