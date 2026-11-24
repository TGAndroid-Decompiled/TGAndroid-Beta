package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class hra extends View implements tjb {
    public final de0 a;
    public final fra b;
    public final lm c;
    public boolean d;
    public gra e;
    public boolean f;
    public boolean h;

    public hra(Context context) {
        super(context);
        ?? obj = new Object();
        obj.c = -16777216;
        obj.d = -1;
        this.b = obj;
        lm lmVar = new lm(new era(this, (byte) 0), 380L, s33.h);
        this.c = lmVar;
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setCallback(this);
        this.d = false;
        lmVar.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z;
        if (this.h && this.f) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        this.c.d(z);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.c.c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.c.d(this.d);
        int D = ug8.D(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(D, (getMeasuredHeight() - gl.L(24.0f)) / 2);
        canvas.scale(d, d, 0.0f, gl.L(12.0f));
        int L = gl.L(24.0f);
        int L2 = gl.L(24.0f);
        de0 de0Var = this.a;
        de0Var.setBounds(0, 0, L, L2);
        fra fraVar = this.b;
        int i = fraVar.c;
        if (de0Var.f != i) {
            de0Var.f = i;
            if (de0Var.c != null) {
                de0Var.d.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                de0Var.invalidateSelf();
            }
        }
        int i2 = fraVar.d;
        if (de0Var.e != i2) {
            de0Var.e = i2;
            Drawable drawable = de0Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
                de0Var.invalidateSelf();
            }
        }
        int i3 = fraVar.c | (-16777216);
        if (de0Var.h != i3) {
            de0Var.h = i3;
            de0Var.b.v(i3, false);
            de0Var.invalidateSelf();
        }
        de0Var.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        boolean z;
        String str;
        int i;
        int b;
        if (tl_starsRating != null) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i2 = tl_starsRating.level;
        de0 de0Var = this.a;
        if (de0Var.r != i2 || de0Var.c == null || de0Var.d == null) {
            gn gnVar = de0Var.b;
            if (i2 >= 0) {
                str = Integer.toString(i2);
            } else {
                str = "!";
            }
            gnVar.t(str, true, true);
            de0Var.r = i2;
            if (i2 < 0) {
                b = 18;
            } else {
                if (i2 <= 10) {
                    i = i2 - 1;
                } else {
                    i = (i2 / 10) + 8;
                }
                b = moe.b(i, 0, 17);
            }
            Context context = de0Var.a;
            if (de0Var.n != b || de0Var.c == null || de0Var.d == null) {
                int i3 = b << 1;
                Drawable mutate = context.getResources().getDrawable(de0.s[i3]).mutate();
                de0Var.c = mutate;
                int i4 = de0Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i4, mode);
                Drawable mutate2 = context.getResources().getDrawable(de0.s[i3 + 1]).mutate();
                de0Var.d = mutate2;
                mutate2.setColorFilter(de0Var.f, mode);
                de0Var.n = b;
                Drawable drawable = de0Var.c;
                if (drawable != null) {
                    drawable.setBounds(de0Var.getBounds());
                }
                Drawable drawable2 = de0Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(de0Var.getBounds());
                }
            }
            de0Var.invalidateSelf();
        }
        setContentDescription(k96.M0(2131754796, null) + " " + tl_starsRating.level);
        invalidate();
    }

    public void setDelegate(gra graVar) {
        this.e = graVar;
    }

    public void setParentExpanded(float f) {
        fra fraVar = this.b;
        fraVar.e = f;
        fraVar.a(fraVar.a);
        invalidate();
    }

    public void setResourcesProvider(wjb wjbVar) {
        this.b.b = wjbVar;
    }

    public void setVisibility(boolean z) {
        this.h = z;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            fra fraVar = this.b;
            fraVar.a(fraVar.a);
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
