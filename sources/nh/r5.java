package nh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;
public final class r5 extends LinearLayout {
    public final TextView f18515a;
    public final bg.d1 f18516b;
    public ImageView f18517c;
    public ImageView d;
    public float f18518e;
    public boolean f18519f;
    public ValueAnimator h;
    public final ImageView f18520n;
    public final t5 f18521r;

    public r5(t5 t5Var, Context context) {
        super(context);
        this.f18521r = t5Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.g6.f23152i6;
        h5 h5Var = t5Var.C1;
        setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i10, h5Var), 2, -1));
        bg.d1 d1Var = new bg.d1(this, context);
        this.f18516b = d1Var;
        addView(d1Var, i7.f6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f18517c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f18517c;
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, h5Var));
        d1Var.addView(this.f18517c, i7.f6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, h5Var));
        this.d.setVisibility(8);
        d1Var.addView(this.d, i7.f6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f18515a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, h5Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, i7.f6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f18520n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23135h7, h5Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, i7.f6.n(50, -1));
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
            this.f18519f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new bg.c1(3, this, z10));
            this.h.addListener(new q5(this, 0));
            this.h.setInterpolator(jr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f18517c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        t5 t5Var = this.f18521r;
        org.telegram.ui.ActionBar.o1 o1Var = t5Var.D1;
        if (o1Var != null && o1Var.isShowing()) {
            t5Var.D1.d(true);
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
        this.f18520n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f18515a.setText(charSequence);
    }
}
