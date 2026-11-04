package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.xq;
public final class jb extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 f5353a;
    public final Drawable f5354b;
    public final Drawable f5355c;
    public final TextView d;
    public final org.telegram.ui.Components.h6 f5356e;
    public SpannableString f5357f;
    public boolean h;
    public int f5358n;
    public final org.telegram.ui.Components.u5 f5359r;

    public jb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        this.f5359r = new org.telegram.ui.Components.u5(this, 0L, 500L, xq.h);
        this.f5353a = e6Var;
        Drawable g7 = k2.p1.g(context, 2131232751);
        this.f5354b = g7;
        org.telegram.ui.ActionBar.r6.y(this, g7, org.telegram.ui.ActionBar.k6.f27954h5, e6Var, PorterDuff.Mode.SRC_IN);
        this.f5355c = k2.p1.g(context, 2131232750);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 15.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        addView(textView, mf.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f5356e = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
        if (bd.f21784a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        h6Var.setGravity(i3);
        addView(h6Var, mf.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float L;
        float f11;
        Paint paint;
        int i3;
        super.onDraw(canvas);
        float e10 = this.f5359r.e(false, this.f5358n);
        if (bd.f21784a0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        float L2 = org.telegram.messenger.g0.L(24.0f);
        float L3 = org.telegram.messenger.g0.L(24.0f);
        float L4 = org.telegram.messenger.g0.L(2.5f);
        if (bd.f21784a0) {
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
            Drawable drawable = this.f5354b;
            drawable.setBounds(i11, i12, i13, i14);
            int i15 = (int) (i10 * 255.0f);
            drawable.setAlpha(i15);
            drawable.draw(canvas);
            Drawable drawable2 = this.f5355c;
            drawable2.setBounds(i11, i12, i13, i14);
            drawable2.setAlpha(i15);
            drawable2.draw(canvas);
            ceil--;
        }
        if (this.h) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f5353a;
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            Paint paint2 = paint;
            if (!bd.f21784a0) {
                f11 = org.telegram.messenger.g0.L(22.0f);
            }
            float f13 = f11;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i3 = 0;
            }
            canvas.drawRect(f13, measuredHeight2, measuredWidth - i3, getMeasuredHeight(), paint2);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
