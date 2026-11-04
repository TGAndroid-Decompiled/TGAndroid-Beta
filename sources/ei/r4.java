package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.tj0;
public final class r4 extends tj0 implements g7 {
    public final k5 f10866f3;
    public final k5 f10867g3;

    public r4(k5 k5Var, Context context, b bVar) {
        super(context, bVar);
        this.f10867g3 = k5Var;
        this.f10866f3 = k5Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f10866f3.f10574e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        this.f10867g3.f10576n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i3, i10);
    }
}
