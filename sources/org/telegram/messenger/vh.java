package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;
import org.telegram.messenger.RichMessageLayout;
public final class vh implements Comparator {
    public final int f19249a;
    public final Spanned f19250b;

    public vh(Spanned spanned, int i10) {
        this.f19249a = i10;
        this.f19250b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$withReplacements$0;
        int lambda$new$0;
        switch (this.f19249a) {
            case 0:
                lambda$withReplacements$0 = RichMessageLayout.RichBlock.lambda$withReplacements$0(this.f19250b, (org.telegram.ui.Cells.w9) obj, (org.telegram.ui.Cells.w9) obj2);
                return lambda$withReplacements$0;
            default:
                lambda$new$0 = RichMessageLayout.Text.lambda$new$0(this.f19250b, (RichMessageLayout.RichButtonSpan) obj, (RichMessageLayout.RichButtonSpan) obj2);
                return lambda$new$0;
        }
    }
}
