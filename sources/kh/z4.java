package kh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class z4 extends org.telegram.ui.ActionBar.g1 {
    public final int I;
    public long J;
    public x4 K;

    public z4(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(0, context, f6Var, false, false);
        this.I = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        int v02 = j6.v0(j6.E8, f6Var);
        int i11 = j6.F8;
        c(v02, j6.v0(i11, f6Var));
        e(j6.v0(i11, f6Var), PorterDuff.Mode.SRC_IN);
        this.f19704c.setTranslationX(AndroidUtilities.dp(2.0f));
        a(2);
        setBackground(null);
        this.f19704c.addOnAttachStateChangeListener(new ff.b(this, 3));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
    }
}
