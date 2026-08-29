package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.BubbleActivity;
public final class i0 extends View {
    public final Paint f17861a;
    public final Path f17862b;
    public final RectF f17863c;
    public final Matrix d;
    public final Matrix f17864e;
    public final Matrix f17865f;
    public final Matrix h;
    public final Matrix f17866n;
    public final Matrix f17867r;
    public final j0 f17868s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f17868s = j0Var;
        this.f17861a = new Paint(1);
        this.f17862b = new Path();
        this.f17863c = new RectF();
        this.d = new Matrix();
        this.f17864e = new Matrix();
        this.f17865f = new Matrix();
        this.h = new Matrix();
        this.f17866n = new Matrix();
        this.f17867r = new Matrix();
    }

    private float getContainerHeight() {
        float f9;
        if (!(getContext() instanceof BubbleActivity)) {
            f9 = AndroidUtilities.statusBarHeight;
        } else {
            f9 = 0.0f;
        }
        return ((getHeight() - f9) - this.f17868s.f17920f.f49963y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: nh.i0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: nh.i0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f17868s.f17925x == null) {
            return;
        }
        b(canvas, false);
    }
}
