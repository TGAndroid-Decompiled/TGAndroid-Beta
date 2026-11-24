package defpackage;

import java.util.ArrayList;
public final class tp9 implements Runnable {
    public final byte a;
    public final vp9 b;

    public tp9(vp9 vp9Var, byte b) {
        this.a = b;
        this.b = vp9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vp9 vp9Var = this.b;
        switch (b) {
            case 0:
                vp9Var.g(false);
                return;
            case 1:
                vp9Var.o = false;
                return;
            case 2:
                vp9Var.o = false;
                vp9Var.l = false;
                return;
            case 3:
                vp9Var.k();
                return;
            default:
                if (!vp9Var.o) {
                    vp9Var.o = true;
                    ArrayList arrayList = new ArrayList(vp9Var.j);
                    ad7 Y = ad7.Y(vp9Var.a);
                    Y.a.c(new gm8(vp9Var, Y, arrayList, (byte) 22));
                    return;
                }
                return;
        }
    }
}
