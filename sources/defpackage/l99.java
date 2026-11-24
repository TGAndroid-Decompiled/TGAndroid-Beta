package defpackage;

import android.content.Context;
import android.view.View;
public final class l99 extends a8 {
    public final int W;
    public long a0;
    public j99 b0;

    public l99(int i, wjb wjbVar, Context context) {
        super(0, wjbVar, context, false, false);
        this.W = i;
        setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        c(bkb.D8, bkb.E8);
        setIconColor(-1);
        this.c.setTranslationX(gl.L(2.0f));
        this.c.setScaleX(1.2f);
        this.c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new wc(this, (byte) 14));
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
