package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;
public final class yza extends bf0 {
    public final ylb H;
    public final a0b I;

    public yza(a0b a0bVar, Context context, ylb ylbVar) {
        super(context);
        this.I = a0bVar;
        this.H = ylbVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        a0b a0bVar = this.I;
        v4b v4bVar = a0bVar.r;
        uza uzaVar = a0bVar.w;
        if (uzaVar != null && (uzaVar.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            float L2 = gm.L(1.0f);
            v4bVar.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            v4bVar.a = false;
            v4bVar.b = false;
            v4bVar.v = true;
            v4bVar.o = false;
            v4bVar.z = 1;
            v4bVar.J = this.H;
            y4b.h(0L, canvas, this.a, v4bVar);
            return;
        }
        super.onDraw(canvas);
    }
}
