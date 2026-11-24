package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class pl4 extends FrameLayout {
    public final byte a;
    public final tl4 b;

    public pl4(tl4 tl4Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = tl4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                tl4 tl4Var = this.b;
                lx9 lx9Var = tl4Var.G;
                if (lx9Var != null && lx9Var.a()) {
                    tl4Var.G.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    tl4Var.G.draw(canvas);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl4.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                tl4 tl4Var = this.b;
                ucc uccVar = tl4Var.F;
                if (uccVar.j) {
                    uccVar.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    uccVar.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                tl4Var.b.u0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
