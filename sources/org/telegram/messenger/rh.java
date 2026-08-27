package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;

public final class rh implements Comparator {

    public final int f21444a;

    public final Spanned f21445b;

    public rh(Spanned spanned, int i10) {
        this.f21444a = i10;
        this.f21445b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f21444a) {
            case 0:
                return RichMessageLayout.RichBlock.lambda$withReplacements$0(this.f21445b, (org.telegram.ui.Cells.p9) obj, (org.telegram.ui.Cells.p9) obj2);
            default:
                return RichMessageLayout.Text.lambda$new$0(this.f21445b, (RichMessageLayout.RichButtonSpan) obj, (RichMessageLayout.RichButtonSpan) obj2);
        }
    }
}
