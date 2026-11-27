package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class jj6 extends de0 {
    public final vnb H;
    public final lj6 I;

    public jj6(lj6 lj6Var, Context context, vnb vnbVar) {
        super(context);
        this.I = lj6Var;
        this.H = vnbVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        lj6 lj6Var = this.I;
        q6b q6bVar = lj6Var.O;
        if (lj6Var.r != null) {
            float L2 = hl.L(1.0f);
            q6bVar.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            q6bVar.a = false;
            q6bVar.b = false;
            q6bVar.v = true;
            q6bVar.o = false;
            q6bVar.J = this.H;
            TL_stories.StoryItem storyItem = lj6Var.r;
            q6bVar.d = storyItem;
            t6b.h(storyItem.dialogId, canvas, this.a, q6bVar);
            return;
        }
        super.onDraw(canvas);
    }
}
