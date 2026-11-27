package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class uy5 extends LinearLayout {
    public final TextView a;
    public final tt b;
    public ImageView c;
    public ImageView d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public final ImageView n;
    public final wy5 r;

    public uy5(wy5 wy5Var, Context context) {
        super(context);
        this.r = wy5Var;
        setOrientation(0);
        int i = aob.i6;
        yx5 yx5Var = wy5Var.A1;
        setBackground(aob.f0(aob.v0(i, yx5Var), 2, -1));
        tt ttVar = new tt(this, context);
        this.b = ttVar;
        addView(ttVar, tre.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.c;
        int i2 = aob.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        yob.s(imageView2, i2, yx5Var, mode);
        ttVar.addView(this.c, tre.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        yob.s(this.d, i2, yx5Var, mode);
        this.d.setVisibility(8);
        ttVar.addView(this.d, tre.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, i2, yx5Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, tre.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(2131232403);
        imageView4.setScaleType(scaleType);
        yob.s(imageView4, aob.h7, yx5Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, tre.o(50, -1));
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
            ofFloat.addUpdateListener(new e20((byte) 4, this, z));
            this.h.addListener(new ad5(this, (byte) 8));
            this.h.setInterpolator(k43.h);
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
        wy5 wy5Var = this.r;
        n8 n8Var = wy5Var.B1;
        if (n8Var != null && n8Var.isShowing()) {
            wy5Var.B1.d(true);
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
