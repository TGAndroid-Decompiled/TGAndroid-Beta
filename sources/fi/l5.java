package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.xq;
public final class l5 extends LinearLayout {
    public final TextView f12320a;
    public final bi.x5 f12321b;
    public ImageView f12322c;
    public ImageView d;
    public float f12323e;
    public boolean f12324f;
    public ValueAnimator h;
    public final ImageView f12325n;
    public final o5 f12326r;

    public l5(o5 o5Var, Context context) {
        super(context);
        this.f12326r = o5Var;
        setOrientation(0);
        int i7 = org.telegram.ui.ActionBar.l6.f27957i6;
        g5 g5Var = o5Var.f12538p1;
        setBackground(org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i7, g5Var), 2, -1));
        bi.x5 x5Var = new bi.x5(this, context);
        this.f12321b = x5Var;
        addView(x5Var, c8.ha.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f12322c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f12322c;
        int i10 = org.telegram.ui.ActionBar.l6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.s6.s(imageView2, i10, g5Var, mode);
        x5Var.addView(this.f12322c, c8.ha.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.s6.s(this.d, i10, g5Var, mode);
        this.d.setVisibility(8);
        x5Var.addView(this.d, c8.ha.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f12320a = textView;
        org.telegram.ui.ActionBar.s6.U(textView, i10, g5Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, c8.ha.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f12325n = imageView4;
        imageView4.setImageResource(2131232398);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.s6.s(imageView4, org.telegram.ui.ActionBar.l6.h7, g5Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, c8.ha.o(50, -1));
    }

    public final void a(int i7, boolean z9, boolean z10) {
        if (z10) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i7, false, false);
                return;
            }
            this.f12324f = z9;
            this.d.setImageResource(i7);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ch.u(2, this, z9));
            this.h.addListener(new bi.t5(this, 21));
            this.h.setInterpolator(xq.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f12322c.setImageResource(i7);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        o5 o5Var = this.f12326r;
        org.telegram.ui.ActionBar.g1 g1Var = o5Var.f12540q1;
        if (g1Var != null && g1Var.isShowing()) {
            o5Var.f12540q1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i7) {
        a(i7, true, false);
    }

    @Override
    public void setSelected(boolean z9) {
        int i7;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f12325n.setVisibility(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f12320a.setText(charSequence);
    }
}
