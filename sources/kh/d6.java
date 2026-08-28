package kh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;
public final class d6 extends LinearLayout {
    public final TextView f15106a;
    public final fh.v f15107b;
    public ImageView f15108c;
    public ImageView d;
    public float f15109e;
    public boolean f15110f;
    public ValueAnimator h;
    public final ImageView f15111n;
    public final g6 f15112r;

    public d6(g6 g6Var, Context context) {
        super(context);
        this.f15112r = g6Var;
        setOrientation(0);
        int i9 = org.telegram.ui.ActionBar.f6.f23092i6;
        u5 u5Var = g6Var.C1;
        setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i9, u5Var), 2, -1));
        fh.v vVar = new fh.v(this, context);
        this.f15107b = vVar;
        addView(vVar, g7.e6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f15108c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f15108c;
        int i10 = org.telegram.ui.ActionBar.f6.E8;
        imageView2.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, u5Var));
        vVar.addView(this.f15108c, g7.e6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, u5Var));
        this.d.setVisibility(8);
        vVar.addView(this.d, g7.e6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f15106a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, u5Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, g7.e6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f15111n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23074h7, u5Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, g7.e6.n(50, -1));
    }

    public final void a(int i9, boolean z10, boolean z11) {
        if (z11) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i9, false, false);
                return;
            }
            this.f15110f = z10;
            this.d.setImageResource(i9);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new hg.y(2, this, z10));
            this.h.addListener(new ag.e(this, 24));
            this.h.setInterpolator(gr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f15108c.setImageResource(i9);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        g6 g6Var = this.f15112r;
        org.telegram.ui.ActionBar.o1 o1Var = g6Var.D1;
        if (o1Var != null && o1Var.isShowing()) {
            g6Var.D1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i9) {
        a(i9, true, false);
    }

    @Override
    public void setSelected(boolean z10) {
        int i9;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f15111n.setVisibility(i9);
    }

    public void setText(CharSequence charSequence) {
        this.f15106a.setText(charSequence);
    }
}
