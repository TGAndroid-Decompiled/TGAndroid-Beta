package bi;

import android.content.Context;
import android.view.View;
public final class q7 extends org.telegram.ui.ActionBar.z0 {
    public final int W;
    public long f4014a0;
    public o7 f4015b0;

    public q7(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(0, context, i6Var, false, false);
        this.W = i7;
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        c(org.telegram.ui.ActionBar.n6.E8, org.telegram.ui.ActionBar.n6.F8);
        setIconColor(-1);
        this.f30305c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        this.f30305c.setScaleX(1.2f);
        this.f30305c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f30305c.addOnAttachStateChangeListener(new r2(this, 2));
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
