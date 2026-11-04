package gi;
public final class ba implements m2 {
    public final va f12465a;

    public ba(va vaVar) {
        this.f12465a = vaVar;
    }

    @Override
    public final void setInvert(float f10) {
        boolean z10;
        va vaVar = this.f12465a;
        ua uaVar = vaVar.f13738n;
        int i3 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        boolean z11 = false;
        if (i3 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.o3(uaVar, z10);
        ua uaVar2 = vaVar.f13738n;
        if (i3 > 0) {
            z11 = true;
        }
        org.telegram.messenger.g0.r3(uaVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
