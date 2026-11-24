package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.q;
public final class so5 extends wo5 {
    public ImageReceiver a;
    public float b;
    public final q c;

    public so5(q qVar, Context context) {
        super(context);
        this.c = qVar;
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q qVar = this.c;
        FrameLayout frameLayout = qVar.y;
        wk9 wk9Var = qVar.x;
        ro5 ro5Var = qVar.E;
        super.dispatchDraw(canvas);
        if (this.a == null) {
            return;
        }
        float f = this.b;
        if (f < 1.0f) {
            this.b = Math.min(1.0f, f + 0.064f);
            invalidate();
        }
        canvas.save();
        canvas.translate(ro5Var.getLeft() + frameLayout.getLeft() + wk9Var.getLeft(), ro5Var.getTop() + frameLayout.getTop() + wk9Var.getTop());
        if (this.a.N0 != ro5Var.getWidth()) {
            float width = ro5Var.getWidth() / this.a.N0;
            canvas.scale(width, width);
        }
        ImageReceiver imageReceiver = this.a;
        canvas.translate(-imageReceiver.L0, -imageReceiver.M0);
        float alpha = this.a.getAlpha();
        this.a.setAlpha(this.b);
        this.a.h(canvas, null);
        this.a.setAlpha(alpha);
        canvas.restore();
    }

    @Override
    public final void setImageReceiver(ImageReceiver imageReceiver) {
        if (this.a == null) {
            this.b = 0.0f;
        }
        this.a = imageReceiver;
        invalidate();
    }
}
