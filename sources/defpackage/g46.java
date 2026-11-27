package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class g46 extends FrameLayout {
    public final ImageView a;
    public final ema b;
    public final jo0 c;
    public final ema d;
    public f46 e;
    public e46 f;

    public g46(l46 l46Var, Context context, vnb vnbVar) {
        super(context);
        int i;
        float f;
        float f2;
        int i2 = l46.R2;
        int i3 = l46Var.u0;
        setPadding(i3, 0, i3, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        yob.s(imageView, aob.Ck, vnbVar, PorterDuff.Mode.SRC_IN);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(imageView, tre.d(24, 24.0f, i | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        ema emaVar = new ema(context);
        this.b = emaVar;
        emaVar.setWidthWrapContent(true);
        yob.W(emaVar, aob.j5, vnbVar);
        emaVar.setTextSize(14);
        boolean z = ob6.a0;
        int i4 = (z ? 5 : 3) | 16;
        if (z) {
            f = 30.0f;
        } else {
            f = 60.0f;
        }
        if (z) {
            f2 = 60.0f;
        } else {
            f2 = 30.0f;
        }
        addView(emaVar, tre.d(-2, -2.0f, i4, f, 0.0f, f2, 0.0f));
        ema emaVar2 = new ema(context);
        this.d = emaVar2;
        emaVar2.setTextColor(-1);
        emaVar2.setWidthWrapContent(true);
        emaVar2.setTypeface(hl.o());
        emaVar2.setTextSize(14);
        jo0 jo0Var = new jo0(this, context, vnbVar);
        this.c = jo0Var;
        jo0Var.setWillNotDraw(false);
        jo0Var.addView(emaVar2, tre.e(-2, -2, 17));
        addView(jo0Var, tre.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        if (this.f != null) {
            f = 49.0f;
        } else {
            f = 36.0f;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(f), 1073741824));
    }
}
