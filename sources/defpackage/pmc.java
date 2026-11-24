package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
public final class pmc extends hn {
    public final byte s;
    public final smc w;

    public pmc(smc smcVar, Context context, byte b) {
        super(context, false, true, true, true, true);
        this.s = b;
        this.w = smcVar;
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
        smc smcVar = this.w;
        switch (b) {
            case 0:
                float c = getDrawable().c();
                float a = smcVar.a();
                if (c > 0.0f) {
                    f = Math.min(1.0f, smcVar.V / c);
                } else {
                    f = 1.0f;
                }
                float f2 = ((f - a) * smcVar.U) + a;
                smcVar.b = f2;
                int save = canvas.save();
                canvas.scale(f2, f2, 0.0f, getHeight() / 2.0f);
                float e = (1.0f - smcVar.U) * smcVar.g0.e(false, smcVar.e0);
                gn drawable = getDrawable();
                Objects.requireNonNull(drawable);
                smcVar.c(e, new dkc(drawable, (byte) 2), new mhc(this, canvas, (byte) 15));
                canvas.restoreToCount(save);
                return;
            default:
                float e2 = (1.0f - smcVar.U) * smcVar.g0.e(false, smcVar.e0);
                gn drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                smcVar.c(e2, new dkc(drawable2, (byte) 2), new mhc(this, canvas, (byte) 16));
                return;
        }
    }
}
