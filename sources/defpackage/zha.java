package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public abstract class zha extends FrameLayout {
    public hw6 E;
    public int F;
    public ir8 G;
    public ida H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public boolean M;
    public final Paint N;
    public vnb O;
    public Drawable P;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public zb3 d;
    public x79 e;
    public x79 f;
    public jga h;
    public yha n;
    public kga r;
    public tga s;
    public vga w;
    public hga x;
    public sga y;

    public zha(Context context) {
        super(context);
        this.N = new Paint();
    }

    public static void a(zha zhaVar, boolean z) {
        zhaVar.setDrawPageBackground(z);
    }

    public static void b(zha zhaVar, Drawable drawable) {
        zhaVar.setWallpaper(drawable);
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
        int L = hl.L(2.0f);
        if (this.P != null) {
            canvas.save();
            int i = -L;
            canvas.clipRect(i, min, getWidth() + L, max);
            this.P.setBounds(i, min, getWidth() + L, max);
            this.P.draw(canvas);
            canvas.restore();
        } else if (this.M) {
            int v0 = aob.v0(aob.a7, this.O);
            Paint paint = this.N;
            paint.setColor(v0);
            canvas.drawRect(-L, min, getWidth() + L, max, paint);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ir8 ir8Var;
        c(canvas);
        super.dispatchDraw(canvas);
        ir8 ir8Var2 = this.G;
        if (ir8Var2 != null && ir8Var2.getVisibility() == 0) {
            k69 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float L = hl.L(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    L += hl.L(64.0f);
                }
                int i = this.F;
                if (i == 8 || eja.t0(i)) {
                    L += hl.L(42.0f);
                }
                this.G.setPivotX(ir8Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - hl.L(16.0f));
                this.G.setTranslationY(L);
            }
            if (fastScroll.getProgress() > 0.85f) {
                eja.m1(this, null, false);
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
