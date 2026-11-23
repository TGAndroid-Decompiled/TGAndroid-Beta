package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.kr;
public final class s5 extends LinearLayout {
    public final TextView f15379a;
    public final ai.h0 f15380b;
    public ImageView f15381c;
    public ImageView d;
    public float f15382e;
    public boolean f15383f;
    public ValueAnimator h;
    public final ImageView f15384n;
    public final v5 f15385r;

    public s5(v5 v5Var, Context context) {
        super(context);
        this.f15385r = v5Var;
        setOrientation(0);
        int i7 = org.telegram.ui.ActionBar.n6.f29543i6;
        n5 n5Var = v5Var.f15585q1;
        setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i7, n5Var), 2, -1));
        ai.h0 h0Var = new ai.h0(this, context);
        this.f15380b = h0Var;
        addView(h0Var, c8.na.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f15381c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f15381c;
        int i10 = org.telegram.ui.ActionBar.n6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.u6.s(imageView2, i10, n5Var, mode);
        h0Var.addView(this.f15381c, c8.na.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(this.d, i10, n5Var, mode);
        this.d.setVisibility(8);
        h0Var.addView(this.d, c8.na.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f15379a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, i10, n5Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, c8.na.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f15384n = imageView4;
        imageView4.setImageResource(2131232403);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(imageView4, org.telegram.ui.ActionBar.n6.h7, n5Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, c8.na.o(50, -1));
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
            this.f15383f = z10;
            this.d.setImageResource(i7);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ch.v(2, this, z10));
            this.h.addListener(new ai.g0(this, 23));
            this.h.setInterpolator(kr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f15381c.setImageResource(i7);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        v5 v5Var = this.f15385r;
        org.telegram.ui.ActionBar.g1 g1Var = v5Var.f15587r1;
        if (g1Var != null && g1Var.isShowing()) {
            v5Var.f15587r1.d(true);
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
        this.f15384n.setVisibility(i7);
    }

    public void setText(CharSequence charSequence) {
        this.f15379a.setText(charSequence);
    }
}
