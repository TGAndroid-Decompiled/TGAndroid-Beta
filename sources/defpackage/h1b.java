package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class h1b extends FrameLayout implements tjb {
    public uib E;
    public float F;
    public float G;
    public ValueAnimator H;
    public ValueAnimator I;
    public xf4 J;
    public float K;
    public boolean L;
    public wd1 M;
    public Paint a;
    public Paint b;
    public Paint c;
    public Paint d;
    public boolean e;
    public si9 f;
    public TextView h;
    public TextView n;
    public TextView r;
    public TextView s;
    public TextView w;
    public View x;
    public int y;

    @Override
    public final void invalidate() {
        TextView textView = this.s;
        TextView textView2 = this.r;
        TextView textView3 = this.n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f.invalidate();
        int i = this.y;
        int i2 = bkb.Lj;
        if (i != bkb.w0(null, i2, false)) {
            this.y = bkb.w0(null, i2, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(bkb.K(gl.L(10.0f), this.y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(gl.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(bkb.K(gl.L(10.0f), this.y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(gl.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(bkb.K(gl.L(10.0f), bm2.o(this.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(gl.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(bkb.K(gl.L(10.0f), bm2.o(this.y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(gl.L(6.0f));
        }
        zkb.X(this.E.getTextView(), bkb.F6, null);
        zkb.h(bkb.c7, null, this.x);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xf4 xf4Var = this.J;
        if (xf4Var != null) {
            xf4Var.a = true;
            AnimatorSet animatorSet = (AnimatorSet) xf4Var.d;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xf4 xf4Var = this.J;
        if (xf4Var != null) {
            xf4Var.a = false;
            ((AnimatorSet) xf4Var.d).cancel();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f != null && this.h != null && this.y != bkb.w0(null, bkb.Lj, false)) {
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
