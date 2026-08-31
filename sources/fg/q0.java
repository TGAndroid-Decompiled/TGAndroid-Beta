package fg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
public final class q0 extends FrameLayout {
    public final ImageView f6507a;
    public final l5 f6508b;
    public final eg.q1 f6509c;
    public final l5 d;
    public p0 f6510e;
    public o0 f6511f;

    public q0(v0 v0Var, Context context, g6 g6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        i10 = ((h3) v0Var).backgroundPaddingLeft;
        i11 = ((h3) v0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f6507a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.Lj, g6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, c6.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        l5 l5Var = new l5(context);
        this.f6508b = l5Var;
        l5Var.setWidthWrapContent(true);
        l5Var.setTextColor(k6.v0(k6.f21766j5, g6Var));
        l5Var.setTextSize(14);
        boolean z4 = LocaleController.isRTL;
        int i13 = (z4 ? 5 : 3) | 16;
        if (z4) {
            f10 = 30.0f;
        } else {
            f10 = 60.0f;
        }
        if (z4) {
            f11 = 60.0f;
        } else {
            f11 = 30.0f;
        }
        addView(l5Var, c6.d(-2, -2.0f, i13, f10, 0.0f, f11, 0.0f));
        l5 l5Var2 = new l5(context);
        this.d = l5Var2;
        l5Var2.setTextColor(-1);
        l5Var2.setWidthWrapContent(true);
        l5Var2.setTypeface(AndroidUtilities.bold());
        l5Var2.setTextSize(14);
        eg.q1 q1Var = new eg.q1(this, context, g6Var);
        this.f6509c = q1Var;
        q1Var.setWillNotDraw(false);
        q1Var.addView(l5Var2, c6.e(-2, -2, 17));
        addView(q1Var, c6.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        if (this.f6511f != null) {
            f10 = 49.0f;
        } else {
            f10 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
