package hi;
public final class n implements Runnable {
    public final int f15026a;
    public final ja f15027b;

    public n(ja jaVar, int i7) {
        this.f15026a = i7;
        this.f15027b = jaVar;
    }

    @Override
    public final void run() {
        switch (this.f15026a) {
            case 0:
                this.f15027b.n();
                return;
            case 1:
                ja jaVar = this.f15027b;
                jaVar.K0 = false;
                jaVar.L0 = Integer.MIN_VALUE;
                jaVar.invalidate();
                jaVar.S0.setVisibility(0);
                jaVar.T0.setVisibility(0);
                return;
            default:
                ta taVar = this.f15027b.S1;
                ha haVar = taVar.Y0;
                if (haVar != null) {
                    haVar.P = false;
                    haVar.c();
                    ha haVar2 = taVar.Y0;
                    haVar2.m(0L);
                    db dbVar = haVar2.G;
                    if (dbVar != null) {
                        dbVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
