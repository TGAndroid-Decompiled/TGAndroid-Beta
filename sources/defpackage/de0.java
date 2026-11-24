package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class de0 extends Drawable implements Drawable.Callback {
    public static int[] s;
    public final Context a;
    public final gn b;
    public Drawable c;
    public Drawable d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public de0(Context context) {
        this.a = context;
        gn gnVar = new gn(false, false, false);
        this.b = gnVar;
        gnVar.x(gl.n1("fonts/rcondensedbold.ttf"));
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(10.0f));
        gnVar.b = 17;
        gnVar.setCallback(this);
        gnVar.U = true;
        if (s != null) {
            return;
        }
        s = new int[]{2131232590, 2131232591, 2131232594, 2131232595, 2131232598, 2131232599, 2131232602, 2131232603, 2131232606, 2131232607, 2131232610, 2131232611, 2131232614, 2131232615, 2131232618, 2131232619, 2131232622, 2131232623, 2131232588, 2131232589, 2131232592, 2131232593, 2131232596, 2131232597, 2131232600, 2131232601, 2131232604, 2131232605, 2131232608, 2131232609, 2131232612, 2131232613, 2131232616, 2131232617, 2131232620, 2131232621, 2131232624, 2131232625};
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
        return gl.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gl.L(24.0f);
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
        int o = bm2.o(this.e, i);
        if (this.e != o) {
            this.e = o;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(o, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o2 = bm2.o(this.f, i);
        if (this.f != o2) {
            this.f = o2;
            if (this.c != null) {
                this.d.setColorFilter(o2, PorterDuff.Mode.MULTIPLY);
                invalidateSelf();
            }
        }
        int o3 = bm2.o(this.h, i);
        if (this.h != o3) {
            this.h = o3;
            this.b.v(o3, false);
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
