package defpackage;
public final class yq1 implements Runnable {
    public final mu1 a;

    public yq1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override
    public final void run() {
        String G;
        mu1 mu1Var = this.a;
        k27 k27Var = mu1Var.v5;
        if (k27Var != null && mu1Var.l9 != null) {
            int max = Math.max(0, k27Var.k.ttl_period - (mu1Var.getConnectionsManager().getCurrentTime() - mu1Var.v5.k.date));
            if (max < 86400) {
                G = gl.g0(max, false, true);
            } else {
                G = k96.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            mu1Var.l9.setSubtext(k96.a0(null, null, 2131753850, G));
            gl.d3(mu1Var.m9, 1000L);
        }
    }
}
