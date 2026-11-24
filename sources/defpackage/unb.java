package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class unb extends FrameLayout {
    public final int a;
    public final Rect b;
    public final rob c;

    public unb(rob robVar, Context context, int i, Rect rect) {
        super(context);
        this.c = robVar;
        this.a = i;
        this.b = rect;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        rob robVar = this.c;
        Drawable drawable = robVar.r;
        Rect rect = this.b;
        if (this.a == 0) {
            drawable.setBounds(robVar.X.getLeft() - rect.left, 0, robVar.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            drawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        robVar.r.draw(canvas);
    }
}
