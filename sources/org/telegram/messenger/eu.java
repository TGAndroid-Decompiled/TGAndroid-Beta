package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;
public final class eu implements Comparator {
    public final int f22250a;
    public final Spanned f22251b;

    public eu(Spanned spanned, int i7) {
        this.f22250a = i7;
        this.f22251b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f22250a) {
            case 0:
                Spanned spanned = this.f22251b;
                spanStart = spanned.getSpanStart((org.telegram.ui.Cells.o9) obj2);
                spanStart2 = spanned.getSpanStart((org.telegram.ui.Cells.o9) obj);
                break;
            default:
                Spanned spanned2 = this.f22251b;
                spanStart = spanned2.getSpanStart((iu) obj2);
                spanStart2 = spanned2.getSpanStart((iu) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
