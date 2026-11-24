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
public final class jh1 extends FrameLayout {
    public final int a;
    public final ylb b;
    public final bf0 c;
    public final View d;
    public final View e;
    public final ImageView f;
    public final TextView h;
    public final TextView n;
    public final ImageView r;
    public boolean s;

    public jh1(int i, ylb ylbVar, Context context) {
        super(context);
        this.a = i;
        this.b = ylbVar;
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(46.0f));
        addView(bf0Var, qoe.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        int L = gm.L(11.0f);
        int i2 = cmb.c6;
        Drawable K = cmb.K(L, cmb.v0(i2, ylbVar));
        wmb M = anb.M(i2);
        view.setBackground(K);
        anb.j(view, K, M, null, ylbVar);
        addView(view, qoe.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.e = view2;
        int L2 = gm.L(9.665f);
        int i3 = cmb.kk;
        Drawable K2 = cmb.K(L2, cmb.v0(i3, ylbVar));
        wmb M2 = anb.M(i3);
        view2.setBackground(K2);
        anb.j(view2, K2, M2, null, ylbVar);
        addView(view2, qoe.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, qoe.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 16.0f);
        anb.X(textView, cmb.F6, ylbVar);
        nm7.i(textView);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.n = m;
        m.setMaxLines(1);
        m.setSingleLine(true);
        m.setEllipsize(truncateAt);
        m.setTextSize(1, 14.0f);
        anb.X(m, cmb.y6, ylbVar);
        linearLayout.addView(m, qoe.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        anb.s(imageView2, cmb.L6, ylbVar, PorterDuff.Mode.SRC_IN);
        imageView2.setImageResource(2131232065);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, qoe.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.s) {
            canvas.drawRect(gm.L(72.0f), getHeight() - 1, getWidth(), getHeight(), cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(58.0f), 1073741824));
    }
}
