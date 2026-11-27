package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
public final class cd9 extends b8 {
    public final int W;
    public long a0;
    public ad9 b0;

    public cd9(int i, vnb vnbVar, Context context) {
        super(0, vnbVar, context, false, false);
        this.W = i;
        setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        int i2 = aob.E8;
        int i3 = aob.F8;
        c(i2, i3);
        g(aob.v0(i3, vnbVar), PorterDuff.Mode.SRC_IN);
        this.c.setTranslationX(hl.L(2.0f));
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new xc(this, (byte) 16));
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
