package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class kg1 extends FrameLayout {
    public final int a;
    public final vnb b;
    public final de0 c;
    public final View d;
    public final View e;
    public final ImageView f;
    public final TextView h;
    public final TextView n;
    public final ImageView r;
    public boolean s;

    public kg1(int i, vnb vnbVar, Context context) {
        super(context);
        this.a = i;
        this.b = vnbVar;
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(46.0f));
        addView(de0Var, tre.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        int L = hl.L(11.0f);
        int i2 = aob.d6;
        Drawable K = aob.K(L, aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        view.setBackground(K);
        yob.j(view, K, M, null, vnbVar);
        addView(view, tre.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.e = view2;
        int L2 = hl.L(9.665f);
        int i3 = aob.lk;
        Drawable K2 = aob.K(L2, aob.v0(i3, vnbVar));
        uob M2 = yob.M(i3);
        view2.setBackground(K2);
        yob.j(view2, K2, M2, null, vnbVar);
        addView(view2, tre.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, tre.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 16.0f);
        yob.X(textView, aob.G6, vnbVar);
        jn7.i(textView);
        TextView m = ik8.m(linearLayout, textView, tre.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.n = m;
        m.setMaxLines(1);
        m.setSingleLine(true);
        m.setEllipsize(truncateAt);
        m.setTextSize(1, 14.0f);
        yob.X(m, aob.z6, vnbVar);
        linearLayout.addView(m, tre.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        yob.s(imageView2, aob.M6, vnbVar, PorterDuff.Mode.SRC_IN);
        imageView2.setImageResource(2131232064);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, tre.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.s) {
            canvas.drawRect(hl.L(72.0f), getHeight() - 1, getWidth(), getHeight(), aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(58.0f), 1073741824));
    }
}
