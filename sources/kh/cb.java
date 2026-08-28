package kh;

import org.telegram.messenger.AndroidUtilities;
public final class cb implements r2 {
    public final wb f15055a;

    public cb(wb wbVar) {
        this.f15055a = wbVar;
    }

    @Override
    public final void setInvert(float f10) {
        boolean z10;
        wb wbVar = this.f15055a;
        vb vbVar = wbVar.f16287n;
        boolean z11 = false;
        int i9 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        if (i9 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightNavigationBar(vbVar, z10);
        vb vbVar2 = wbVar.f16287n;
        if (i9 > 0) {
            z11 = true;
        }
        AndroidUtilities.setLightStatusBar(vbVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
