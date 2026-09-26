package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rr;
public final class n6 extends LinearLayout {
    public final TextView f5207a;
    public final m6 f5208b;
    public ImageView f5209c;
    public ImageView d;
    public float e;
    public boolean f5210f;
    public ValueAnimator h;
    public final ImageView f5211n;
    public final q6 f5212r;

    public n6(q6 q6Var, Context context) {
        super(context);
        this.f5212r = q6Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.h6.f19148i6;
        d6 d6Var = q6Var.G1;
        setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), 2, -1));
        m6 m6Var = new m6(this, context);
        this.f5208b = m6Var;
        addView(m6Var, w7.y5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f5209c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f5209c;
        int i11 = org.telegram.ui.ActionBar.h6.E8;
        imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        m6Var.addView(this.f5209c, w7.y5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        this.d.setVisibility(8);
        m6Var.addView(this.d, w7.y5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f5207a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, w7.y5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f5211n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19131h7, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, w7.y5.n(50, -1));
    }

    public final void a(int i10, boolean z10, boolean z11) {
        if (z11) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i10, false, false);
                return;
            }
            this.f5210f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ai.bb(1, this, z10));
            this.h.addListener(new ai.b(this, 15));
            this.h.setInterpolator(rr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f5209c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        q6 q6Var = this.f5212r;
        org.telegram.ui.ActionBar.m1 m1Var = q6Var.H1;
        if (m1Var != null && m1Var.isShowing()) {
            q6Var.H1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i10) {
        a(i10, true, false);
    }

    @Override
    public void setSelected(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f5211n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f5207a.setText(charSequence);
    }
}
