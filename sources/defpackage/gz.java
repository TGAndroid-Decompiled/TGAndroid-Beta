package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class gz extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final mz c;

    public gz(mz mzVar, Context context) {
        super(context);
        this.c = mzVar;
        this.a = new RectF();
        this.b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mz mzVar = this.c;
        hz hzVar = mzVar.V1;
        FrameLayout frameLayout = hzVar.b;
        RectF rectF = this.a;
        if (yic.c(frameLayout, this, rectF)) {
            TextView textView = mzVar.W1;
            RectF rectF2 = this.b;
            if (yic.c(textView, this, rectF2)) {
                float L = rectF2.right - hl.L(32.0f);
                float centerY = rectF2.centerY() - hl.L(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(L, centerY);
                    canvas.scale(hl.L(32.0f) / rectF.width(), hl.L(32.0f) / rectF.height());
                    hzVar.b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
