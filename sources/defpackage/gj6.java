package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class gj6 extends bf0 {
    public final ylb H;
    public final ij6 I;

    public gj6(ij6 ij6Var, Context context, ylb ylbVar) {
        super(context);
        this.I = ij6Var;
        this.H = ylbVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        ij6 ij6Var = this.I;
        v4b v4bVar = ij6Var.O;
        if (ij6Var.r != null) {
            float L2 = gm.L(1.0f);
            v4bVar.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            v4bVar.a = false;
            v4bVar.b = false;
            v4bVar.v = true;
            v4bVar.o = false;
            v4bVar.J = this.H;
            TL_stories.StoryItem storyItem = ij6Var.r;
            v4bVar.d = storyItem;
            y4b.h(storyItem.dialogId, canvas, this.a, v4bVar);
            return;
        }
        super.onDraw(canvas);
    }
}
