package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yl0;
public final class p6 extends yl0 implements s9 {
    public final j7 X2;
    public final j7 Y2;

    public p6(j7 j7Var, Context context, d dVar) {
        super(context, dVar);
        this.Y2 = j7Var;
        this.X2 = j7Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.X2.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.Y2.f1048n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
