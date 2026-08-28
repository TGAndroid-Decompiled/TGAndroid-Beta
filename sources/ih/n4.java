package ih;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wk0;
public final class n4 extends wk0 implements c7 {
    public final g5 T2;
    public final g5 U2;

    public n4(g5 g5Var, Context context, b bVar) {
        super(context, bVar);
        this.U2 = g5Var;
        this.T2 = g5Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.T2.f11478e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        this.U2.f11480n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i9, i10);
    }
}
