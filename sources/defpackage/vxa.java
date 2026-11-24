package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
public final class vxa extends be0 {
    public final wjb H;
    public final xxa I;

    public vxa(xxa xxaVar, Context context, wjb wjbVar) {
        super(context);
        this.I = xxaVar;
        this.H = wjbVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        xxa xxaVar = this.I;
        u2b u2bVar = xxaVar.r;
        rxa rxaVar = xxaVar.w;
        if (rxaVar != null && (rxaVar.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = gl.L(1.0f);
            u2bVar.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            u2bVar.a = false;
            u2bVar.b = false;
            u2bVar.v = true;
            u2bVar.o = false;
            u2bVar.z = 1;
            u2bVar.J = this.H;
            x2b.h(0L, canvas, this.a, u2bVar);
            return;
        }
        super.onDraw(canvas);
    }
}
