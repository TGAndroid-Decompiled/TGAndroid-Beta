package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.nr;
public final class h5 extends LinearLayout {
    public final TextView f14750a;
    public final ai.l0 f14751b;
    public ImageView f14752c;
    public ImageView d;
    public float f14753e;
    public boolean f14754f;
    public ValueAnimator h;
    public final ImageView f14755n;
    public final k5 f14756r;

    public h5(k5 k5Var, Context context) {
        super(context);
        this.f14756r = k5Var;
        setOrientation(0);
        int i7 = org.telegram.ui.ActionBar.m6.f29473i6;
        c5 c5Var = k5Var.f14899q1;
        setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i7, c5Var), 2, -1));
        ai.l0 l0Var = new ai.l0(this, context);
        this.f14751b = l0Var;
        addView(l0Var, c8.ma.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f14752c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f14752c;
        int i10 = org.telegram.ui.ActionBar.m6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.t6.s(imageView2, i10, c5Var, mode);
        l0Var.addView(this.f14752c, c8.ma.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(this.d, i10, c5Var, mode);
        this.d.setVisibility(8);
        l0Var.addView(this.d, c8.ma.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f14750a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, i10, c5Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, c8.ma.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f14755n = imageView4;
        imageView4.setImageResource(2131232400);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(imageView4, org.telegram.ui.ActionBar.m6.h7, c5Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, c8.ma.o(50, -1));
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
            this.f14754f = z10;
            this.d.setImageResource(i7);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ch.v(2, this, z10));
            this.h.addListener(new ai.k0(this, 23));
            this.h.setInterpolator(nr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f14752c.setImageResource(i7);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        k5 k5Var = this.f14756r;
        org.telegram.ui.ActionBar.g1 g1Var = k5Var.f14901r1;
        if (g1Var != null && g1Var.isShowing()) {
            k5Var.f14901r1.d(true);
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
        this.f14755n.setVisibility(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f14750a.setText(charSequence);
    }
}
