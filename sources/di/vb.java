package di;

import org.telegram.messenger.AndroidUtilities;
public final class vb implements x2 {
    public final pc f8328a;

    public vb(pc pcVar) {
        this.f8328a = pcVar;
    }

    @Override
    public final void setInvert(float f7) {
        boolean z10;
        pc pcVar = this.f8328a;
        oc ocVar = pcVar.f7910n;
        boolean z11 = false;
        int i10 = (f7 > 0.5f ? 1 : (f7 == 0.5f ? 0 : -1));
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightNavigationBar(ocVar, z10);
        oc ocVar2 = pcVar.f7910n;
        if (i10 > 0) {
            z11 = true;
        }
        AndroidUtilities.setLightStatusBar(ocVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
