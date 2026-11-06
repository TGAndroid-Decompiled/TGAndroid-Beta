package bi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class g7 extends org.telegram.ui.Components.ga {
    public ArrayList S1;
    public LimitPreviewView T1;

    public final void d1(long j3) {
        ArrayList arrayList = this.S1;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.T1.j((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j3, (TL_stars.StarGiftUpgradePrice) jg.g.i(1, arrayList));
        }
    }
}
