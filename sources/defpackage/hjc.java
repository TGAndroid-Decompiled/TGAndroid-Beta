package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class hjc extends View {
    public final byte a;
    public final jjc b;

    public hjc(jjc jjcVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = jjcVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        int i = -1;
        jjc jjcVar = this.b;
        switch (b) {
            case 0:
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                if (!jjcVar.g0) {
                    i = jjcVar.h0;
                }
                jjcVar.j(canvas, rectF, i, 1.0f);
                return;
            default:
                RectF rectF2 = gl.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                if (!jjcVar.g0) {
                    i = jjcVar.h0;
                }
                jjcVar.e(canvas, rectF2, i, 1.0f);
                return;
        }
    }
}
