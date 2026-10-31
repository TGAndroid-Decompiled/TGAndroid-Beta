package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;
public final class pu implements Comparator {
    public final int f17480a;
    public final Spanned f17481b;

    public pu(Spanned spanned, int i10) {
        this.f17480a = i10;
        this.f17481b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f17480a) {
            case 0:
                Spanned spanned = this.f17481b;
                spanStart = spanned.getSpanStart((org.telegram.ui.Cells.p9) obj2);
                spanStart2 = spanned.getSpanStart((org.telegram.ui.Cells.p9) obj);
                break;
            default:
                Spanned spanned2 = this.f17481b;
                spanStart = spanned2.getSpanStart((tu) obj2);
                spanStart2 = spanned2.getSpanStart((tu) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
