package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m5 extends View {
    public final int f5617a;
    public final p5 f5618b;

    public m5(p5 p5Var, Context context, int i10) {
        super(context);
        this.f5617a = i10;
        this.f5618b = p5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f5617a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f5618b.d.e), 1073741824));
                return;
            default:
                u5 u5Var = this.f5618b.d;
                int i12 = u5Var.f6056x.J;
                if (i12 >= u5Var.f6053r.getPaddingTop() && !u5Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
