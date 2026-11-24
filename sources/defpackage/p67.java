package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class p67 extends z82 {
    public final t67 B0;

    public p67(t67 t67Var, Context context) {
        super(context, null, false, null);
        this.B0 = t67Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        t67 t67Var = this.B0;
        t67Var.X.i0(t67Var.c0.getAvatarImageView().getX(), t67Var.c0.getAvatarImageView().getY(), t67Var.c0.getAvatarImageView().getWidth(), t67Var.c0.getAvatarImageView().getHeight());
        if (t67Var.Z) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, t67Var.X.r(), t67Var.X.s());
            t67Var.X.h(canvas, null);
            canvas.restore();
        }
        if (t67Var.Y) {
            int r = (int) (t67Var.X.r() - (cmb.T0.getIntrinsicWidth() / 2));
            int s = (int) (t67Var.X.s() - (cmb.T0.getIntrinsicHeight() / 2));
            Drawable drawable = cmb.T0;
            drawable.setBounds(r, s, drawable.getIntrinsicWidth() + r, cmb.T0.getIntrinsicHeight() + s);
            cmb.T0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0.X.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0.X.K();
    }
}
