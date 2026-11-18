package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ck0;
public final class h4 extends ck0 implements w6 {
    public final a5 f12035f3;
    public final a5 f12036g3;

    public h4(a5 a5Var, Context context, b bVar) {
        super(context, bVar);
        this.f12036g3 = a5Var;
        this.f12035f3 = a5Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f12035f3.f11728e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f12036g3.f11730n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
