package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;
public final class bu implements Comparator {
    public final int f22754a;
    public final Spanned f22755b;

    public bu(Spanned spanned, int i7) {
        this.f22754a = i7;
        this.f22755b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f22754a) {
            case 0:
                Spanned spanned = this.f22755b;
                spanStart = spanned.getSpanStart((org.telegram.ui.Cells.n9) obj2);
                spanStart2 = spanned.getSpanStart((org.telegram.ui.Cells.n9) obj);
                break;
            default:
                Spanned spanned2 = this.f22755b;
                spanStart = spanned2.getSpanStart((fu) obj2);
                spanStart2 = spanned2.getSpanStart((fu) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
