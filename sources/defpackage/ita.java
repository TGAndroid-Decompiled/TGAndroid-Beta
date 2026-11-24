package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class ita extends View implements vlb {
    public final df0 a;
    public final gta b;
    public final ln c;
    public boolean d;
    public hta e;
    public boolean f;
    public boolean h;

    public ita(Context context) {
        super(context);
        ?? obj = new Object();
        obj.c = -16777216;
        obj.d = -1;
        this.b = obj;
        ln lnVar = new ln(new fta(this, (byte) 0), 380L, d53.h);
        this.c = lnVar;
        df0 df0Var = new df0(context);
        this.a = df0Var;
        df0Var.setCallback(this);
        this.d = false;
        lnVar.e(false, 0.0f);
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
        int D = wi8.D(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(D, (getMeasuredHeight() - gm.L(24.0f)) / 2);
        canvas.scale(d, d, 0.0f, gm.L(12.0f));
        int L = gm.L(24.0f);
        int L2 = gm.L(24.0f);
        df0 df0Var = this.a;
        df0Var.setBounds(0, 0, L, L2);
        gta gtaVar = this.b;
        int i = gtaVar.c;
        if (df0Var.f != i) {
            df0Var.f = i;
            if (df0Var.c != null) {
                df0Var.d.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                df0Var.invalidateSelf();
            }
        }
        int i2 = gtaVar.d;
        if (df0Var.e != i2) {
            df0Var.e = i2;
            Drawable drawable = df0Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
                df0Var.invalidateSelf();
            }
        }
        int i3 = gtaVar.c | (-16777216);
        if (df0Var.h != i3) {
            df0Var.h = i3;
            df0Var.b.v(i3, false);
            df0Var.invalidateSelf();
        }
        df0Var.draw(canvas);
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
        df0 df0Var = this.a;
        if (df0Var.r != i2 || df0Var.c == null || df0Var.d == null) {
            ho hoVar = df0Var.b;
            if (i2 >= 0) {
                str = Integer.toString(i2);
            } else {
                str = "!";
            }
            hoVar.t(str, true, true);
            df0Var.r = i2;
            if (i2 < 0) {
                b = 18;
            } else {
                if (i2 <= 10) {
                    i = i2 - 1;
                } else {
                    i = (i2 / 10) + 8;
                }
                b = pqe.b(i, 0, 17);
            }
            Context context = df0Var.a;
            if (df0Var.n != b || df0Var.c == null || df0Var.d == null) {
                int i3 = b << 1;
                Drawable mutate = context.getResources().getDrawable(df0.s[i3]).mutate();
                df0Var.c = mutate;
                int i4 = df0Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i4, mode);
                Drawable mutate2 = context.getResources().getDrawable(df0.s[i3 + 1]).mutate();
                df0Var.d = mutate2;
                mutate2.setColorFilter(df0Var.f, mode);
                df0Var.n = b;
                Drawable drawable = df0Var.c;
                if (drawable != null) {
                    drawable.setBounds(df0Var.getBounds());
                }
                Drawable drawable2 = df0Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(df0Var.getBounds());
                }
            }
            df0Var.invalidateSelf();
        }
        setContentDescription(jb6.M0(2131754796, null) + " " + tl_starsRating.level);
        invalidate();
    }

    public void setDelegate(hta htaVar) {
        this.e = htaVar;
    }

    public void setParentExpanded(float f) {
        gta gtaVar = this.b;
        gtaVar.e = f;
        gtaVar.a(gtaVar.a);
        invalidate();
    }

    public void setResourcesProvider(ylb ylbVar) {
        this.b.b = ylbVar;
    }

    public void setVisibility(boolean z) {
        this.h = z;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            gta gtaVar = this.b;
            gtaVar.a(gtaVar.a);
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
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
