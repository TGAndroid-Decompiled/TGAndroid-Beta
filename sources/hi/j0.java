package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;
public final class j0 extends View {
    public final Paint f14742a;
    public final Path f14743b;
    public final RectF f14744c;
    public final Matrix d;
    public final Matrix f14745e;
    public final Matrix f14746f;
    public final Matrix h;
    public final Matrix f14747n;
    public final Matrix f14748r;
    public final k0 f14749s;

    public j0(k0 k0Var, Context context) {
        super(context);
        this.f14749s = k0Var;
        this.f14742a = new Paint(1);
        this.f14743b = new Path();
        this.f14744c = new RectF();
        this.d = new Matrix();
        this.f14745e = new Matrix();
        this.f14746f = new Matrix();
        this.h = new Matrix();
        this.f14747n = new Matrix();
        this.f14748r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = org.telegram.messenger.g0.f24004m;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f14749s.f14798f.E) - org.telegram.messenger.g0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.g0.L(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: hi.j0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: hi.j0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f14749s.f14804y == null) {
            return;
        }
        b(canvas, false);
    }
}
