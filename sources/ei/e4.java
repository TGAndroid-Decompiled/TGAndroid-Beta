package ei;

import android.content.Context;
public final class e4 extends org.telegram.ui.ActionBar.k5 {
    public final int N0;

    public e4(Context context, int i3) {
        super(context);
        this.N0 = i3;
    }

    @Override
    public boolean k(CharSequence charSequence) {
        switch (this.N0) {
            case 2:
                return l(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 3:
                return l(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 4:
            default:
                return super.k(charSequence);
            case 5:
                return l(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
        }
    }

    @Override
    public boolean l(CharSequence charSequence, boolean z10) {
        switch (this.N0) {
            case 1:
                return super.l(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), z10);
            case 4:
                return super.l(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            default:
                return super.l(charSequence, z10);
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.N0) {
            case 0:
                super.onMeasure(i3, i10);
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }
}
