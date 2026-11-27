package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class jva extends View implements snb {
    public final fe0 a;
    public final hva b;
    public final mm c;
    public boolean d;
    public iva e;
    public boolean f;
    public boolean h;

    public jva(Context context) {
        super(context);
        ?? obj = new Object();
        obj.c = -16777216;
        obj.d = -1;
        this.b = obj;
        mm mmVar = new mm(new gva(this, (byte) 0), 380L, k43.h);
        this.c = mmVar;
        fe0 fe0Var = new fe0(context);
        this.a = fe0Var;
        fe0Var.setCallback(this);
        this.d = false;
        mmVar.e(false, 0.0f);
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
        int D = ik8.D(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(D, (getMeasuredHeight() - hl.L(24.0f)) / 2);
        canvas.scale(d, d, 0.0f, hl.L(12.0f));
        int L = hl.L(24.0f);
        int L2 = hl.L(24.0f);
        fe0 fe0Var = this.a;
        fe0Var.setBounds(0, 0, L, L2);
        hva hvaVar = this.b;
        int i = hvaVar.c;
        if (fe0Var.f != i) {
            fe0Var.f = i;
            if (fe0Var.c != null) {
                fe0Var.d.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                fe0Var.invalidateSelf();
            }
        }
        int i2 = hvaVar.d;
        if (fe0Var.e != i2) {
            fe0Var.e = i2;
            Drawable drawable = fe0Var.c;
            if (drawable != null) {
                drawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
                fe0Var.invalidateSelf();
            }
        }
        int i3 = hvaVar.c | (-16777216);
        if (fe0Var.h != i3) {
            fe0Var.h = i3;
            fe0Var.b.v(i3, false);
            fe0Var.invalidateSelf();
        }
        fe0Var.draw(canvas);
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
        fe0 fe0Var = this.a;
        if (fe0Var.r != i2 || fe0Var.c == null || fe0Var.d == null) {
            hn hnVar = fe0Var.b;
            if (i2 >= 0) {
                str = Integer.toString(i2);
            } else {
                str = "!";
            }
            hnVar.t(str, true, true);
            fe0Var.r = i2;
            if (i2 < 0) {
                b = 18;
            } else {
                if (i2 <= 10) {
                    i = i2 - 1;
                } else {
                    i = (i2 / 10) + 8;
                }
                b = ete.b(i, 0, 17);
            }
            Context context = fe0Var.a;
            if (fe0Var.n != b || fe0Var.c == null || fe0Var.d == null) {
                int i3 = b << 1;
                Drawable mutate = context.getResources().getDrawable(fe0.s[i3]).mutate();
                fe0Var.c = mutate;
                int i4 = fe0Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i4, mode);
                Drawable mutate2 = context.getResources().getDrawable(fe0.s[i3 + 1]).mutate();
                fe0Var.d = mutate2;
                mutate2.setColorFilter(fe0Var.f, mode);
                fe0Var.n = b;
                Drawable drawable = fe0Var.c;
                if (drawable != null) {
                    drawable.setBounds(fe0Var.getBounds());
                }
                Drawable drawable2 = fe0Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(fe0Var.getBounds());
                }
            }
            fe0Var.invalidateSelf();
        }
        setContentDescription(ob6.M0(2131754792, null) + " " + tl_starsRating.level);
        invalidate();
    }

    public void setDelegate(iva ivaVar) {
        this.e = ivaVar;
    }

    public void setParentExpanded(float f) {
        hva hvaVar = this.b;
        hvaVar.e = f;
        hvaVar.a(hvaVar.a);
        invalidate();
    }

    public void setResourcesProvider(vnb vnbVar) {
        this.b.b = vnbVar;
    }

    public void setVisibility(boolean z) {
        this.h = z;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            hva hvaVar = this.b;
            hvaVar.a(hvaVar.a);
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
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
