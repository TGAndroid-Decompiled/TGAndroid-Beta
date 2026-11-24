package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;
public final class q14 extends be0 {
    public final r14 H;

    public q14(r14 r14Var, Context context) {
        super(context);
        this.H = r14Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        r14 r14Var = this.H;
        t14 t14Var = r14Var.d;
        boolean z = r14Var.c;
        if (!z) {
            if (hq6.d0(t14Var.d1).v0[z ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.id)) && t14Var.t1 != null) {
                canvas.drawCircle(canvas.getWidth() - gl.L(8.0f), gl.L(14.0f), gl.L(3.0f), t14Var.t1);
            }
        }
    }
}
