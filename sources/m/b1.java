package m;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
public abstract class b1 {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i9, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i9, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    public static int b(TextView textView) {
        return textView.getMaxLines();
    }
}
