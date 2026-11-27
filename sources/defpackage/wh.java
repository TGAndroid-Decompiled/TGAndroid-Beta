package defpackage;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
import org.telegram.ui.Components.NumberTextView;
public final class wh extends yk2 {
    public final Context b;
    public final NumberTextView c;

    public wh(int i, Context context, NumberTextView numberTextView) {
        super(i);
        this.b = context;
        this.c = numberTextView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            hl.z3(this.c);
        }
        return filter;
    }
}
