package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;
import org.telegram.messenger.RichMessageLayout;
public final class uh implements Comparator {
    public final int f21446a;
    public final Spanned f21447b;

    public uh(Spanned spanned, int i10) {
        this.f21446a = i10;
        this.f21447b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$withReplacements$0;
        int lambda$new$0;
        switch (this.f21446a) {
            case 0:
                lambda$withReplacements$0 = RichMessageLayout.RichBlock.lambda$withReplacements$0(this.f21447b, (org.telegram.ui.Cells.y9) obj, (org.telegram.ui.Cells.y9) obj2);
                return lambda$withReplacements$0;
            default:
                lambda$new$0 = RichMessageLayout.Text.lambda$new$0(this.f21447b, (RichMessageLayout.RichButtonSpan) obj, (RichMessageLayout.RichButtonSpan) obj2);
                return lambda$new$0;
        }
    }
}
