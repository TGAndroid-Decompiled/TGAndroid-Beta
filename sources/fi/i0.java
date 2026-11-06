package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;
public final class i0 extends View {
    public final Paint f12153a;
    public final Path f12154b;
    public final RectF f12155c;
    public final Matrix d;
    public final Matrix f12156e;
    public final Matrix f12157f;
    public final Matrix h;
    public final Matrix f12158n;
    public final Matrix f12159r;
    public final j0 f12160s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f12160s = j0Var;
        this.f12153a = new Paint(1);
        this.f12154b = new Path();
        this.f12155c = new RectF();
        this.d = new Matrix();
        this.f12156e = new Matrix();
        this.f12157f = new Matrix();
        this.h = new Matrix();
        this.f12158n = new Matrix();
        this.f12159r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = org.telegram.messenger.g0.f22531m;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f12160s.f12201f.D) - org.telegram.messenger.g0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.g0.L(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: fi.i0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: fi.i0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f12160s.f12207y == null) {
            return;
        }
        b(canvas, false);
    }
}
