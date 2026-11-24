package defpackage;
public final class ks1 implements Runnable {
    public final yv1 a;

    public ks1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override
    public final void run() {
        String G;
        yv1 yv1Var = this.a;
        k47 k47Var = yv1Var.v5;
        if (k47Var != null && yv1Var.l9 != null) {
            int max = Math.max(0, k47Var.k.ttl_period - (yv1Var.getConnectionsManager().getCurrentTime() - yv1Var.v5.k.date));
            if (max < 86400) {
                G = gm.g0(max, false, true);
            } else {
                G = jb6.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            yv1Var.l9.setSubtext(jb6.a0(null, null, 2131753818, G));
            gm.d3(yv1Var.m9, 1000L);
        }
    }
}
