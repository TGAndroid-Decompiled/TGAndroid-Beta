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
import org.telegram.ui.Components.is;
public final class n6 extends LinearLayout {
    public final TextView f5636a;
    public final m6 f5637b;
    public ImageView f5638c;
    public ImageView d;
    public float f5639e;
    public boolean f5640f;
    public ValueAnimator h;
    public final ImageView f5641n;
    public final q6 f5642r;

    public n6(q6 q6Var, Context context) {
        super(context);
        this.f5642r = q6Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.h6.f20913i6;
        d6 d6Var = q6Var.G1;
        setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), 2, -1));
        m6 m6Var = new m6(this, context);
        this.f5637b = m6Var;
        addView(m6Var, w7.x5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f5638c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f5638c;
        int i11 = org.telegram.ui.ActionBar.h6.E8;
        imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        m6Var.addView(this.f5638c, w7.x5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        this.d.setVisibility(8);
        m6Var.addView(this.d, w7.x5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f5636a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, w7.x5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f5641n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20895h7, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, w7.x5.n(50, -1));
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
            this.f5640f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ai.cb(1, this, z10));
            this.h.addListener(new ai.b(this, 15));
            this.h.setInterpolator(is.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f5638c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        q6 q6Var = this.f5642r;
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
        this.f5641n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f5636a.setText(charSequence);
    }
}
