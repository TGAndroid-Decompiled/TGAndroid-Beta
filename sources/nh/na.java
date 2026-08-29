package nh;

import org.telegram.messenger.AndroidUtilities;
public final class na implements o2 {
    public final gb f18202a;

    public na(gb gbVar) {
        this.f18202a = gbVar;
    }

    @Override
    public final void setInvert(float f9) {
        boolean z10;
        gb gbVar = this.f18202a;
        fb fbVar = gbVar.f17777n;
        boolean z11 = false;
        int i10 = (f9 > 0.5f ? 1 : (f9 == 0.5f ? 0 : -1));
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightNavigationBar(fbVar, z10);
        fb fbVar2 = gbVar.f17777n;
        if (i10 > 0) {
            z11 = true;
        }
        AndroidUtilities.setLightStatusBar(fbVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
