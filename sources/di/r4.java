package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.pj0;
public final class r4 extends pj0 implements f7 {
    public final k5 f9697e3;
    public final k5 f9698f3;

    public r4(k5 k5Var, Context context, b bVar) {
        super(context, bVar);
        this.f9698f3 = k5Var;
        this.f9697e3 = k5Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f9697e3.f9302e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f9698f3.f9304n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
