package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.uj0;
public final class j4 extends uj0 implements z6 {
    public final c5 f11897f3;
    public final c5 f11898g3;

    public j4(c5 c5Var, Context context, b bVar) {
        super(context, bVar);
        this.f11898g3 = c5Var;
        this.f11897f3 = c5Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f11897f3.f11600e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f11898g3.f11602n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
