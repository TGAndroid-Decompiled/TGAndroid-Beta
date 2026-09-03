package kh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class v4 extends org.telegram.ui.ActionBar.g1 {
    public final int I;
    public long J;
    public t4 K;

    public v4(Context context, int i10, f6 f6Var) {
        super(0, context, f6Var, false, false);
        this.I = i10;
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        c(j6.v0(j6.E8, f6Var), j6.v0(j6.F8, f6Var));
        setIconColor(-1);
        this.f19679c.setTranslationX(AndroidUtilities.dp(2.0f));
        this.f19679c.setScaleX(1.2f);
        this.f19679c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.f19679c.addOnAttachStateChangeListener(new ef.b(this, 2));
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
