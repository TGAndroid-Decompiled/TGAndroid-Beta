package ci;

import org.telegram.messenger.AndroidUtilities;
public final class ub implements x2 {
    public final oc f5636a;

    public ub(oc ocVar) {
        this.f5636a = ocVar;
    }

    @Override
    public final void setInvert(float f7) {
        boolean z10;
        oc ocVar = this.f5636a;
        nc ncVar = ocVar.f5243n;
        boolean z11 = false;
        int i10 = (f7 > 0.5f ? 1 : (f7 == 0.5f ? 0 : -1));
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightNavigationBar(ncVar, z10);
        nc ncVar2 = ocVar.f5243n;
        if (i10 > 0) {
            z11 = true;
        }
        AndroidUtilities.setLightStatusBar(ncVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
