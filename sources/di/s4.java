package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.qj0;
public final class s4 extends qj0 implements g7 {
    public final l5 f9728e3;
    public final l5 f9729f3;

    public s4(l5 l5Var, Context context, b bVar) {
        super(context, bVar);
        this.f9729f3 = l5Var;
        this.f9728e3 = l5Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f9728e3.f9326e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f9729f3.f9328n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
