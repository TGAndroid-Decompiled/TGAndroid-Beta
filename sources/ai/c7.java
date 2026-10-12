package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c7 extends View {
    public final int f776a;
    public final f7 f777b;

    public c7(f7 f7Var, Context context, int i10) {
        super(context);
        this.f776a = i10;
        this.f777b = f7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f776a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f777b.d.f1335e), 1073741824));
                return;
            default:
                l7 l7Var = this.f777b.d;
                int i12 = l7Var.f1341x.J;
                if (i12 >= l7Var.f1338r.getPaddingTop() && !l7Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
