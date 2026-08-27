package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;

public final class c6 extends LinearLayout {

    public final TextView f15747a;

    public final ag.y1 f15748b;

    public ImageView f15749c;
    public ImageView d;

    public float f15750e;

    public boolean f15751f;
    public ValueAnimator h;

    public final ImageView f15752n;

    public final f6 f15753r;

    public c6(f6 f6Var, Context context) {
        super(context);
        this.f15753r = f6Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.g6.f23144i6;
        t5 t5Var = f6Var.C1;
        setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i10, t5Var), 2, -1));
        ag.y1 y1Var = new ag.y1(this, context);
        this.f15748b = y1Var;
        addView(y1Var, h7.z5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f15749c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f15749c;
        int i11 = org.telegram.ui.ActionBar.g6.E8;
        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, t5Var));
        y1Var.addView(this.f15749c, h7.z5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, t5Var));
        this.d.setVisibility(8);
        y1Var.addView(this.d, h7.z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f15747a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, t5Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, h7.z5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f15752n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23126h7, t5Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, h7.z5.n(50, -1));
    }

    public final void a(int i10, boolean z10, boolean z11) {
        if (!z11) {
            this.f15749c.setImageResource(i10);
            return;
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
            a(i10, false, false);
            return;
        }
        this.f15751f = z10;
        this.d.setImageResource(i10);
        this.d.setVisibility(0);
        this.d.setAlpha(1.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ig.y(2, this, z10));
        this.h.addListener(new ag.r1(this, 26));
        this.h.setInterpolator(er.h);
        this.h.setDuration(420L);
        this.h.start();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        f6 f6Var = this.f15753r;
        org.telegram.ui.ActionBar.n1 n1Var = f6Var.D1;
        if (n1Var != null && n1Var.isShowing()) {
            f6Var.D1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i10) {
        a(i10, true, false);
    }

    @Override
    public void setSelected(boolean z10) {
        this.f15752n.setVisibility(z10 ? 0 : 8);
    }

    public void setText(CharSequence charSequence) {
        this.f15747a.setText(charSequence);
    }
}
