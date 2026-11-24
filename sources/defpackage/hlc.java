package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class hlc extends View {
    public final byte a;
    public final jlc b;

    public hlc(jlc jlcVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = jlcVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        int i = -1;
        jlc jlcVar = this.b;
        switch (b) {
            case 0:
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                if (!jlcVar.g0) {
                    i = jlcVar.h0;
                }
                jlcVar.j(canvas, rectF, i, 1.0f);
                return;
            default:
                RectF rectF2 = gm.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                if (!jlcVar.g0) {
                    i = jlcVar.h0;
                }
                jlcVar.e(canvas, rectF2, i, 1.0f);
                return;
        }
    }
}
