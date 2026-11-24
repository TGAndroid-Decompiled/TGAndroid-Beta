package defpackage;

import android.content.Context;
public final class dg0 extends lka {
    public final byte N0;

    public dg0(Context context, byte b) {
        super(context);
        this.N0 = b;
    }

    @Override
    public final boolean k(CharSequence charSequence) {
        switch (this.N0) {
            case 0:
                return l(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 4:
                return l(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 5:
                return l(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            default:
                return super.k(charSequence);
        }
    }

    @Override
    public final boolean l(CharSequence charSequence, boolean z) {
        switch (this.N0) {
            case 1:
                return super.l(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), false);
            case 2:
                return super.l(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), z);
            default:
                return super.l(charSequence, z);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.N0) {
            case 3:
                super.onMeasure(i, i2);
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }
}
