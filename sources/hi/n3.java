package hi;

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
import c8.ha;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.l9;
public final class n3 extends FrameLayout {
    public final int f14815a;
    public final g6 f14816b;
    public final l9 f14817c;
    public final View d;
    public final View f14818e;
    public final ImageView f14819f;
    public final TextView h;
    public final TextView f14820n;
    public final ImageView f14821r;
    public boolean f14822s;

    public n3(int i7, Context context, g6 g6Var) {
        super(context);
        this.f14815a = i7;
        this.f14816b = g6Var;
        l9 l9Var = new l9(context);
        this.f14817c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        addView(l9Var, ha.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        int L = org.telegram.messenger.g0.L(11.0f);
        int i10 = l6.f27865d6;
        Drawable L2 = l6.L(L, l6.w0(i10, g6Var));
        o6 M = s6.M(i10);
        view.setBackground(L2);
        s6.j(view, L2, M, null, g6Var);
        addView(view, ha.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f14818e = view2;
        int L3 = org.telegram.messenger.g0.L(9.665f);
        int i11 = l6.ik;
        Drawable L4 = l6.L(L3, l6.w0(i11, g6Var));
        o6 M2 = s6.M(i11);
        view2.setBackground(L4);
        s6.j(view2, L4, M2, null, g6Var);
        addView(view2, ha.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f14819f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, ha.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ha.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        s6.U(textView, l6.G6, g6Var);
        qs.i(textView);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, ha.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f14820n = f10;
        f10.setMaxLines(1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setTextSize(1, 14.0f);
        s6.U(f10, l6.f28275z6, g6Var);
        linearLayout.addView(f10, ha.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f14821r = imageView2;
        s6.s(imageView2, l6.M6, g6Var, PorterDuff.Mode.SRC_IN);
        imageView2.setImageResource(2131232059);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, ha.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f14822s) {
            canvas.drawRect(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth(), getHeight(), l6.f27988k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }
}
