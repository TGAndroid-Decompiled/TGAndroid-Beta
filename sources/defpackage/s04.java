package defpackage;

import java.util.LinkedHashSet;
public final class s04 implements Runnable {
    public final t04 a;

    public s04(t04 t04Var) {
        this.a = t04Var;
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        eu3 eu3Var = new eu3(this, str, (byte) 7);
        if (vu3.d(str)) {
            tya.G3.c(y6c.t0, str, new pz1(linkedHashSet, eu3Var, (byte) 16));
        } else {
            eu3Var.run();
        }
    }
}
