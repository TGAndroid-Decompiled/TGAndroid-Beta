package bi;

import android.content.Context;
import android.view.View;
public final class j5 extends org.telegram.ui.ActionBar.z0 {
    public final int W;
    public long f3632a0;
    public h5 f3633b0;

    public j5(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(0, context, e6Var, false, false);
        this.W = i7;
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        c(org.telegram.ui.ActionBar.j6.E8, org.telegram.ui.ActionBar.j6.F8);
        setIconColor(-1);
        this.f29901c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        this.f29901c.setScaleX(1.2f);
        this.f29901c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f29901c.addOnAttachStateChangeListener(new x1(this, 2));
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
