package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
public final class ob9 extends a8 {
    public final int W;
    public long a0;
    public mb9 b0;

    public ob9(int i, ylb ylbVar, Context context) {
        super(0, ylbVar, context, false, false);
        this.W = i;
        setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        int i2 = cmb.D8;
        int i3 = cmb.E8;
        c(i2, i3);
        g(cmb.v0(i3, ylbVar), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(gm.L(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new wd(this, (byte) 15));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = gm.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }
}
