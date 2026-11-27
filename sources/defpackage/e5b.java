package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class e5b extends FrameLayout implements snb {
    public qmb E;
    public float F;
    public float G;
    public ValueAnimator H;
    public ValueAnimator I;
    public vh4 J;
    public float K;
    public boolean L;
    public fe1 M;
    public Paint a;
    public Paint b;
    public Paint c;
    public Paint d;
    public boolean e;
    public nf9 f;
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
        int i2 = aob.Mj;
        if (i != aob.w0(null, i2, false)) {
            this.y = aob.w0(null, i2, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(aob.K(hl.L(10.0f), this.y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(hl.L(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(aob.K(hl.L(10.0f), this.y), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(hl.L(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(aob.K(hl.L(10.0f), vm2.o(this.y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(hl.L(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(aob.K(hl.L(10.0f), vm2.o(this.y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(hl.L(6.0f));
        }
        yob.X(this.E.getTextView(), aob.G6, null);
        yob.h(aob.d7, null, this.x);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vh4 vh4Var = this.J;
        if (vh4Var != null) {
            vh4Var.a = true;
            AnimatorSet animatorSet = (AnimatorSet) vh4Var.d;
            if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vh4 vh4Var = this.J;
        if (vh4Var != null) {
            vh4Var.a = false;
            ((AnimatorSet) vh4Var.d).cancel();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f != null && this.h != null && this.y != aob.w0(null, aob.Mj, false)) {
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
