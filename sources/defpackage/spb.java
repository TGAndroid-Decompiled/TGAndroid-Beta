package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class spb extends FrameLayout {
    public final int a;
    public final Rect b;
    public final pqb c;

    public spb(pqb pqbVar, Context context, int i, Rect rect) {
        super(context);
        this.c = pqbVar;
        this.a = i;
        this.b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        pqb pqbVar = this.c;
        Drawable drawable = pqbVar.r;
        Rect rect = this.b;
        if (this.a == 0) {
            drawable.setBounds(pqbVar.X.getLeft() - rect.left, 0, pqbVar.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            drawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        pqbVar.r.draw(canvas);
    }
}
