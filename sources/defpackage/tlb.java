package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class tlb extends FrameLayout {
    public final int a;
    public final Rect b;
    public final qmb c;

    public tlb(qmb qmbVar, Context context, int i, Rect rect) {
        super(context);
        this.c = qmbVar;
        this.a = i;
        this.b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        qmb qmbVar = this.c;
        Drawable drawable = qmbVar.r;
        Rect rect = this.b;
        if (this.a == 0) {
            drawable.setBounds(qmbVar.X.getLeft() - rect.left, 0, qmbVar.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            drawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        qmbVar.r.draw(canvas);
    }
}
