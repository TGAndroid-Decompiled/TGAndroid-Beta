package ai;

import android.content.Context;
import android.view.View;
public final class r5 extends org.telegram.ui.ActionBar.y0 {
    public final int W;
    public long f949a0;
    public p5 f950b0;

    public r5(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(0, context, e6Var, false, false);
        this.W = i3;
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        c(org.telegram.ui.ActionBar.k6.E8, org.telegram.ui.ActionBar.k6.F8);
        setIconColor(-1);
        this.f28814c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        this.f28814c.setScaleX(1.2f);
        this.f28814c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f28814c.addOnAttachStateChangeListener(new f2(this, 2));
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
