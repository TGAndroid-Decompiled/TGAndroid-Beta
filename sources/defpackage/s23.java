package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;
public final class s23 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f;
    public final Matrix h;
    public final Matrix n;
    public final Matrix r;
    public final t23 s;

    public s23(t23 t23Var, Context context) {
        super(context);
        this.s = t23Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = new Matrix();
        this.h = new Matrix();
        this.n = new Matrix();
        this.r = new Matrix();
    }

    private float getContainerHeight() {
        float f;
        if (!(getContext() instanceof BubbleActivity)) {
            f = gl.m;
        } else {
            f = 0.0f;
        }
        return ((getHeight() - f) - this.s.f.E) - gl.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - gl.L(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s23.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s23.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.s.y == null) {
            return;
        }
        b(canvas, false);
    }
}
