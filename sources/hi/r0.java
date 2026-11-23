package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;
public final class r0 extends View {
    public final Paint f15265a;
    public final Path f15266b;
    public final RectF f15267c;
    public final Matrix d;
    public final Matrix f15268e;
    public final Matrix f15269f;
    public final Matrix h;
    public final Matrix f15270n;
    public final Matrix f15271r;
    public final s0 f15272s;

    public r0(s0 s0Var, Context context) {
        super(context);
        this.f15272s = s0Var;
        this.f15265a = new Paint(1);
        this.f15266b = new Path();
        this.f15267c = new RectF();
        this.d = new Matrix();
        this.f15268e = new Matrix();
        this.f15269f = new Matrix();
        this.h = new Matrix();
        this.f15270n = new Matrix();
        this.f15271r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = org.telegram.messenger.g0.f24220m;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f15272s.f15356f.E) - org.telegram.messenger.g0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.g0.L(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: hi.r0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: hi.r0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f15272s.f15362y == null) {
            return;
        }
        b(canvas, false);
    }
}
