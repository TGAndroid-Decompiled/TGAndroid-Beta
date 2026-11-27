package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class pl4 extends FrameLayout {
    public final byte a;
    public final xl4 b;

    public pl4(xl4 xl4Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = xl4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                xl4 xl4Var = this.b;
                cz9 cz9Var = xl4Var.J;
                if (cz9Var != null && cz9Var.a()) {
                    xl4Var.J.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    xl4Var.J.draw(canvas);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl4.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                xl4 xl4Var = this.b;
                rec recVar = xl4Var.I;
                if (recVar.j) {
                    recVar.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    recVar.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                xl4Var.b.v0(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
