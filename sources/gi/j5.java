package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.ui.Components.xq;
public final class j5 extends LinearLayout {
    public final TextView f13008a;
    public final ai.c0 f13009b;
    public ImageView f13010c;
    public ImageView d;
    public float f13011e;
    public boolean f13012f;
    public ValueAnimator h;
    public final ImageView f13013n;
    public final m5 f13014r;

    public j5(m5 m5Var, Context context) {
        super(context);
        this.f13014r = m5Var;
        setOrientation(0);
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        e5 e5Var = m5Var.f13224q1;
        setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i3, e5Var), 2, -1));
        ai.c0 c0Var = new ai.c0(this, context);
        this.f13009b = c0Var;
        addView(c0Var, mf.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f13010c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f13010c;
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, e5Var, mode);
        c0Var.addView(this.f13010c, mf.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(this.d, i10, e5Var, mode);
        this.d.setVisibility(8);
        c0Var.addView(this.d, mf.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f13008a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e5Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, mf.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f13013n = imageView4;
        imageView4.setImageResource(2131232398);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView4, org.telegram.ui.ActionBar.k6.h7, e5Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, mf.o(50, -1));
    }

    public final void a(int i3, boolean z10, boolean z11) {
        if (z11) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i3, false, false);
                return;
            }
            this.f13012f = z10;
            this.d.setImageResource(i3);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new dh.u(2, this, z10));
            this.h.addListener(new ai.e1(this, 23));
            this.h.setInterpolator(xq.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f13010c.setImageResource(i3);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        m5 m5Var = this.f13014r;
        org.telegram.ui.ActionBar.f1 f1Var = m5Var.f13226r1;
        if (f1Var != null && f1Var.isShowing()) {
            m5Var.f13226r1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i3) {
        a(i3, true, false);
    }

    @Override
    public void setSelected(boolean z10) {
        int i3;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f13013n.setVisibility(i3);
    }

    public void setText(CharSequence charSequence) {
        this.f13008a.setText(charSequence);
    }
}
