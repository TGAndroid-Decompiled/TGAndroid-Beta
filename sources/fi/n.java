package fi;
public final class n implements Runnable {
    public final int f12468a;
    public final la f12469b;

    public n(la laVar, int i7) {
        this.f12468a = i7;
        this.f12469b = laVar;
    }

    @Override
    public final void run() {
        switch (this.f12468a) {
            case 0:
                this.f12469b.n();
                return;
            case 1:
                la laVar = this.f12469b;
                laVar.J0 = false;
                laVar.K0 = Integer.MIN_VALUE;
                laVar.invalidate();
                laVar.R0.setVisibility(0);
                laVar.S0.setVisibility(0);
                return;
            default:
                va vaVar = this.f12469b.R1;
                ja jaVar = vaVar.X0;
                if (jaVar != null) {
                    jaVar.O = false;
                    jaVar.c();
                    ja jaVar2 = vaVar.X0;
                    jaVar2.m(0L);
                    fb fbVar = jaVar2.F;
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
