package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hs;
public final class n6 extends LinearLayout {
    public final TextView f5637a;
    public final m6 f5638b;
    public ImageView f5639c;
    public ImageView d;
    public float f5640e;
    public boolean f5641f;
    public ValueAnimator h;
    public final ImageView f5642n;
    public final q6 f5643r;

    public n6(q6 q6Var, Context context) {
        super(context);
        this.f5643r = q6Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.i6.f20888i6;
        d6 d6Var = q6Var.G1;
        setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(i10, d6Var), 2, -1));
        m6 m6Var = new m6(this, context);
        this.f5638b = m6Var;
        addView(m6Var, w7.x5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f5639c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f5639c;
        int i11 = org.telegram.ui.ActionBar.i6.E8;
        imageView2.setColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, d6Var));
        m6Var.addView(this.f5639c, w7.x5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, d6Var));
        this.d.setVisibility(8);
        m6Var.addView(this.d, w7.x5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f5637a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, d6Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, w7.x5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f5642n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20870h7, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, w7.x5.n(50, -1));
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
            this.f5641f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new ai.cb(1, this, z10));
            this.h.addListener(new ai.b(this, 15));
            this.h.setInterpolator(hs.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f5639c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        q6 q6Var = this.f5643r;
        org.telegram.ui.ActionBar.n1 n1Var = q6Var.H1;
        if (n1Var != null && n1Var.isShowing()) {
            q6Var.H1.d(true);
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
        this.f5642n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f5637a.setText(charSequence);
    }
}
