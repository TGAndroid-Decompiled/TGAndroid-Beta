package gi;
public final class n implements Runnable {
    public final int f13273a;
    public final la f13274b;

    public n(la laVar, int i3) {
        this.f13273a = i3;
        this.f13274b = laVar;
    }

    @Override
    public final void run() {
        switch (this.f13273a) {
            case 0:
                this.f13274b.n();
                return;
            case 1:
                la laVar = this.f13274b;
                laVar.K0 = false;
                laVar.L0 = Integer.MIN_VALUE;
                laVar.invalidate();
                laVar.S0.setVisibility(0);
                laVar.T0.setVisibility(0);
                return;
            default:
                va vaVar = this.f13274b.S1;
                ja jaVar = vaVar.Y0;
                if (jaVar != null) {
                    jaVar.P = false;
                    jaVar.c();
                    ja jaVar2 = vaVar.Y0;
                    jaVar2.m(0L);
                    fb fbVar = jaVar2.G;
                    if (fbVar != null) {
                        fbVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
