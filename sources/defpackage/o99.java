package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
public final class o99 extends a8 {
    public final int W;
    public long a0;
    public m99 b0;

    public o99(int i, wjb wjbVar, Context context) {
        super(0, wjbVar, context, false, false);
        this.W = i;
        setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        int i2 = bkb.D8;
        int i3 = bkb.E8;
        c(i2, i3);
        g(bkb.v0(i3, wjbVar), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(gl.L(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new wc(this, (byte) 15));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = gl.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }
}
