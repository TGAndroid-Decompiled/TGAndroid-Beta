package ih;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z4 extends View {
    public final int f12372a;
    public final c5 f12373b;

    public z4(c5 c5Var, Context context, int i9) {
        super(context);
        this.f12372a = i9;
        this.f12373b = c5Var;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        switch (this.f12372a) {
            case 0:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f12373b.d.f11478e), 1073741824));
                return;
            default:
                g5 g5Var = this.f12373b.d;
                int i11 = g5Var.f11484x.J;
                if (i11 >= g5Var.f11481r.getPaddingTop() && !g5Var.N) {
                    i11 = 0;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
        }
    }
}
