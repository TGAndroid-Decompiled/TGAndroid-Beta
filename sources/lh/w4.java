package lh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class w4 extends org.telegram.ui.ActionBar.g1 {
    public final int I;
    public long J;
    public u4 K;

    public w4(Context context, int i10, g6 g6Var) {
        super(0, context, g6Var, false, false);
        this.I = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        c(k6.v0(k6.E8, g6Var), k6.v0(k6.F8, g6Var));
        setIconColor(-1);
        this.f21375c.setTranslationX(AndroidUtilities.dp(2.0f));
        this.f21375c.setScaleX(1.2f);
        this.f21375c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f21375c.addOnAttachStateChangeListener(new ff.b(this, 4));
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
