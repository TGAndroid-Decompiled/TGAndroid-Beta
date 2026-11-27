package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;
public final class l24 extends de0 {
    public final m24 H;

    public l24(m24 m24Var, Context context) {
        super(context);
        this.H = m24Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m24 m24Var = this.H;
        o24 o24Var = m24Var.d;
        boolean z = m24Var.c;
        if (!z) {
            if (ls6.d0(o24Var.d1).v0[z ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) && o24Var.t1 != null) {
                canvas.drawCircle(canvas.getWidth() - hl.L(8.0f), hl.L(14.0f), hl.L(3.0f), o24Var.t1);
            }
        }
    }
}
