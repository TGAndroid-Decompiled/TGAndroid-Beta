package nh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;
public final class j4 extends sl0 implements a7 {
    public final d5 U2;
    public final d5 V2;

    public j4(d5 d5Var, Context context, b bVar) {
        super(context, bVar);
        this.V2 = d5Var;
        this.U2 = d5Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.U2.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.V2.f15269n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
