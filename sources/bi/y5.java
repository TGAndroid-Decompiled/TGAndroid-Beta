package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ll0;
public final class y5 extends ll0 implements b9 {
    public final s6 X2;
    public final s6 Y2;

    public y5(s6 s6Var, Context context, b bVar) {
        super(context, bVar);
        this.Y2 = s6Var;
        this.X2 = s6Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.X2.f3720e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.Y2.f3722n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
