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
    public final Paint f12156a;
    public final Path f12157b;
    public final RectF f12158c;
    public final Matrix d;
    public final Matrix f12159e;
    public final Matrix f12160f;
    public final Matrix h;
    public final Matrix f12161n;
    public final Matrix f12162r;
    public final j0 f12163s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f12163s = j0Var;
        this.f12156a = new Paint(1);
        this.f12157b = new Path();
        this.f12158c = new RectF();
        this.d = new Matrix();
        this.f12159e = new Matrix();
        this.f12160f = new Matrix();
        this.h = new Matrix();
        this.f12161n = new Matrix();
        this.f12162r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = org.telegram.messenger.g0.f22557m;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f12163s.f12201f.D) - org.telegram.messenger.g0.L(32.0f);
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
        if (this.f12163s.f12207y == null) {
            return;
        }
        b(canvas, false);
    }
}
