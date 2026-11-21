package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.nr;
public final class cb extends FrameLayout {
    public final org.telegram.ui.ActionBar.h6 f8651a;
    public final Drawable f8652b;
    public final Drawable f8653c;
    public final TextView d;
    public final org.telegram.ui.Components.o6 f8654e;
    public SpannableString f8655f;
    public boolean h;
    public int f8656n;
    public final org.telegram.ui.Components.d6 f8657r;

    public cb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        this.f8657r = new org.telegram.ui.Components.d6(this, 0L, 500L, nr.h);
        this.f8651a = h6Var;
        Drawable g10 = i5.c.g(context, 2131232755);
        this.f8652b = g10;
        org.telegram.ui.ActionBar.t6.x(this, g10, org.telegram.ui.ActionBar.m6.f29451h5, h6Var, PorterDuff.Mode.SRC_IN);
        this.f8653c = i5.c.g(context, 2131232754);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        n10.p(textView, 1, 15.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        addView(textView, c8.ma.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f8654e = o6Var;
        o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.f29789z6, h6Var);
        if (gd.f24241a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        o6Var.setGravity(i7);
        addView(o6Var, c8.ma.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float L;
        float f11;
        Paint paint;
        int i7;
        super.onDraw(canvas);
        float e10 = this.f8657r.e(false, this.f8656n);
        if (gd.f24241a0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        float L2 = org.telegram.messenger.g0.L(24.0f);
        float L3 = org.telegram.messenger.g0.L(24.0f);
        float L4 = org.telegram.messenger.g0.L(2.5f);
        if (gd.f24241a0) {
            L = (getWidth() - org.telegram.messenger.g0.L(19.0f)) - L2;
        } else {
            L = org.telegram.messenger.g0.L(19.0f);
        }
        int ceil = ((int) Math.ceil(e10)) - 1;
        while (true) {
            f11 = 0.0f;
            if (ceil < 0) {
                break;
            }
            float i10 = Utilities.i(e10 - ceil, 1.0f, 0.0f);
            float f12 = (((ceil - 1) - (1.0f - i10)) * L4 * f10) + L;
            float measuredHeight = (getMeasuredHeight() - L3) / 2.0f;
            int i11 = (int) f12;
            int i12 = (int) measuredHeight;
            int i13 = (int) (f12 + L2);
            int i14 = (int) (measuredHeight + L3);
            Drawable drawable = this.f8652b;
            drawable.setBounds(i11, i12, i13, i14);
            int i15 = (int) (i10 * 255.0f);
            drawable.setAlpha(i15);
            drawable.draw(canvas);
            Drawable drawable2 = this.f8653c;
            drawable2.setBounds(i11, i12, i13, i14);
            drawable2.setAlpha(i15);
            drawable2.draw(canvas);
            ceil--;
        }
        if (this.h) {
            org.telegram.ui.ActionBar.h6 h6Var = this.f8651a;
            if (h6Var != null) {
                paint = h6Var.g("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.m6.f29501k0;
            }
            Paint paint2 = paint;
            if (!gd.f24241a0) {
                f11 = org.telegram.messenger.g0.L(22.0f);
            }
            float f13 = f11;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24241a0) {
                i7 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f13, measuredHeight2, measuredWidth - i7, getMeasuredHeight(), paint2);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
