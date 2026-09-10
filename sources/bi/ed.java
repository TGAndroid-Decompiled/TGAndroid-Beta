package bi;

import org.telegram.messenger.AndroidUtilities;
public final class ed implements l3 {
    public final ce f2676a;

    public ed(ce ceVar) {
        this.f2676a = ceVar;
    }

    @Override
    public final void setInvert(float f7) {
        boolean z10;
        ce ceVar = this.f2676a;
        be beVar = ceVar.f2470n;
        boolean z11 = false;
        int i10 = (f7 > 0.5f ? 1 : (f7 == 0.5f ? 0 : -1));
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightNavigationBar(beVar, z10);
        be beVar2 = ceVar.f2470n;
        if (i10 > 0) {
            z11 = true;
        }
        AndroidUtilities.setLightStatusBar(beVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
