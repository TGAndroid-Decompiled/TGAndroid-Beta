package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;
public final class k0 extends View {
    public final Paint f14845a;
    public final Path f14846b;
    public final RectF f14847c;
    public final Matrix d;
    public final Matrix f14848e;
    public final Matrix f14849f;
    public final Matrix h;
    public final Matrix f14850n;
    public final Matrix f14851r;
    public final l0 f14852s;

    public k0(l0 l0Var, Context context) {
        super(context);
        this.f14852s = l0Var;
        this.f14845a = new Paint(1);
        this.f14846b = new Path();
        this.f14847c = new RectF();
        this.d = new Matrix();
        this.f14848e = new Matrix();
        this.f14849f = new Matrix();
        this.h = new Matrix();
        this.f14850n = new Matrix();
        this.f14851r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = org.telegram.messenger.g0.f24140m;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f14852s.f14953f.E) - org.telegram.messenger.g0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.g0.L(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: hi.k0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: hi.k0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f14852s.f14959y == null) {
            return;
        }
        b(canvas, false);
    }
}
