package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.er;
public final class j5 extends LinearLayout {
    public final TextView f14462a;
    public final ai.j0 f14463b;
    public ImageView f14464c;
    public ImageView d;
    public float f14465e;
    public boolean f14466f;
    public ValueAnimator h;
    public final ImageView f14467n;
    public final m5 f14468r;

    public j5(m5 m5Var, Context context) {
        super(context);
        this.f14468r = m5Var;
        setOrientation(0);
        int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
        e5 e5Var = m5Var.f14685q1;
        setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i7, e5Var), 2, -1));
        ai.j0 j0Var = new ai.j0(this, context);
        this.f14463b = j0Var;
        addView(j0Var, c8.ja.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f14464c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f14464c;
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.q6.s(imageView2, i10, e5Var, mode);
        j0Var.addView(this.f14464c, c8.ja.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.q6.s(this.d, i10, e5Var, mode);
        this.d.setVisibility(8);
        j0Var.addView(this.d, c8.ja.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f14462a = textView;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e5Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, c8.ja.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f14467n = imageView4;
        imageView4.setImageResource(2131232399);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.q6.s(imageView4, org.telegram.ui.ActionBar.j6.h7, e5Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, c8.ja.o(50, -1));
    }

    public final void a(int i7, boolean z10, boolean z11) {
        if (z11) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i7, false, false);
                return;
            }
            this.f14466f = z10;
            this.d.setImageResource(i7);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ch.u(2, this, z10));
            this.h.addListener(new ai.i0(this, 23));
            this.h.setInterpolator(er.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f14464c.setImageResource(i7);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        m5 m5Var = this.f14468r;
        org.telegram.ui.ActionBar.g1 g1Var = m5Var.f14687r1;
        if (g1Var != null && g1Var.isShowing()) {
            m5Var.f14687r1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i7) {
        a(i7, true, false);
    }

    @Override
    public void setSelected(boolean z10) {
        int i7;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f14467n.setVisibility(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f14462a.setText(charSequence);
    }
}
