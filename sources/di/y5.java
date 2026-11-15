package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class y5 extends org.telegram.ui.Components.ca {
    public ArrayList W1;
    public LimitPreviewView X1;

    public final void d1(long j3) {
        ArrayList arrayList = this.W1;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.X1.j((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j3, (TL_stars.StarGiftUpgradePrice) i5.c.h(1, arrayList));
        }
    }
}
