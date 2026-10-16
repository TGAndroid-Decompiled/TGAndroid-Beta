package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class n6 extends View {
    public final int f3381a;
    public final q6 f3382b;

    public n6(q6 q6Var, Context context, int i10) {
        super(context);
        this.f3381a = i10;
        this.f3382b = q6Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f3381a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f3382b.d.e), 1073741824));
                return;
            default:
                w6 w6Var = this.f3382b.d;
                int i12 = w6Var.f3912x.J;
                if (i12 >= w6Var.f3909r.getPaddingTop() && !w6Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
