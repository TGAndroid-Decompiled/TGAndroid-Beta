package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class d46 extends FrameLayout {
    public final ImageView a;
    public final lka b;
    public final jp0 c;
    public final lka d;
    public c46 e;
    public b46 f;

    public d46(i46 i46Var, Context context, ylb ylbVar) {
        super(context);
        int i;
        float f;
        float f2;
        int i2 = i46.R2;
        int i3 = i46Var.u0;
        setPadding(i3, 0, i3, 0);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        anb.s(imageView, cmb.Bk, ylbVar, PorterDuff.Mode.SRC_IN);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(imageView, qoe.d(24, 24.0f, i | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.b = lkaVar;
        lkaVar.setWidthWrapContent(true);
        anb.W(lkaVar, cmb.i5, ylbVar);
        lkaVar.setTextSize(14);
        boolean z = jb6.a0;
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
        addView(lkaVar, qoe.d(-2, -2.0f, i4, f, 0.0f, f2, 0.0f));
        lka lkaVar2 = new lka(context);
        this.d = lkaVar2;
        lkaVar2.setTextColor(-1);
        lkaVar2.setWidthWrapContent(true);
        lkaVar2.setTypeface(gm.o());
        lkaVar2.setTextSize(14);
        jp0 jp0Var = new jp0(this, context, ylbVar);
        this.c = jp0Var;
        jp0Var.setWillNotDraw(false);
        jp0Var.addView(lkaVar2, qoe.e(-2, -2, 17));
        addView(jp0Var, qoe.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        if (this.f != null) {
            f = 49.0f;
        } else {
            f = 36.0f;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(f), 1073741824));
    }
}
