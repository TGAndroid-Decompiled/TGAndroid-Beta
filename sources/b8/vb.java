package b8;

import android.text.SpannableStringBuilder;
public abstract class vb {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i3, int i10) {
        Object[] spans;
        for (Object obj2 : spannableStringBuilder.getSpans(i3, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i3 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i3, i10, 33);
    }
}
