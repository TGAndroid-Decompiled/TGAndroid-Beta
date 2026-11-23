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
    public final Paint f14848a;
    public final Path f14849b;
    public final RectF f14850c;
    public final Matrix d;
    public final Matrix f14851e;
    public final Matrix f14852f;
    public final Matrix h;
    public final Matrix f14853n;
    public final Matrix f14854r;
    public final l0 f14855s;

    public k0(l0 l0Var, Context context) {
        super(context);
        this.f14855s = l0Var;
        this.f14848a = new Paint(1);
        this.f14849b = new Path();
        this.f14850c = new RectF();
        this.d = new Matrix();
        this.f14851e = new Matrix();
        this.f14852f = new Matrix();
        this.h = new Matrix();
        this.f14853n = new Matrix();
        this.f14854r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = org.telegram.messenger.g0.f24040m;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f14855s.f14956f.E) - org.telegram.messenger.g0.L(32.0f);
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
        if (this.f14855s.f14962y == null) {
            return;
        }
        b(canvas, false);
    }
}
