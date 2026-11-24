package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public abstract class iga extends FrameLayout {
    public cw6 E;
    public int F;
    public ct8 G;
    public e6a H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public boolean M;
    public final Paint N;
    public ylb O;
    public Drawable P;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public sc3 d;
    public m69 e;
    public m69 f;
    public sea h;
    public hga n;
    public tea r;
    public cfa s;
    public efa w;
    public qea x;
    public bfa y;

    public iga(Context context) {
        super(context);
        this.N = new Paint();
    }

    public void setDrawPageBackground(boolean z) {
        if (this.M != z) {
            this.M = z;
            invalidate();
        }
    }

    public void setWallpaper(Drawable drawable) {
        Drawable drawable2 = this.P;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.P = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
            invalidate();
        }
    }

    public final void c(Canvas canvas) {
        int min = Math.min(0, this.h.getTop());
        int max = Math.max(getHeight(), this.h.getBottom());
        int L = gm.L(2.0f);
        if (this.P != null) {
            canvas.save();
            int i = -L;
            canvas.clipRect(i, min, getWidth() + L, max);
            this.P.setBounds(i, min, getWidth() + L, max);
            this.P.draw(canvas);
            canvas.restore();
        } else if (this.M) {
            int v0 = cmb.v0(cmb.Z6, this.O);
            Paint paint = this.N;
            paint.setColor(v0);
            canvas.drawRect(-L, min, getWidth() + L, max, paint);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ct8 ct8Var;
        c(canvas);
        super.dispatchDraw(canvas);
        ct8 ct8Var2 = this.G;
        if (ct8Var2 != null && ct8Var2.getVisibility() == 0) {
            y49 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float L = gm.L(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    L += gm.L(64.0f);
                }
                int i = this.F;
                if (i == 8 || nha.t0(i)) {
                    L += gm.L(42.0f);
                }
                this.G.setPivotX(ct8Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - gm.L(16.0f));
                this.G.setTranslationY(L);
            }
            if (fastScroll.getProgress() > 0.85f) {
                nha.m1(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.n) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.P && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
