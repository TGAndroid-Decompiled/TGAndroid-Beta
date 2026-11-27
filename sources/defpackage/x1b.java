package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
public final class x1b extends de0 {
    public final vnb H;
    public final z1b I;

    public x1b(z1b z1bVar, Context context, vnb vnbVar) {
        super(context);
        this.I = z1bVar;
        this.H = vnbVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        z1b z1bVar = this.I;
        q6b q6bVar = z1bVar.r;
        t1b t1bVar = z1bVar.w;
        if (t1bVar != null && (t1bVar.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = hl.L(1.0f);
            q6bVar.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            q6bVar.a = false;
            q6bVar.b = false;
            q6bVar.v = true;
            q6bVar.o = false;
            q6bVar.z = 1;
            q6bVar.J = this.H;
            t6b.h(0L, canvas, this.a, q6bVar);
            return;
        }
        super.onDraw(canvas);
    }
}
