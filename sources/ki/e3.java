package ki;

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
import c8.ma;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.q9;
public final class e3 extends FrameLayout {
    public final int f18665a;
    public final h6 f18666b;
    public final q9 f18667c;
    public final View d;
    public final View f18668e;
    public final ImageView f18669f;
    public final TextView h;
    public final TextView f18670n;
    public final ImageView f18671r;
    public boolean f18672s;

    public e3(int i7, Context context, h6 h6Var) {
        super(context);
        this.f18665a = i7;
        this.f18666b = h6Var;
        q9 q9Var = new q9(context);
        this.f18667c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        addView(q9Var, ma.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        int L = org.telegram.messenger.g0.L(11.0f);
        int i10 = m6.f29378d6;
        Drawable L2 = m6.L(L, m6.w0(i10, h6Var));
        p6 M = t6.M(i10);
        view.setBackground(L2);
        t6.j(view, L2, M, null, h6Var);
        addView(view, ma.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f18668e = view2;
        int L3 = org.telegram.messenger.g0.L(9.665f);
        int i11 = m6.lk;
        Drawable L4 = m6.L(L3, m6.w0(i11, h6Var));
        p6 M2 = t6.M(i11);
        view2.setBackground(L4);
        t6.j(view2, L4, M2, null, h6Var);
        addView(view2, ma.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f18669f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, ma.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ma.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        t6.U(textView, m6.G6, h6Var);
        ks.i(textView);
        TextView f10 = n10.f(linearLayout, textView, ma.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f18670n = f10;
        f10.setMaxLines(1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setTextSize(1, 14.0f);
        t6.U(f10, m6.f29789z6, h6Var);
        linearLayout.addView(f10, ma.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f18671r = imageView2;
        t6.s(imageView2, m6.M6, h6Var, PorterDuff.Mode.SRC_IN);
        imageView2.setImageResource(2131232061);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, ma.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f18672s) {
            canvas.drawRect(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth(), getHeight(), m6.f29501k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }
}
