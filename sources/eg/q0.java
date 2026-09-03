package eg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
public final class q0 extends FrameLayout {
    public final ImageView f5439a;
    public final k5 f5440b;
    public final dg.s1 f5441c;
    public final k5 d;
    public p0 e;
    public o0 f5442f;

    public q0(v0 v0Var, Context context, f6 f6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        i10 = ((g3) v0Var).backgroundPaddingLeft;
        i11 = ((g3) v0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f5439a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Lj, f6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, b6.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        k5 k5Var = new k5(context);
        this.f5440b = k5Var;
        k5Var.setWidthWrapContent(true);
        k5Var.setTextColor(j6.v0(j6.f19987j5, f6Var));
        k5Var.setTextSize(14);
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
        addView(k5Var, b6.d(-2, -2.0f, i13, f10, 0.0f, f11, 0.0f));
        k5 k5Var2 = new k5(context);
        this.d = k5Var2;
        k5Var2.setTextColor(-1);
        k5Var2.setWidthWrapContent(true);
        k5Var2.setTypeface(AndroidUtilities.bold());
        k5Var2.setTextSize(14);
        dg.s1 s1Var = new dg.s1(this, context, f6Var);
        this.f5441c = s1Var;
        s1Var.setWillNotDraw(false);
        s1Var.addView(k5Var2, b6.e(-2, -2, 17));
        addView(s1Var, b6.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        if (this.f5442f != null) {
            f10 = 49.0f;
        } else {
            f10 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
