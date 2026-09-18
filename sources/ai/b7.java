package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b7 extends View {
    public final int f589a;
    public final e7 f590b;

    public b7(e7 e7Var, Context context, int i10) {
        super(context);
        this.f589a = i10;
        this.f590b = e7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f589a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f590b.d.e), 1073741824));
                return;
            default:
                j7 j7Var = this.f590b.d;
                int i12 = j7Var.f1055x.J;
                if (i12 >= j7Var.f1052r.getPaddingTop() && !j7Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
