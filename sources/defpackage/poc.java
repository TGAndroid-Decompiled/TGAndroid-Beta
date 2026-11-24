package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
public final class poc extends io {
    public final byte s;
    public final soc w;

    public poc(soc socVar, Context context, byte b) {
        super(context, false, true, true, true, true);
        this.s = b;
        this.w = socVar;
    }

    public final void e(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final void f(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        byte b = this.s;
        soc socVar = this.w;
        switch (b) {
            case 0:
                float c = getDrawable().c();
                float a = socVar.a();
                if (c > 0.0f) {
                    f = Math.min(1.0f, socVar.V / c);
                } else {
                    f = 1.0f;
                }
                float f2 = ((f - a) * socVar.U) + a;
                socVar.b = f2;
                int save = canvas.save();
                canvas.scale(f2, f2, 0.0f, getHeight() / 2.0f);
                float e = (1.0f - socVar.U) * socVar.g0.e(false, socVar.e0);
                ho drawable = getDrawable();
                Objects.requireNonNull(drawable);
                socVar.c(e, new lcc(drawable, (byte) 6), new qhc(this, canvas, (byte) 17));
                canvas.restoreToCount(save);
                return;
            default:
                float e2 = (1.0f - socVar.U) * socVar.g0.e(false, socVar.e0);
                ho drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                socVar.c(e2, new lcc(drawable2, (byte) 6), new qhc(this, canvas, (byte) 18));
                return;
        }
    }
}
