package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k6 extends View {
    public final int f3230a;
    public final n6 f3231b;

    public k6(n6 n6Var, Context context, int i10) {
        super(context);
        this.f3230a = i10;
        this.f3231b = n6Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f3230a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f3231b.d.f3720e), 1073741824));
                return;
            default:
                s6 s6Var = this.f3231b.d;
                int i12 = s6Var.f3726x.J;
                if (i12 >= s6Var.f3723r.getPaddingTop() && !s6Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
