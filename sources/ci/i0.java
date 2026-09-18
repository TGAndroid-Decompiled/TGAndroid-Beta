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
    public final Paint f4774a;
    public final Path f4775b;
    public final RectF f4776c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f4777f;
    public final Matrix h;
    public final Matrix f4778n;
    public final Matrix f4779r;
    public final j0 f4780s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f4780s = j0Var;
        this.f4774a = new Paint(1);
        this.f4775b = new Path();
        this.f4776c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f4777f = new Matrix();
        this.h = new Matrix();
        this.f4778n = new Matrix();
        this.f4779r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f4780s.f4828f.f14265y) - AndroidUtilities.dp(32.0f);
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
        if (this.f4780s.f4833x == null) {
            return;
        }
        b(canvas, false);
    }
}
