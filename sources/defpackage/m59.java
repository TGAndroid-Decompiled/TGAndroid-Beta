package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.e;
public final class m59 extends q9c {
    public final int n3;

    public m59(e eVar, l59 l59Var, int i) {
        super(eVar, l59Var, null, null);
        this.n3 = i;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int min = Math.min(hl.L(220.0f), View.MeasureSpec.getSize(i));
        View.MeasureSpec.getSize(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(ete.b(this.n3, 1, 5) * 48), 1073741824));
    }
}
