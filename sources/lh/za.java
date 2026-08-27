package lh;

import org.telegram.messenger.AndroidUtilities;

public final class za implements q2 {

    public final sb f17254a;

    public za(sb sbVar) {
        this.f17254a = sbVar;
    }

    @Override
    public final void setInvert(float f10) {
        sb sbVar = this.f17254a;
        AndroidUtilities.setLightNavigationBar(sbVar.f16783n, f10 > 0.5f);
        AndroidUtilities.setLightStatusBar(sbVar.f16783n, f10 > 0.5f);
    }

    @Override
    public final void invalidate() {
    }
}
