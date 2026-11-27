package defpackage;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
public final class aj extends yk2 {
    public final Context b;

    public aj(Context context) {
        super(255);
        this.b = context;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Vibrator vibrator;
        CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
        if (filter != null && charSequence != null && filter.length() != charSequence.length() && (vibrator = (Vibrator) this.b.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200L);
        }
        return filter;
    }
}
