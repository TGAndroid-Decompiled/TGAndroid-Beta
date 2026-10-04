package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b7 extends View {
    public final int f655a;
    public final e7 f656b;

    public b7(e7 e7Var, Context context, int i10) {
        super(context);
        this.f655a = i10;
        this.f656b = e7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f655a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f656b.d.f1218e), 1073741824));
                return;
            default:
                k7 k7Var = this.f656b.d;
                int i12 = k7Var.f1224x.J;
                if (i12 >= k7Var.f1221r.getPaddingTop() && !k7Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
