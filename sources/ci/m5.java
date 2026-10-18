package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m5 extends View {
    public final int f5618a;
    public final p5 f5619b;

    public m5(p5 p5Var, Context context, int i10) {
        super(context);
        this.f5618a = i10;
        this.f5619b = p5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f5618a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f5619b.d.e), 1073741824));
                return;
            default:
                u5 u5Var = this.f5619b.d;
                int i12 = u5Var.f6057x.J;
                if (i12 >= u5Var.f6054r.getPaddingTop() && !u5Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
