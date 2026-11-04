package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
public final class u5 extends org.telegram.ui.ActionBar.y0 {
    public final int W;
    public long f1021a0;
    public s5 f1022b0;

    public u5(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(0, context, e6Var, false, false);
        this.W = i3;
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        int i11 = org.telegram.ui.ActionBar.k6.F8;
        c(i10, i11);
        g(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN);
        this.f28814c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        a(2);
        setBackground(null);
        this.f28814c.addOnAttachStateChangeListener(new f2(this, 3));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.g0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
    }
}
