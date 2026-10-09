package ci;

import org.telegram.messenger.AndroidUtilities;
public final class rb implements v2 {
    public final lc f5914a;

    public rb(lc lcVar) {
        this.f5914a = lcVar;
    }

    @Override
    public final void setInvert(float f7) {
        boolean z10;
        lc lcVar = this.f5914a;
        kc kcVar = lcVar.f5499n;
        int i10 = (f7 > 0.5f ? 1 : (f7 == 0.5f ? 0 : -1));
        boolean z11 = false;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightNavigationBar(kcVar, z10);
        kc kcVar2 = lcVar.f5499n;
        if (i10 > 0) {
            z11 = true;
        }
        AndroidUtilities.setLightStatusBar(kcVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
