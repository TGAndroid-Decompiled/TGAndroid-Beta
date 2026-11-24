package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class vv7 extends LinearLayout {
    public final TextView a;
    public final su b;
    public ImageView c;
    public ImageView d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public final ImageView n;
    public final xv7 r;

    public vv7(xv7 xv7Var, Context context) {
        super(context);
        this.r = xv7Var;
        setOrientation(0);
        int i = cmb.h6;
        rk5 rk5Var = xv7Var.w1;
        setBackground(cmb.f0(cmb.v0(i, rk5Var), 2, -1));
        su suVar = new su(this, context);
        this.b = suVar;
        addView(suVar, qoe.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.c;
        int i2 = cmb.D8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        anb.s(imageView2, i2, rk5Var, mode);
        suVar.addView(this.c, qoe.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        anb.s(this.d, i2, rk5Var, mode);
        this.d.setVisibility(8);
        suVar.addView(this.d, qoe.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, i2, rk5Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, qoe.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(2131232404);
        imageView4.setScaleType(scaleType);
        anb.s(imageView4, cmb.g7, rk5Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, qoe.o(50, -1));
    }

    public final void a(int i, boolean z, boolean z2) {
        if (z2) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i, false, false);
                return;
            }
            this.f = z;
            this.d.setImageResource(i);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new d30((byte) 7, this, z));
            this.h.addListener(new v85(this, (byte) 25));
            this.h.setInterpolator(d53.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.c.setImageResource(i);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        xv7 xv7Var = this.r;
        m8 m8Var = xv7Var.x1;
        if (m8Var != null && m8Var.isShowing()) {
            xv7Var.x1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i) {
        a(i, true, false);
    }

    @Override
    public void setSelected(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.n.setVisibility(i);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
