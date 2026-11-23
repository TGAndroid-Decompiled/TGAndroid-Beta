package hi;
public final class ta implements v2 {
    public final nb f15462a;

    public ta(nb nbVar) {
        this.f15462a = nbVar;
    }

    @Override
    public final void setInvert(float f10) {
        boolean z10;
        nb nbVar = this.f15462a;
        mb mbVar = nbVar.f15095n;
        int i7 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        boolean z11 = false;
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.n3(mbVar, z10);
        mb mbVar2 = nbVar.f15095n;
        if (i7 > 0) {
            z11 = true;
        }
        org.telegram.messenger.g0.q3(mbVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
