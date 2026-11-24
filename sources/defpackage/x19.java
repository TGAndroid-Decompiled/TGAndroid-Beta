package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
public final class x19 extends q5c {
    public final int n3;

    public x19(d dVar, w19 w19Var, int i) {
        super(dVar, w19Var, null, null);
        this.n3 = i;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int min = Math.min(gl.L(220.0f), View.MeasureSpec.getSize(i));
        View.MeasureSpec.getSize(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(moe.b(this.n3, 1, 5) * 48), 1073741824));
    }
}
