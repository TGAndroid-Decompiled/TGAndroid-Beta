package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class usa extends py0 {
    public ArrayList V1;
    public LimitPreviewView W1;

    public final void Y0(long j) {
        ArrayList arrayList = this.V1;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.W1.k((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j, (TL_stars.StarGiftUpgradePrice) b10.f(1, arrayList));
        }
    }
}
