package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;
public final class i0 extends View {
    public final Paint f12933a;
    public final Path f12934b;
    public final RectF f12935c;
    public final Matrix d;
    public final Matrix f12936e;
    public final Matrix f12937f;
    public final Matrix h;
    public final Matrix f12938n;
    public final Matrix f12939r;
    public final j0 f12940s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f12940s = j0Var;
        this.f12933a = new Paint(1);
        this.f12934b = new Path();
        this.f12935c = new RectF();
        this.d = new Matrix();
        this.f12936e = new Matrix();
        this.f12937f = new Matrix();
        this.h = new Matrix();
        this.f12938n = new Matrix();
        this.f12939r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = org.telegram.messenger.g0.f22602m;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f12940s.f12992f.E) - org.telegram.messenger.g0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.g0.L(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: gi.i0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: gi.i0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f12940s.f12998y == null) {
            return;
        }
        b(canvas, false);
    }
}
