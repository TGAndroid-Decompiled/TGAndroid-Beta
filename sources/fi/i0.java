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
    public final Paint f12160a;
    public final Path f12161b;
    public final RectF f12162c;
    public final Matrix d;
    public final Matrix f12163e;
    public final Matrix f12164f;
    public final Matrix h;
    public final Matrix f12165n;
    public final Matrix f12166r;
    public final j0 f12167s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f12167s = j0Var;
        this.f12160a = new Paint(1);
        this.f12161b = new Path();
        this.f12162c = new RectF();
        this.d = new Matrix();
        this.f12163e = new Matrix();
        this.f12164f = new Matrix();
        this.h = new Matrix();
        this.f12165n = new Matrix();
        this.f12166r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = org.telegram.messenger.g0.f22561m;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f12167s.f12205f.D) - org.telegram.messenger.g0.L(32.0f);
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
        if (this.f12167s.f12211y == null) {
            return;
        }
        b(canvas, false);
    }
}
