package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class j3b extends FrameLayout implements vlb {
    public vkb E;
    public float F;
    public float G;
    public ValueAnimator H;
    public ValueAnimator I;
    public yh4 J;
    public float K;
    public boolean L;
    public ef1 M;
    public Paint a;
    public Paint b;
    public Paint c;
    public Paint d;
    public boolean e;
    public xd9 f;
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
        int i2 = cmb.Lj;
        if (i != cmb.w0(null, i2, false)) {
            this.y = cmb.w0(null, i2, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(cmb.K(gm.L(10.0f), this.y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(gm.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(cmb.K(gm.L(10.0f), this.y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(gm.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(cmb.K(gm.L(10.0f), on2.p(this.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(gm.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(cmb.K(gm.L(10.0f), on2.p(this.y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(gm.L(6.0f));
        }
        anb.X(this.E.getTextView(), cmb.F6, null);
        anb.h(cmb.c7, null, this.x);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yh4 yh4Var = this.J;
        if (yh4Var != null) {
            yh4Var.a = true;
            AnimatorSet animatorSet = (AnimatorSet) yh4Var.d;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh4 yh4Var = this.J;
        if (yh4Var != null) {
            yh4Var.a = false;
            ((AnimatorSet) yh4Var.d).cancel();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f != null && this.h != null && this.y != cmb.w0(null, cmb.Lj, false)) {
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
