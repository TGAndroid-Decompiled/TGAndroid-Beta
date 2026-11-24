package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class zw9 extends FrameLayout {
    public final TextView a;
    public final ry8 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final tx9 f;

    public zw9(tx9 tx9Var, Context context, boolean z) {
        super(context);
        int i;
        this.f = tx9Var;
        LinearLayout j = de9.j(context, 0);
        if (z) {
            i = 3;
        } else {
            i = 17;
        }
        addView(j, nme.e(-2, -2, i));
        ?? imageView = new ImageView(context);
        this.b = imageView;
        imageView.f(2131624310, 20, 20, null);
        int i2 = bkb.Kf;
        wjb wjbVar = tx9Var.a1;
        zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.SRC_ATOP);
        j.addView((View) imageView, nme.o(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, i2, wjbVar);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        j.addView(textView, nme.r(-2, -2, 17));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setImageResource(2131232101);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView2, bkb.Mf, wjbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView2, nme.e(24, 24, 21));
    }

    public final void a(String str, boolean z) {
        this.a.setText(str);
        b(z);
    }

    public final void b(boolean z) {
        float f;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.d = f;
        float L = (1.0f - this.d) * gl.L(-8.0f);
        ry8 ry8Var = this.b;
        ry8Var.setTranslationX(L);
        this.a.setTranslationX((1.0f - this.d) * gl.L(-8.0f));
        ry8Var.setAlpha(this.d);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), 1073741824));
    }
}
