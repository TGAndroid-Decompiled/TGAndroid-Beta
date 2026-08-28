package fh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class n5 extends org.telegram.ui.ActionBar.g1 {
    public final int H;
    public long I;
    public l5 J;

    public n5(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(0, context, b6Var, false, false);
        this.H = i9;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var);
        int i10 = org.telegram.ui.ActionBar.f6.F8;
        c(v02, org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        e(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.SRC_IN);
        this.f23405c.setTranslationX(AndroidUtilities.dp(2.0f));
        a(2);
        setBackground(null);
        this.f23405c.addOnAttachStateChangeListener(new af.b(this, 3));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
    }
}
