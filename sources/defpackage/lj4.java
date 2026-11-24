package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class lj4 extends FrameLayout {
    public final byte a;
    public final sj4 b;

    public lj4(sj4 sj4Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = sj4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                sj4 sj4Var = this.b;
                iv9 iv9Var = sj4Var.G;
                if (iv9Var != null && iv9Var.a()) {
                    sj4Var.G.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    sj4Var.G.draw(canvas);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj4.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                sj4 sj4Var = this.b;
                rac racVar = sj4Var.F;
                if (racVar.j) {
                    racVar.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    racVar.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                sj4Var.b.r2(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
