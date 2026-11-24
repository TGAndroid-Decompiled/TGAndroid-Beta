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
public final class bg1 extends FrameLayout {
    public final int a;
    public final wjb b;
    public final be0 c;
    public final View d;
    public final View e;
    public final ImageView f;
    public final TextView h;
    public final TextView n;
    public final ImageView r;
    public boolean s;

    public bg1(int i, wjb wjbVar, Context context) {
        super(context);
        this.a = i;
        this.b = wjbVar;
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(46.0f));
        addView(be0Var, nme.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        int L = gl.L(11.0f);
        int i2 = bkb.c6;
        Drawable K = bkb.K(L, bkb.v0(i2, wjbVar));
        vkb M = zkb.M(i2);
        view.setBackground(K);
        zkb.j(view, K, M, null, wjbVar);
        addView(view, nme.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.e = view2;
        int L2 = gl.L(9.665f);
        int i3 = bkb.kk;
        Drawable K2 = bkb.K(L2, bkb.v0(i3, wjbVar));
        vkb M2 = zkb.M(i3);
        view2.setBackground(K2);
        zkb.j(view2, K2, M2, null, wjbVar);
        addView(view2, nme.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, nme.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.F6, wjbVar);
        kk7.i(textView);
        TextView m = ug8.m(linearLayout, textView, nme.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.n = m;
        m.setMaxLines(1);
        m.setSingleLine(true);
        m.setEllipsize(truncateAt);
        m.setTextSize(1, 14.0f);
        zkb.X(m, bkb.y6, wjbVar);
        linearLayout.addView(m, nme.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        zkb.s(imageView2, bkb.L6, wjbVar, PorterDuff.Mode.SRC_IN);
        imageView2.setImageResource(2131232064);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, nme.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.s) {
            canvas.drawRect(gl.L(72.0f), getHeight() - 1, getWidth(), getHeight(), bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(58.0f), 1073741824));
    }
}
