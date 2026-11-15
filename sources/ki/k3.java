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
import c8.ja;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.i9;
public final class k3 extends FrameLayout {
    public final int f18396a;
    public final e6 f18397b;
    public final i9 f18398c;
    public final View d;
    public final View f18399e;
    public final ImageView f18400f;
    public final TextView h;
    public final TextView f18401n;
    public final ImageView f18402r;
    public boolean f18403s;

    public k3(int i7, Context context, e6 e6Var) {
        super(context);
        this.f18396a = i7;
        this.f18397b = e6Var;
        i9 i9Var = new i9(context);
        this.f18398c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        addView(i9Var, ja.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        int L = org.telegram.messenger.g0.L(11.0f);
        int i10 = j6.f28849d6;
        Drawable L2 = j6.L(L, j6.w0(i10, e6Var));
        m6 M = q6.M(i10);
        view.setBackground(L2);
        q6.j(view, L2, M, null, e6Var);
        addView(view, ja.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f18399e = view2;
        int L3 = org.telegram.messenger.g0.L(9.665f);
        int i11 = j6.lk;
        Drawable L4 = j6.L(L3, j6.w0(i11, e6Var));
        m6 M2 = q6.M(i11);
        view2.setBackground(L4);
        q6.j(view2, L4, M2, null, e6Var);
        addView(view2, ja.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f18400f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, ja.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ja.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        q6.U(textView, j6.G6, e6Var);
        ns.i(textView);
        TextView f10 = i20.f(linearLayout, textView, ja.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f18401n = f10;
        f10.setMaxLines(1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setTextSize(1, 14.0f);
        q6.U(f10, j6.f29260z6, e6Var);
        linearLayout.addView(f10, ja.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f18402r = imageView2;
        q6.s(imageView2, j6.M6, e6Var, PorterDuff.Mode.SRC_IN);
        imageView2.setImageResource(2131232060);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, ja.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f18403s) {
            canvas.drawRect(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth(), getHeight(), j6.f28972k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }
}
