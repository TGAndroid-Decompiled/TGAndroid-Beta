package defpackage;
public final class lr1 implements Runnable {
    public final zu1 a;

    public lr1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override
    public final void run() {
        String G;
        zu1 zu1Var = this.a;
        r47 r47Var = zu1Var.v5;
        if (r47Var != null && zu1Var.l9 != null) {
            int max = Math.max(0, r47Var.k.ttl_period - (zu1Var.getConnectionsManager().getCurrentTime() - zu1Var.v5.k.date));
            if (max < 86400) {
                G = hl.g0(max, false, true);
            } else {
                G = ob6.G(Math.round(max / 86400.0f), "Days", new Object[0]);
            }
            zu1Var.l9.setSubtext(ob6.a0(null, null, 2131753846, G));
            hl.d3(zu1Var.m9, 1000L);
        }
    }
}
