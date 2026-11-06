package bi;

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
import org.telegram.ui.Components.xq;
public final class qc extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f4590a;
    public final Drawable f4591b;
    public final Drawable f4592c;
    public final TextView d;
    public final org.telegram.ui.Components.j6 f4593e;
    public SpannableString f4594f;
    public boolean h;
    public int f4595n;
    public final org.telegram.ui.Components.w5 f4596r;

    public qc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7;
        this.f4596r = new org.telegram.ui.Components.w5(this, 0L, 500L, xq.h);
        this.f4590a = f6Var;
        Drawable h = jg.g.h(context, 2131232753);
        this.f4591b = h;
        org.telegram.ui.ActionBar.r6.y(this, h, org.telegram.ui.ActionBar.k6.f27921h5, f6Var, PorterDuff.Mode.SRC_IN);
        this.f4592c = jg.g.h(context, 2131232752);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 15.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        addView(textView, c8.ha.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f4593e = j6Var;
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(j6Var, org.telegram.ui.ActionBar.k6.f28258z6, f6Var);
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        j6Var.setGravity(i7);
        addView(j6Var, c8.ha.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float L;
        float f11;
        Paint paint;
        int i7;
        super.onDraw(canvas);
        float e10 = this.f4596r.e(false, this.f4595n);
        if (org.telegram.messenger.hd.f22871a0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        float L2 = org.telegram.messenger.g0.L(24.0f);
        float L3 = org.telegram.messenger.g0.L(24.0f);
        float L4 = org.telegram.messenger.g0.L(2.5f);
        if (org.telegram.messenger.hd.f22871a0) {
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
            Drawable drawable = this.f4591b;
            drawable.setBounds(i11, i12, i13, i14);
            int i15 = (int) (i10 * 255.0f);
            drawable.setAlpha(i15);
            drawable.draw(canvas);
            Drawable drawable2 = this.f4592c;
            drawable2.setBounds(i11, i12, i13, i14);
            drawable2.setAlpha(i15);
            drawable2.draw(canvas);
            ceil--;
        }
        if (this.h) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f4590a;
            if (f6Var != null) {
                paint = f6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f27971k0;
            }
            Paint paint2 = paint;
            if (!org.telegram.messenger.hd.f22871a0) {
                f11 = org.telegram.messenger.g0.L(22.0f);
            }
            float f13 = f11;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.hd.f22871a0) {
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
