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
    public final Paint f14782a;
    public final Path f14783b;
    public final RectF f14784c;
    public final Matrix d;
    public final Matrix f14785e;
    public final Matrix f14786f;
    public final Matrix h;
    public final Matrix f14787n;
    public final Matrix f14788r;
    public final k0 f14789s;

    public j0(k0 k0Var, Context context) {
        super(context);
        this.f14789s = k0Var;
        this.f14782a = new Paint(1);
        this.f14783b = new Path();
        this.f14784c = new RectF();
        this.d = new Matrix();
        this.f14785e = new Matrix();
        this.f14786f = new Matrix();
        this.h = new Matrix();
        this.f14787n = new Matrix();
        this.f14788r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = org.telegram.messenger.g0.f24112m;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f14789s.f14841f.E) - org.telegram.messenger.g0.L(32.0f);
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
        if (this.f14789s.f14847y == null) {
            return;
        }
        b(canvas, false);
    }
}
