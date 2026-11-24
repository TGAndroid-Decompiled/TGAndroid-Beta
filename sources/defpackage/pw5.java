package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class pw5 extends LinearLayout {
    public final TextView a;
    public final st b;
    public ImageView c;
    public ImageView d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public final ImageView n;
    public final rw5 r;

    public pw5(rw5 rw5Var, Context context) {
        super(context);
        this.r = rw5Var;
        setOrientation(0);
        int i = bkb.h6;
        tv5 tv5Var = rw5Var.G1;
        setBackground(bkb.f0(bkb.v0(i, tv5Var), 2, -1));
        st stVar = new st(this, context);
        this.b = stVar;
        addView(stVar, nme.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.c;
        int i2 = bkb.D8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        zkb.s(imageView2, i2, tv5Var, mode);
        stVar.addView(this.c, nme.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        zkb.s(this.d, i2, tv5Var, mode);
        this.d.setVisibility(8);
        stVar.addView(this.d, nme.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, i2, tv5Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, nme.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(2131232403);
        imageView4.setScaleType(scaleType);
        zkb.s(imageView4, bkb.g7, tv5Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, nme.o(50, -1));
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
            ofFloat.addUpdateListener(new d20((byte) 4, this, z));
            this.h.addListener(new v85(this, (byte) 9));
            this.h.setInterpolator(s33.h);
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
        rw5 rw5Var = this.r;
        m8 m8Var = rw5Var.H1;
        if (m8Var != null && m8Var.isShowing()) {
            rw5Var.H1.d(true);
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
