package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l5 extends View {
    public final int f5517a;
    public final o5 f5518b;

    public l5(o5 o5Var, Context context, int i10) {
        super(context);
        this.f5517a = i10;
        this.f5518b = o5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f5517a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f5518b.d.e), 1073741824));
                return;
            default:
                t5 t5Var = this.f5518b.d;
                int i12 = t5Var.f5955x.J;
                if (i12 >= t5Var.f5952r.getPaddingTop() && !t5Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
