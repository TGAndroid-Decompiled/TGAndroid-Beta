package gh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class g5 extends org.telegram.ui.ActionBar.f1 {
    public final int H;
    public long I;
    public e5 J;

    public g5(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(0, context, c6Var, false, false);
        this.H = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var);
        int i11 = org.telegram.ui.ActionBar.g6.F8;
        c(iV0, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        e(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN);
        this.f22913c.setTranslationX(AndroidUtilities.dp(2.0f));
        a(2);
        setBackground(null);
        this.f22913c.addOnAttachStateChangeListener(new bf.b(this, 3));
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
