package fi;

import android.content.Context;
public final class u3 extends org.telegram.ui.ActionBar.n5 {
    public final int N0;

    public u3(Context context, int i7) {
        super(context);
        this.N0 = i7;
    }

    @Override
    public boolean k(CharSequence charSequence) {
        switch (this.N0) {
            case 2:
                return l(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 3:
                return l(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 4:
            default:
                return super.k(charSequence);
            case 5:
                return l(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
        }
    }

    @Override
    public boolean l(CharSequence charSequence, boolean z10) {
        switch (this.N0) {
            case 1:
                return super.l(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), z10);
            case 4:
                return super.l(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            default:
                return super.l(charSequence, z10);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.N0) {
            case 0:
                super.onMeasure(i7, i10);
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }
}
