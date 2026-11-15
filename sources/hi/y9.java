package hi;
public final class y9 implements m2 {
    public final sa f15435a;

    public y9(sa saVar) {
        this.f15435a = saVar;
    }

    @Override
    public final void setInvert(float f10) {
        boolean z10;
        sa saVar = this.f15435a;
        ra raVar = saVar.f15076n;
        int i7 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        boolean z11 = false;
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.o3(raVar, z10);
        ra raVar2 = saVar.f15076n;
        if (i7 > 0) {
            z11 = true;
        }
        org.telegram.messenger.g0.r3(raVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
