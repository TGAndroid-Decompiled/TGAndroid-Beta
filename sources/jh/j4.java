package jh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zk0;

public final class j4 extends zk0 implements z6 {
    public final c5 T2;
    public final c5 U2;

    public j4(c5 c5Var, Context context, b bVar) {
        super(context, bVar);
        this.U2 = c5Var;
        this.T2 = c5Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.T2.f13153e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.U2.f13155n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
