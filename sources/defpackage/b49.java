package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
public final class b49 extends q7c {
    public final int n3;

    public b49(d dVar, a49 a49Var, int i) {
        super(dVar, a49Var, null, null);
        this.n3 = i;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int min = Math.min(gm.L(220.0f), View.MeasureSpec.getSize(i));
        View.MeasureSpec.getSize(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(pqe.b(this.n3, 1, 5) * 48), 1073741824));
    }
}
