package jg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import w7.b6;
public final class p0 extends LinearLayout {
    public final TextView f10131a;
    public final fg.i f10132b;
    public ImageView f10133c;
    public ImageView d;
    public float e;
    public boolean f10134f;
    public ValueAnimator h;
    public final ImageView f10135n;
    public final r0 f10136r;

    public p0(r0 r0Var, Context context) {
        super(context);
        this.f10136r = r0Var;
        setOrientation(0);
        int i10 = t6.f21021i6;
        b0 b0Var = r0Var.f10204z1;
        setBackground(t6.h0(t6.w0(i10, b0Var), 2, -1));
        fg.i iVar = new fg.i(this, context);
        this.f10132b = iVar;
        addView(iVar, b6.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.f10133c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f10133c;
        int i11 = t6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        a7.t(imageView2, i11, b0Var, mode);
        iVar.addView(this.f10133c, b6.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        a7.t(this.d, i11, b0Var, mode);
        this.d.setVisibility(8);
        iVar.addView(this.d, b6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f10131a = textView;
        a7.V(textView, i11, b0Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, b6.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.f10135n = imageView4;
        imageView4.setImageResource(2131232397);
        imageView4.setScaleType(scaleType);
        a7.t(imageView4, t6.f21004h7, b0Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, b6.o(50, -1));
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
            this.f10134f = z10;
            this.d.setImageResource(i10);
            this.d.setVisibility(0);
            this.d.setAlpha(1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new o0(0, this, z10));
            this.h.addListener(new bg.e(this, 5));
            this.h.setInterpolator(gr.h);
            this.h.setDuration(420L);
            this.h.start();
            return;
        }
        this.f10133c.setImageResource(i10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean performClick() {
        r0 r0Var = this.f10136r;
        org.telegram.ui.ActionBar.k1 k1Var = r0Var.A1;
        if (k1Var != null && k1Var.isShowing()) {
            r0Var.A1.d(true);
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
        this.f10135n.setVisibility(i10);
    }

    public void setText(CharSequence charSequence) {
        this.f10131a.setText(charSequence);
    }
}
