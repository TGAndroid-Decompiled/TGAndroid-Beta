package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ek0;
public final class h4 extends ek0 implements w6 {
    public final b5 f12076f3;
    public final b5 f12077g3;

    public h4(b5 b5Var, Context context, b bVar) {
        super(context, bVar);
        this.f12077g3 = b5Var;
        this.f12076f3 = b5Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f12076f3.f11812e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f12077g3.f11814n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
