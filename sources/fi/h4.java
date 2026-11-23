package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ek0;
public final class h4 extends ek0 implements w6 {
    public final b5 f12079f3;
    public final b5 f12080g3;

    public h4(b5 b5Var, Context context, b bVar) {
        super(context, bVar);
        this.f12080g3 = b5Var;
        this.f12079f3 = b5Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f12079f3.f11815e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f12080g3.f11817n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
