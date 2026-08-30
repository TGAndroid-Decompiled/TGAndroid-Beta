package dg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;
public final class c1 extends LinearLayout {
    public final TextView f4420a;
    public final ah.d f4421b;
    public ImageView f4422c;
    public ImageView d;
    public float e;
    public boolean f4423f;
    public ValueAnimator h;
    public final ImageView f4424n;
    public final e1 f4425r;

    public c1(e1 e1Var, Context context) {
        super(context);
        this.f4425r = e1Var;
        setOrientation(0);
        int i10 = j6.f19996i6;
        h0 h0Var = e1Var.N1;
        setBackground(j6.f0(j6.v0(i10, h0Var), 2, -1));
        ah.d dVar = new ah.d(this, context);
        this.f4421b = dVar;
        addView(dVar, b6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f4422c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f4422c;
        int i11 = j6.E8;
        imageView2.setColorFilter(j6.v0(i11, h0Var));
        dVar.addView(this.f4422c, b6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(j6.v0(i11, h0Var));
        this.d.setVisibility(8);
        dVar.addView(this.d, b6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f4420a = textView;
        textView.setTextColor(j6.v0(i11, h0Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, b6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f4424n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f19979h7, h0Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, b6.n(50, -1));
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
            this.f4423f = z4;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new b1(0, this, z4));
            this.h.addListener(new cg.l0(this, 1));
            this.h.setInterpolator(nr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f4422c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        e1 e1Var = this.f4425r;
        org.telegram.ui.ActionBar.p1 p1Var = e1Var.O1;
        if (p1Var != null && p1Var.isShowing()) {
            e1Var.O1.d(true);
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
        this.f4424n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f4420a.setText(charSequence);
    }
}
