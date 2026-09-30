package ci;

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
    public final Paint f4772a;
    public final Path f4773b;
    public final RectF f4774c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f4775f;
    public final Matrix h;
    public final Matrix f4776n;
    public final Matrix f4777r;
    public final j0 f4778s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f4778s = j0Var;
        this.f4772a = new Paint(1);
        this.f4773b = new Path();
        this.f4774c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f4775f = new Matrix();
        this.h = new Matrix();
        this.f4776n = new Matrix();
        this.f4777r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f4778s.f4813f.f14348y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: ci.i0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: ci.i0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f4778s.f4818x == null) {
            return;
        }
        b(canvas, false);
    }
}
