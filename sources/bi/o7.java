package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wr;
public final class o7 extends LinearLayout {
    public final TextView f3321a;
    public final n7 f3322b;
    public ImageView f3323c;
    public ImageView d;
    public float e;
    public boolean f3324f;
    public ValueAnimator h;
    public final ImageView f3325n;
    public final r7 f3326r;

    public o7(r7 r7Var, Context context) {
        super(context);
        this.f3326r = r7Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.j6.f18017i6;
        d7 d7Var = r7Var.G1;
        setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, d7Var), 2, -1));
        n7 n7Var = new n7(this, context);
        this.f3322b = n7Var;
        addView(n7Var, w7.a6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f3323c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f3323c;
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, d7Var));
        n7Var.addView(this.f3323c, w7.a6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, d7Var));
        this.d.setVisibility(8);
        n7Var.addView(this.d, w7.a6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f3321a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, d7Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, w7.a6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f3325n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18000h7, d7Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, w7.a6.n(50, -1));
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
            this.f3324f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new m7(0, this, z10));
            this.h.addListener(new h(this, 4));
            this.h.setInterpolator(wr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f3323c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        r7 r7Var = this.f3326r;
        org.telegram.ui.ActionBar.p1 p1Var = r7Var.H1;
        if (p1Var != null && p1Var.isShowing()) {
            r7Var.H1.d(true);
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
        this.f3325n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f3321a.setText(charSequence);
    }
}
