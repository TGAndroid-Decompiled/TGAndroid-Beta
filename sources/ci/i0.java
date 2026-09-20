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
    public final Paint f4775a;
    public final Path f4776b;
    public final RectF f4777c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f4778f;
    public final Matrix h;
    public final Matrix f4779n;
    public final Matrix f4780r;
    public final j0 f4781s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f4781s = j0Var;
        this.f4775a = new Paint(1);
        this.f4776b = new Path();
        this.f4777c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f4778f = new Matrix();
        this.h = new Matrix();
        this.f4779n = new Matrix();
        this.f4780r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f4781s.f4829f.f14301y) - AndroidUtilities.dp(32.0f);
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
        if (this.f4781s.f4834x == null) {
            return;
        }
        b(canvas, false);
    }
}
