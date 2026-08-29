package cg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
public final class q0 extends FrameLayout {
    public final ImageView f3282a;
    public final h5 f3283b;
    public final bg.u1 f3284c;
    public final h5 d;
    public p0 f3285e;
    public o0 f3286f;

    public q0(v0 v0Var, Context context, c6 c6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f9;
        float f10;
        i10 = ((f3) v0Var).backgroundPaddingLeft;
        i11 = ((f3) v0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f3282a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.Lj, c6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, f6.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        h5 h5Var = new h5(context);
        this.f3283b = h5Var;
        h5Var.setWidthWrapContent(true);
        h5Var.setTextColor(g6.v0(g6.f23169j5, c6Var));
        h5Var.setTextSize(14);
        boolean z10 = LocaleController.isRTL;
        int i13 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f9 = 30.0f;
        } else {
            f9 = 60.0f;
        }
        if (z10) {
            f10 = 60.0f;
        } else {
            f10 = 30.0f;
        }
        addView(h5Var, f6.d(-2, -2.0f, i13, f9, 0.0f, f10, 0.0f));
        h5 h5Var2 = new h5(context);
        this.d = h5Var2;
        h5Var2.setTextColor(-1);
        h5Var2.setWidthWrapContent(true);
        h5Var2.setTypeface(AndroidUtilities.bold());
        h5Var2.setTextSize(14);
        bg.u1 u1Var = new bg.u1(this, context, c6Var);
        this.f3284c = u1Var;
        u1Var.setWillNotDraw(false);
        u1Var.addView(h5Var2, f6.e(-2, -2, 17));
        addView(u1Var, f6.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        if (this.f3286f != null) {
            f9 = 49.0f;
        } else {
            f9 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), 1073741824));
    }
}
