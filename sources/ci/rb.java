package ci;

import org.telegram.messenger.AndroidUtilities;
public final class rb implements w2 {
    public final lc f5464a;

    public rb(lc lcVar) {
        this.f5464a = lcVar;
    }

    @Override
    public final void setInvert(float f7) {
        boolean z10;
        lc lcVar = this.f5464a;
        kc kcVar = lcVar.f5066n;
        boolean z11 = false;
        int i10 = (f7 > 0.5f ? 1 : (f7 == 0.5f ? 0 : -1));
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightNavigationBar(kcVar, z10);
        kc kcVar2 = lcVar.f5066n;
        if (i10 > 0) {
            z11 = true;
        }
        AndroidUtilities.setLightStatusBar(kcVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
