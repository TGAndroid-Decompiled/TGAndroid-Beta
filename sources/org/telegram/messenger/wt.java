package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;
public final class wt implements Comparator {
    public final int f26254a;
    public final Spanned f26255b;

    public wt(Spanned spanned, int i3) {
        this.f26254a = i3;
        this.f26255b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f26254a) {
            case 0:
                Spanned spanned = this.f26255b;
                spanStart = spanned.getSpanStart((org.telegram.ui.Cells.n9) obj2);
                spanStart2 = spanned.getSpanStart((org.telegram.ui.Cells.n9) obj);
                break;
            default:
                Spanned spanned2 = this.f26255b;
                spanStart = spanned2.getSpanStart((au) obj2);
                spanStart2 = spanned2.getSpanStart((au) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
