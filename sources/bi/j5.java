package bi;

import android.content.Context;
import org.telegram.messenger.Emoji;
public final class j5 extends org.telegram.ui.ActionBar.j5 {
    public final int M0;

    public j5(Context context, int i10) {
        super(context);
        this.M0 = i10;
    }

    @Override
    public boolean k(CharSequence charSequence) {
        switch (this.M0) {
            case 2:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            case 3:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            case 4:
            default:
                return super.k(charSequence);
            case 5:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
        }
    }

    @Override
    public boolean l(CharSequence charSequence, boolean z10) {
        switch (this.M0) {
            case 1:
                return super.l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), z10);
            case 4:
                return super.l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            default:
                return super.l(charSequence, z10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.M0) {
            case 0:
                super.onMeasure(i10, i11);
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
