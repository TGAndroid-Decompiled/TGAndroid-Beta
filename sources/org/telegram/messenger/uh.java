package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;
import org.telegram.messenger.RichMessageLayout;
public final class uh implements Comparator {
    public final int f19353a;
    public final Spanned f19354b;

    public uh(Spanned spanned, int i10) {
        this.f19353a = i10;
        this.f19354b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$withReplacements$0;
        int lambda$new$0;
        switch (this.f19353a) {
            case 0:
                lambda$withReplacements$0 = RichMessageLayout.RichBlock.lambda$withReplacements$0(this.f19354b, (org.telegram.ui.Cells.w9) obj, (org.telegram.ui.Cells.w9) obj2);
                return lambda$withReplacements$0;
            default:
                lambda$new$0 = RichMessageLayout.Text.lambda$new$0(this.f19354b, (RichMessageLayout.RichButtonSpan) obj, (RichMessageLayout.RichButtonSpan) obj2);
                return lambda$new$0;
        }
    }
}
