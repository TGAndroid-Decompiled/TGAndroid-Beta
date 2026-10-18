package ei;

import org.telegram.messenger.AndroidUtilities;
public final class bb implements r2 {
    public final vb f8802a;

    public bb(vb vbVar) {
        this.f8802a = vbVar;
    }

    @Override
    public final void setInvert(float f7) {
        boolean z10;
        vb vbVar = this.f8802a;
        ub ubVar = vbVar.f9990n;
        int i10 = (f7 > 0.5f ? 1 : (f7 == 0.5f ? 0 : -1));
        boolean z11 = false;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightNavigationBar(ubVar, z10);
        ub ubVar2 = vbVar.f9990n;
        if (i10 > 0) {
            z11 = true;
        }
        AndroidUtilities.setLightStatusBar(ubVar2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
