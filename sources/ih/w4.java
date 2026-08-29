package ih;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class w4 extends org.telegram.ui.ActionBar.g1 {
    public final int H;
    public long I;
    public u4 J;

    public w4(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(0, context, c6Var, false, false);
        this.H = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        c(g6.v0(g6.E8, c6Var), g6.v0(g6.F8, c6Var));
        setIconColor(-1);
        this.f22965c.setTranslationX(AndroidUtilities.dp(2.0f));
        this.f22965c.setScaleX(1.2f);
        this.f22965c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f22965c.addOnAttachStateChangeListener(new df.b(this, 2));
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
