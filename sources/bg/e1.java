package bg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
public final class e1 extends LinearLayout {
    public final TextView f2169a;
    public final d1 f2170b;
    public ImageView f2171c;
    public ImageView d;
    public float f2172e;
    public boolean f2173f;
    public ValueAnimator h;
    public final ImageView f2174n;
    public final g1 f2175r;

    public e1(g1 g1Var, Context context) {
        super(context);
        this.f2175r = g1Var;
        setOrientation(0);
        int i10 = g6.f23152i6;
        i0 i0Var = g1Var.M1;
        setBackground(g6.f0(g6.v0(i10, i0Var), 2, -1));
        d1 d1Var = new d1(this, context);
        this.f2170b = d1Var;
        addView(d1Var, f6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f2171c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f2171c;
        int i11 = g6.E8;
        imageView2.setColorFilter(g6.v0(i11, i0Var));
        d1Var.addView(this.f2171c, f6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(g6.v0(i11, i0Var));
        this.d.setVisibility(8);
        d1Var.addView(this.d, f6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f2169a = textView;
        textView.setTextColor(g6.v0(i11, i0Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, f6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f2174n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23135h7, i0Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, f6.n(50, -1));
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
            this.f2173f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new c1(0, this, z10));
            this.h.addListener(new ag.m0(this, 1));
            this.h.setInterpolator(jr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f2171c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        g1 g1Var = this.f2175r;
        org.telegram.ui.ActionBar.o1 o1Var = g1Var.N1;
        if (o1Var != null && o1Var.isShowing()) {
            g1Var.N1.d(true);
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
        this.f2174n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f2169a.setText(charSequence);
    }
}
