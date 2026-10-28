package fi;

import org.telegram.messenger.AndroidUtilities;
public final class ya implements p2 {
    public final sb f12009a;

    public ya(sb sbVar) {
        this.f12009a = sbVar;
    }

    @Override
    public final void setInvert(float f7) {
        boolean z10;
        sb sbVar = this.f12009a;
        rb rbVar = sbVar.f11644n;
        int i10 = (f7 > 0.5f ? 1 : (f7 == 0.5f ? 0 : -1));
        boolean z11 = false;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightNavigationBar(rbVar, z10);
        rb rbVar2 = sbVar.f11644n;
        if (i10 > 0) {
            z11 = true;
        }
        AndroidUtilities.setLightStatusBar(rbVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
