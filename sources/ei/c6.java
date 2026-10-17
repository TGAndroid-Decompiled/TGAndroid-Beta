package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs;
public final class c6 extends LinearLayout {
    public final TextView f8826a;
    public final ah.v f8827b;
    public ImageView f8828c;
    public ImageView d;
    public float e;
    public boolean f8829f;
    public ValueAnimator h;
    public final ImageView f8830n;
    public final f6 f8831r;

    public c6(f6 f6Var, Context context) {
        super(context);
        this.f8831r = f6Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.h6.f21075i6;
        t5 t5Var = f6Var.G1;
        setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i10, t5Var), 2, -1));
        ah.v vVar = new ah.v(this, context);
        this.f8827b = vVar;
        addView(vVar, w7.z5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f8828c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f8828c;
        int i11 = org.telegram.ui.ActionBar.h6.E8;
        imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, t5Var));
        vVar.addView(this.f8828c, w7.z5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, t5Var));
        this.d.setVisibility(8);
        vVar.addView(this.d, w7.z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f8826a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, t5Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, w7.z5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f8830n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21059h7, t5Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, w7.z5.n(50, -1));
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
            this.f8829f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ah.k0(2, this, z10));
            this.h.addListener(new ah.b(this, 20));
            this.h.setInterpolator(bs.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f8828c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        f6 f6Var = this.f8831r;
        org.telegram.ui.ActionBar.m1 m1Var = f6Var.H1;
        if (m1Var != null && m1Var.isShowing()) {
            f6Var.H1.d(true);
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
        this.f8830n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f8826a.setText(charSequence);
    }
}
