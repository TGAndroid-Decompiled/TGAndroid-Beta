package fi;
public final class ba implements o2 {
    public final va f11710a;

    public ba(va vaVar) {
        this.f11710a = vaVar;
    }

    @Override
    public final void setInvert(float f10) {
        boolean z9;
        va vaVar = this.f11710a;
        ua uaVar = vaVar.f12975n;
        int i7 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        boolean z10 = false;
        if (i7 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.messenger.g0.o3(uaVar, z9);
        ua uaVar2 = vaVar.f12975n;
        if (i7 > 0) {
            z10 = true;
        }
        org.telegram.messenger.g0.r3(uaVar2, z10);
    }

    @Override
    public final void invalidate() {
    }
}
