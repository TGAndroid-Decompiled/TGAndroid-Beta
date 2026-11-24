package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class df0 extends Drawable implements Drawable.Callback {
    public static int[] s;
    public final Context a;
    public final ho b;
    public Drawable c;
    public Drawable d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public df0(Context context) {
        this.a = context;
        ho hoVar = new ho(false, false, false);
        this.b = hoVar;
        hoVar.x(gm.n1("fonts/rcondensedbold.ttf"));
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(10.0f));
        hoVar.b = 17;
        hoVar.setCallback(this);
        hoVar.U = true;
        if (s != null) {
            return;
        }
        s = new int[]{2131232602, 2131232603, 2131232606, 2131232607, 2131232610, 2131232611, 2131232614, 2131232615, 2131232618, 2131232619, 2131232622, 2131232623, 2131232626, 2131232627, 2131232630, 2131232631, 2131232634, 2131232635, 2131232600, 2131232601, 2131232604, 2131232605, 2131232608, 2131232609, 2131232612, 2131232613, 2131232616, 2131232617, 2131232620, 2131232621, 2131232624, 2131232625, 2131232628, 2131232629, 2131232632, 2131232633, 2131232636, 2131232637};
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null && this.c != null) {
            drawable.draw(canvas);
            this.c.draw(canvas);
            canvas.save();
            canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
            this.b.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(getBounds());
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public final void setAlpha(int i) {
        int p = on2.p(this.e, i);
        if (this.e != p) {
            this.e = p;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(p, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int p2 = on2.p(this.f, i);
        if (this.f != p2) {
            this.f = p2;
            if (this.c != null) {
                this.d.setColorFilter(p2, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int p3 = on2.p(this.h, i);
        if (this.h != p3) {
            this.h = p3;
            this.b.v(p3, false);
            invalidateSelf();
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
