package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class xca extends Drawable {
    public long a = 0;
    public final float[] b = {0.0f, -0.5f};
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final byte f;

    public xca(Context context, int i) {
        this.f = i;
        if (i == 4) {
            this.c = b10.d(context, 2131231109);
            this.d = b10.d(context, 2131232751);
            this.e = b10.d(context, 2131232752);
        } else if (i == 5) {
            this.c = b10.d(context, 2131231176);
            this.d = b10.d(context, 2131232751);
            this.e = b10.d(context, 2131232752);
        } else if (i == 1) {
            this.c = b10.d(context, 2131232750);
            this.d = b10.d(context, 2131232751);
            this.e = b10.d(context, 2131232752);
        } else {
            this.c = b10.d(context, 2131230869);
            this.d = b10.d(context, 2131230870);
            this.e = b10.d(context, 2131230871);
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xca.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        byte b = this.f;
        if (b != 4 && b != 5) {
            if (b == 3) {
                return gm.L(100.0f);
            }
            if (b == 2) {
                return gm.L(74.0f);
            }
            if (b == 1) {
                return gm.L(40.0f);
            }
            return gm.L(180.0f);
        }
        return gm.L(42.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        byte b = this.f;
        if (b != 4 && b != 5) {
            if (b == 3) {
                return gm.L(100.0f);
            }
            if (b == 2) {
                return gm.L(74.0f);
            }
            if (b == 1) {
                return gm.L(40.0f);
            }
            return gm.L(120.0f);
        }
        return gm.L(42.0f);
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
