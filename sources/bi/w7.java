package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
public final class w7 extends org.telegram.ui.ActionBar.y0 {
    public final int W;
    public long f4223a0;
    public u7 f4224b0;

    public w7(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(0, context, h6Var, false, false);
        this.W = i7;
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        int i11 = org.telegram.ui.ActionBar.m6.F8;
        c(i10, i11);
        g(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), PorterDuff.Mode.SRC_IN);
        this.f30286c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        a(2);
        setBackground(null);
        this.f30286c.addOnAttachStateChangeListener(new v2(this, 3));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.g0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
    }
}
