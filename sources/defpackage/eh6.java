package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;
public final class eh6 extends be0 {
    public final wjb H;
    public final gh6 I;

    public eh6(gh6 gh6Var, Context context, wjb wjbVar) {
        super(context);
        this.I = gh6Var;
        this.H = wjbVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        gh6 gh6Var = this.I;
        u2b u2bVar = gh6Var.O;
        if (gh6Var.r != null) {
            float L2 = gl.L(1.0f);
            u2bVar.F.set(L2, L2, getMeasuredWidth() - L, getMeasuredHeight() - L);
            u2bVar.a = false;
            u2bVar.b = false;
            u2bVar.v = true;
            u2bVar.o = false;
            u2bVar.J = this.H;
            TL_stories.StoryItem storyItem = gh6Var.r;
            u2bVar.d = storyItem;
            x2b.h(storyItem.dialogId, canvas, this.a, u2bVar);
            return;
        }
        super.onDraw(canvas);
    }
}
