package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;
public final class b34 extends bf0 {
    public final c34 H;

    public b34(c34 c34Var, Context context) {
        super(context);
        this.H = c34Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c34 c34Var = this.H;
        e34 e34Var = c34Var.d;
        boolean z = c34Var.c;
        if (!z) {
            if (hs6.d0(e34Var.d1).v0[z ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) && e34Var.t1 != null) {
                canvas.drawCircle(canvas.getWidth() - gm.L(8.0f), gm.L(14.0f), gm.L(3.0f), e34Var.t1);
            }
        }
    }
}
