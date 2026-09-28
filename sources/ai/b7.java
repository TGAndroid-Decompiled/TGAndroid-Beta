package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b7 extends View {
    public final int f604a;
    public final e7 f605b;

    public b7(e7 e7Var, Context context, int i10) {
        super(context);
        this.f604a = i10;
        this.f605b = e7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f604a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f605b.d.e), 1073741824));
                return;
            default:
                k7 k7Var = this.f605b.d;
                int i12 = k7Var.f1136x.J;
                if (i12 >= k7Var.f1133r.getPaddingTop() && !k7Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
