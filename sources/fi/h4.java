package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ek0;
public final class h4 extends ek0 implements w6 {
    public final a5 f12030f3;
    public final a5 f12031g3;

    public h4(a5 a5Var, Context context, b bVar) {
        super(context, bVar);
        this.f12031g3 = a5Var;
        this.f12030f3 = a5Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f12030f3.f11723e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f12031g3.f11725n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
