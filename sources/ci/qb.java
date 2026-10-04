package ci;

import org.telegram.messenger.AndroidUtilities;
public final class qb implements w2 {
    public final kc f5799a;

    public qb(kc kcVar) {
        this.f5799a = kcVar;
    }

    @Override
    public final void setInvert(float f7) {
        boolean z10;
        kc kcVar = this.f5799a;
        jc jcVar = kcVar.f5414n;
        boolean z11 = false;
        int i10 = (f7 > 0.5f ? 1 : (f7 == 0.5f ? 0 : -1));
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightNavigationBar(jcVar, z10);
        jc jcVar2 = kcVar.f5414n;
        if (i10 > 0) {
            z11 = true;
        }
        AndroidUtilities.setLightStatusBar(jcVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
