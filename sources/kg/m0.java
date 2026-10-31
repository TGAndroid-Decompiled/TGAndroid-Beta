package kg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import w7.b6;
public final class m0 extends FrameLayout {
    public final ImageView f11183a;
    public final u5 f11184b;
    public final jg.b1 f11185c;
    public final u5 d;
    public l0 e;
    public k0 f11186f;

    public m0(q0 q0Var, Context context, p6 p6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11 = q0.O2;
        int i12 = q0Var.f21615t0;
        setPadding(i12, 0, i12, 0);
        ImageView imageView = new ImageView(context);
        this.f11183a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        a7.t(imageView, t6.zk, p6Var, PorterDuff.Mode.SRC_IN);
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, b6.d(24, 24.0f, i10 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        u5 u5Var = new u5(context);
        this.f11184b = u5Var;
        u5Var.setWidthWrapContent(true);
        a7.Y(u5Var, t6.f21037j5, p6Var);
        u5Var.setTextSize(14);
        boolean z10 = cd.X;
        int i13 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f7 = 30.0f;
        } else {
            f7 = 60.0f;
        }
        if (z10) {
            f10 = 60.0f;
        } else {
            f10 = 30.0f;
        }
        addView(u5Var, b6.d(-2, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        u5 u5Var2 = new u5(context);
        this.d = u5Var2;
        u5Var2.setTextColor(-1);
        u5Var2.setWidthWrapContent(true);
        u5Var2.setTypeface(org.telegram.messenger.i0.o());
        u5Var2.setTextSize(14);
        jg.b1 b1Var = new jg.b1(this, context, p6Var);
        this.f11185c = b1Var;
        b1Var.setWillNotDraw(false);
        b1Var.addView(u5Var2, b6.e(-2, -2, 17));
        addView(b1Var, b6.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f11186f != null) {
            f7 = 49.0f;
        } else {
            f7 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7), 1073741824));
    }
}
