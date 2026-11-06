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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
public final class n3 extends FrameLayout {
    public final int f14812a;
    public final f6 f14813b;
    public final l9 f14814c;
    public final View d;
    public final View f14815e;
    public final ImageView f14816f;
    public final TextView h;
    public final TextView f14817n;
    public final ImageView f14818r;
    public boolean f14819s;

    public n3(int i7, Context context, f6 f6Var) {
        super(context);
        this.f14812a = i7;
        this.f14813b = f6Var;
        l9 l9Var = new l9(context);
        this.f14814c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        addView(l9Var, ha.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        int L = org.telegram.messenger.g0.L(11.0f);
        int i10 = k6.f27849d6;
        Drawable L2 = k6.L(L, k6.w0(i10, f6Var));
        n6 N = r6.N(i10);
        view.setBackground(L2);
        r6.k(view, L2, N, null, f6Var);
        addView(view, ha.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f14815e = view2;
        int L3 = org.telegram.messenger.g0.L(9.665f);
        int i11 = k6.ik;
        Drawable L4 = k6.L(L3, k6.w0(i11, f6Var));
        n6 N2 = r6.N(i11);
        view2.setBackground(L4);
        r6.k(view2, L4, N2, null, f6Var);
        addView(view2, ha.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f14816f = imageView;
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
        r6.V(textView, k6.G6, f6Var);
        qs.i(textView);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, ha.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f14817n = f10;
        f10.setMaxLines(1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setTextSize(1, 14.0f);
        r6.V(f10, k6.f28259z6, f6Var);
        linearLayout.addView(f10, ha.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f14818r = imageView2;
        r6.t(imageView2, k6.M6, f6Var, PorterDuff.Mode.SRC_IN);
        imageView2.setImageResource(2131232059);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, ha.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f14819s) {
            canvas.drawRect(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth(), getHeight(), k6.f27972k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }
}
