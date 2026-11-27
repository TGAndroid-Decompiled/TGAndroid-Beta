package defpackage;

import android.content.Context;
import android.view.View;
public final class tc9 extends b8 {
    public final int W;
    public long a0;
    public rc9 b0;

    public tc9(int i, vnb vnbVar, Context context) {
        super(0, vnbVar, context, false, false);
        this.W = i;
        setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        c(aob.E8, aob.F8);
        setIconColor(-1);
        this.c.setTranslationX(hl.L(2.0f));
        this.c.setScaleX(1.2f);
        this.c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new xc(this, (byte) 14));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = hl.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }
}
