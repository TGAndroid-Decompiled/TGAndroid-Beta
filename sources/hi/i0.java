package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;
public final class i0 extends View {
    public final Paint f14394a;
    public final Path f14395b;
    public final RectF f14396c;
    public final Matrix d;
    public final Matrix f14397e;
    public final Matrix f14398f;
    public final Matrix h;
    public final Matrix f14399n;
    public final Matrix f14400r;
    public final j0 f14401s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f14401s = j0Var;
        this.f14394a = new Paint(1);
        this.f14395b = new Path();
        this.f14396c = new RectF();
        this.d = new Matrix();
        this.f14397e = new Matrix();
        this.f14398f = new Matrix();
        this.h = new Matrix();
        this.f14399n = new Matrix();
        this.f14400r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = org.telegram.messenger.g0.f23605m;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f14401s.f14445f.E) - org.telegram.messenger.g0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.g0.L(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: hi.i0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: hi.i0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f14401s.f14451y == null) {
            return;
        }
        b(canvas, false);
    }
}
