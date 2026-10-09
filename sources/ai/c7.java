package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c7 extends View {
    public final int f778a;
    public final f7 f779b;

    public c7(f7 f7Var, Context context, int i10) {
        super(context);
        this.f778a = i10;
        this.f779b = f7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f778a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f779b.d.f1337e), 1073741824));
                return;
            default:
                l7 l7Var = this.f779b.d;
                int i12 = l7Var.f1343x.J;
                if (i12 >= l7Var.f1340r.getPaddingTop() && !l7Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
