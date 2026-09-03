package ig;

import android.content.Context;
import org.telegram.messenger.Emoji;
import org.telegram.ui.ActionBar.k5;
public final class c extends k5 {
    public final int J0;

    public c(Context context, int i10) {
        super(context);
        this.J0 = i10;
    }

    @Override
    public boolean k(CharSequence charSequence) {
        switch (this.J0) {
            case 0:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            case 1:
            case 2:
            default:
                return super.k(charSequence);
            case 3:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            case 4:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
        }
    }

    @Override
    public boolean l(CharSequence charSequence, boolean z4) {
        switch (this.J0) {
            case 2:
                return super.l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), z4);
            case 5:
                return super.l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            default:
                return super.l(charSequence, z4);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.J0) {
            case 1:
                super.onMeasure(i10, i11);
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
