package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class uua extends qx0 {
    public ArrayList V1;
    public LimitPreviewView W1;

    public final void Z0(long j) {
        ArrayList arrayList = this.V1;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.W1.k((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j, (TL_stars.StarGiftUpgradePrice) c00.g(1, arrayList));
        }
    }
}
