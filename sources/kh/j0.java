package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.BubbleActivity;
public final class j0 extends View {
    public final Paint f15450a;
    public final Path f15451b;
    public final RectF f15452c;
    public final Matrix d;
    public final Matrix f15453e;
    public final Matrix f15454f;
    public final Matrix h;
    public final Matrix f15455n;
    public final Matrix f15456r;
    public final k0 f15457s;

    public j0(k0 k0Var, Context context) {
        super(context);
        this.f15457s = k0Var;
        this.f15450a = new Paint(1);
        this.f15451b = new Path();
        this.f15452c = new RectF();
        this.d = new Matrix();
        this.f15453e = new Matrix();
        this.f15454f = new Matrix();
        this.h = new Matrix();
        this.f15455n = new Matrix();
        this.f15456r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = AndroidUtilities.statusBarHeight;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f15457s.f15497f.f47914y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: kh.j0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: kh.j0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f15457s.f15502x == null) {
            return;
        }
        b(canvas, false);
    }
}
