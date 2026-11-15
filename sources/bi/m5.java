package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
public final class m5 extends org.telegram.ui.ActionBar.z0 {
    public final int W;
    public long f3715a0;
    public k5 f3716b0;

    public m5(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(0, context, e6Var, false, false);
        this.W = i7;
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        c(i10, i11);
        g(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN);
        this.f29901c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        a(2);
        setBackground(null);
        this.f29901c.addOnAttachStateChangeListener(new x1(this, 3));
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
