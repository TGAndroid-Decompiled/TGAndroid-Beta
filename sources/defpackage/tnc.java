package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class tnc extends View {
    public final byte a;
    public final vnc b;

    public tnc(vnc vncVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = vncVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        int i = -1;
        vnc vncVar = this.b;
        switch (b) {
            case 0:
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                if (!vncVar.h0) {
                    i = vncVar.i0;
                }
                vncVar.j(canvas, rectF, i, 1.0f);
                return;
            default:
                RectF rectF2 = hl.P;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                if (!vncVar.h0) {
                    i = vncVar.i0;
                }
                vncVar.e(canvas, rectF2, i, 1.0f);
                return;
        }
    }
}
