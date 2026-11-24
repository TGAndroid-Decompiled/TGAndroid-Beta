package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class ut7 extends LinearLayout {
    public final TextView a;
    public final st b;
    public ImageView c;
    public ImageView d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public final ImageView n;
    public final wt7 r;

    public ut7(wt7 wt7Var, Context context) {
        super(context);
        this.r = wt7Var;
        setOrientation(0);
        int i = bkb.h6;
        si5 si5Var = wt7Var.w1;
        setBackground(bkb.f0(bkb.v0(i, si5Var), 2, -1));
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
        zkb.s(imageView2, i2, si5Var, mode);
        stVar.addView(this.c, nme.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        zkb.s(this.d, i2, si5Var, mode);
        this.d.setVisibility(8);
        stVar.addView(this.d, nme.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, i2, si5Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, nme.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(2131232403);
        imageView4.setScaleType(scaleType);
        zkb.s(imageView4, bkb.g7, si5Var, PorterDuff.Mode.MULTIPLY);
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
            ofFloat.addUpdateListener(new d20((byte) 7, this, z));
            this.h.addListener(new v85(this, (byte) 23));
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
        wt7 wt7Var = this.r;
        m8 m8Var = wt7Var.x1;
        if (m8Var != null && m8Var.isShowing()) {
            wt7Var.x1.d(true);
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
