package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class oea extends Drawable {
    public long a = 0;
    public final float[] b = {0.0f, -0.5f};
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final byte f;

    public oea(Context context, int i) {
        this.f = i;
        if (i == 4) {
            this.c = c00.e(context, 2131231108);
            this.d = c00.e(context, 2131232750);
            this.e = c00.e(context, 2131232751);
        } else if (i == 5) {
            this.c = c00.e(context, 2131231175);
            this.d = c00.e(context, 2131232750);
            this.e = c00.e(context, 2131232751);
        } else if (i == 1) {
            this.c = c00.e(context, 2131232749);
            this.d = c00.e(context, 2131232750);
            this.e = c00.e(context, 2131232751);
        } else {
            this.c = c00.e(context, 2131230868);
            this.d = c00.e(context, 2131230869);
            this.e = c00.e(context, 2131230870);
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oea.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        byte b = this.f;
        if (b != 4 && b != 5) {
            if (b == 3) {
                return hl.L(100.0f);
            }
            if (b == 2) {
                return hl.L(74.0f);
            }
            if (b == 1) {
                return hl.L(40.0f);
            }
            return hl.L(180.0f);
        }
        return hl.L(42.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        byte b = this.f;
        if (b != 4 && b != 5) {
            if (b == 3) {
                return hl.L(100.0f);
            }
            if (b == 2) {
                return hl.L(74.0f);
            }
            if (b == 1) {
                return hl.L(40.0f);
            }
            return hl.L(120.0f);
        }
        return hl.L(42.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i) {
    }
}
