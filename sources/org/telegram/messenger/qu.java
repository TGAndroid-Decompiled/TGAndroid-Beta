package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;
public final class qu implements Comparator {
    public final int f17815a;
    public final Spanned f17816b;

    public qu(Spanned spanned, int i10) {
        this.f17815a = i10;
        this.f17816b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f17815a) {
            case 0:
                Spanned spanned = this.f17816b;
                spanStart = spanned.getSpanStart((org.telegram.ui.Cells.p9) obj2);
                spanStart2 = spanned.getSpanStart((org.telegram.ui.Cells.p9) obj);
                break;
            default:
                Spanned spanned2 = this.f17816b;
                spanStart = spanned2.getSpanStart((uu) obj2);
                spanStart2 = spanned2.getSpanStart((uu) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
