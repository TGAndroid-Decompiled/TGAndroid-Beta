package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;
import org.telegram.ui.Cells.TextSelectionHelper;

public final class RichMessageLayout$Text$$ExternalSyntheticLambda3 implements Comparator {
    public final int $r8$classId;
    public final Spanned f$0;

    public RichMessageLayout$Text$$ExternalSyntheticLambda3(Spanned spanned, int i) {
        this.$r8$classId = i;
        this.f$0 = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return RichMessageLayout.Text.lambda$new$0(this.f$0, (RichMessageLayout.RichButtonSpan) obj, (RichMessageLayout.RichButtonSpan) obj2);
            default:
                return RichMessageLayout.RichBlock.lambda$withReplacements$0(this.f$0, (TextSelectionHelper.ReplaceCopyTextSpannable) obj, (TextSelectionHelper.ReplaceCopyTextSpannable) obj2);
        }
    }
}
