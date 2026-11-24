package defpackage;

import java.util.LinkedHashSet;
public final class d24 implements Runnable {
    public final e24 a;

    public d24(e24 e24Var) {
        this.a = e24Var;
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        pv3 pv3Var = new pv3(this, str, (byte) 8);
        if (gw3.d(str)) {
            u0b.G3.c(z8c.t0, str, new qy1(linkedHashSet, pv3Var, (byte) 17));
        } else {
            pv3Var.run();
        }
    }
}
