package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x4 extends View {
    public final int f17926a;
    public final a5 f17927b;

    public x4(a5 a5Var, Context context, int i10) {
        super(context);
        this.f17926a = i10;
        this.f17927b = a5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f17926a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f17927b.d.f17030e), 1073741824));
                return;
            default:
                e5 e5Var = this.f17927b.d;
                int i12 = e5Var.f17036x.J;
                if (i12 >= e5Var.f17033r.getPaddingTop() && !e5Var.O) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
