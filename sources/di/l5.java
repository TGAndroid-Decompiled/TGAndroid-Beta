package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l5 extends View {
    public final int f8757a;
    public final o5 f8758b;

    public l5(o5 o5Var, Context context, int i10) {
        super(context);
        this.f8757a = i10;
        this.f8758b = o5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f8757a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f8758b.d.e), 1073741824));
                return;
            default:
                t5 t5Var = this.f8758b.d;
                int i12 = t5Var.f9199x.J;
                if (i12 >= t5Var.f9196r.getPaddingTop() && !t5Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
