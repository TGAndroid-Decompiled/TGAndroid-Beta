package eg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
public final class a1 extends LinearLayout {
    public final TextView f5057a;
    public final ag.l f5058b;
    public ImageView f5059c;
    public ImageView d;
    public float f5060e;
    public boolean f5061f;
    public ValueAnimator h;
    public final ImageView f5062n;
    public final c1 f5063r;

    public a1(c1 c1Var, Context context) {
        super(context);
        this.f5063r = c1Var;
        setOrientation(0);
        int i10 = k6.f21752i6;
        f0 f0Var = c1Var.N1;
        setBackground(k6.f0(k6.v0(i10, f0Var), 2, -1));
        ag.l lVar = new ag.l(this, context);
        this.f5058b = lVar;
        addView(lVar, c6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f5059c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f5059c;
        int i11 = k6.E8;
        imageView2.setColorFilter(k6.v0(i11, f0Var));
        lVar.addView(this.f5059c, c6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(k6.v0(i11, f0Var));
        this.d.setVisibility(8);
        lVar.addView(this.d, c6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f5057a = textView;
        textView.setTextColor(k6.v0(i11, f0Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, c6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f5062n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.f21735h7, f0Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, c6.n(50, -1));
    }

    public final void a(int i10, boolean z4, boolean z10) {
        if (z10) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                a(i10, false, false);
                return;
            }
            this.f5061f = z4;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new z0(0, this, z4));
            this.h.addListener(new dg.l0(this, 1));
            this.h.setInterpolator(pr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f5059c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        c1 c1Var = this.f5063r;
        org.telegram.ui.ActionBar.p1 p1Var = c1Var.O1;
        if (p1Var != null && p1Var.isShowing()) {
            c1Var.O1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i10) {
        a(i10, true, false);
    }

    @Override
    public void setSelected(boolean z4) {
        int i10;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f5062n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f5057a.setText(charSequence);
    }
}
