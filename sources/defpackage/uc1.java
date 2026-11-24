package defpackage;
public final class uc1 implements Runnable {
    public final byte a;
    public final l9b b;

    public uc1(l9b l9bVar, byte b) {
        this.a = b;
        this.b = l9bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        l9b l9bVar = this.b;
        switch (b) {
            case 0:
                l9bVar.n();
                return;
            case 1:
                l9bVar.K0 = false;
                l9bVar.L0 = Integer.MIN_VALUE;
                l9bVar.invalidate();
                l9bVar.S0.setVisibility(0);
                l9bVar.T0.setVisibility(0);
                return;
            default:
                v9b v9bVar = l9bVar.S1;
                k9b k9bVar = v9bVar.Y0;
                if (k9bVar != null) {
                    k9bVar.P = false;
                    k9bVar.b();
                    k9b k9bVar2 = v9bVar.Y0;
                    k9bVar2.m(0L);
                    lqb lqbVar = k9bVar2.G;
                    if (lqbVar != null) {
                        lqbVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
