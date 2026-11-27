package defpackage;

import java.util.LinkedHashSet;
public final class n14 implements Runnable {
    public final o14 a;

    public n14(o14 o14Var) {
        this.a = o14Var;
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        vx3 vx3Var = new vx3(this, str, (byte) 5);
        if (pv3.d(str)) {
            t2b.G3.c(yac.t0, str, new rx1(linkedHashSet, vx3Var, (byte) 17));
        } else {
            vx3Var.run();
        }
    }
}
