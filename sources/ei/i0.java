package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.BubbleActivity;
public final class i0 extends View {
    public final Paint f9177a;
    public final Path f9178b;
    public final RectF f9179c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f9180f;
    public final Matrix h;
    public final Matrix f9181n;
    public final Matrix f9182r;
    public final j0 f9183s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f9183s = j0Var;
        this.f9177a = new Paint(1);
        this.f9178b = new Path();
        this.f9179c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f9180f = new Matrix();
        this.h = new Matrix();
        this.f9181n = new Matrix();
        this.f9182r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f9183s.f9224f.f16920y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: ei.i0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: ei.i0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f9183s.f9229x == null) {
            return;
        }
        b(canvas, false);
    }
}
