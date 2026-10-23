package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l5 extends View {
    public final int f5521a;
    public final o5 f5522b;

    public l5(o5 o5Var, Context context, int i10) {
        super(context);
        this.f5521a = i10;
        this.f5522b = o5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f5521a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f5522b.d.e), 1073741824));
                return;
            default:
                t5 t5Var = this.f5522b.d;
                int i12 = t5Var.f5961x.J;
                if (i12 >= t5Var.f5958r.getPaddingTop() && !t5Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
