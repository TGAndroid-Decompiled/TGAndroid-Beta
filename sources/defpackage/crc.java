package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
public final class crc extends in {
    public final byte s;
    public final frc w;

    public crc(frc frcVar, Context context, byte b) {
        super(context, false, true, true, true, true);
        this.s = b;
        this.w = frcVar;
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
        frc frcVar = this.w;
        switch (b) {
            case 0:
                float c = getDrawable().c();
                float a = frcVar.a();
                if (c > 0.0f) {
                    f = Math.min(1.0f, frcVar.V / c);
                } else {
                    f = 1.0f;
                }
                float f2 = ((f - a) * frcVar.U) + a;
                frcVar.b = f2;
                int save = canvas.save();
                canvas.scale(f2, f2, 0.0f, getHeight() / 2.0f);
                float e = (1.0f - frcVar.U) * frcVar.g0.e(false, frcVar.e0);
                hn drawable = getDrawable();
                Objects.requireNonNull(drawable);
                frcVar.c(e, new ftb(drawable, (byte) 16), new slc(this, canvas, (byte) 15));
                canvas.restoreToCount(save);
                return;
            default:
                float e2 = (1.0f - frcVar.U) * frcVar.g0.e(false, frcVar.e0);
                hn drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                frcVar.c(e2, new ftb(drawable2, (byte) 16), new slc(this, canvas, (byte) 16));
                return;
        }
    }
}
