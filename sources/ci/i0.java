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
    public final Paint f4773a;
    public final Path f4774b;
    public final RectF f4775c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f4776f;
    public final Matrix h;
    public final Matrix f4777n;
    public final Matrix f4778r;
    public final j0 f4779s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f4779s = j0Var;
        this.f4773a = new Paint(1);
        this.f4774b = new Path();
        this.f4775c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f4776f = new Matrix();
        this.h = new Matrix();
        this.f4777n = new Matrix();
        this.f4778r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f4779s.f4827f.f14316y) - AndroidUtilities.dp(32.0f);
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
        if (this.f4779s.f4832x == null) {
            return;
        }
        b(canvas, false);
    }
}
