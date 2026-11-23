package hi;
public final class z9 implements m2 {
    public final ta f15832a;

    public z9(ta taVar) {
        this.f15832a = taVar;
    }

    @Override
    public final void setInvert(float f10) {
        boolean z10;
        ta taVar = this.f15832a;
        sa saVar = taVar.f15428n;
        int i7 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        boolean z11 = false;
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.n3(saVar, z10);
        sa saVar2 = taVar.f15428n;
        if (i7 > 0) {
            z11 = true;
        }
        org.telegram.messenger.g0.q3(saVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
