package di;

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
    public final Paint f7384a;
    public final Path f7385b;
    public final RectF f7386c;
    public final Matrix d;
    public final Matrix f7387e;
    public final Matrix f7388f;
    public final Matrix h;
    public final Matrix f7389n;
    public final Matrix f7390r;
    public final j0 f7391s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f7391s = j0Var;
        this.f7384a = new Paint(1);
        this.f7385b = new Path();
        this.f7386c = new RectF();
        this.d = new Matrix();
        this.f7387e = new Matrix();
        this.f7388f = new Matrix();
        this.h = new Matrix();
        this.f7389n = new Matrix();
        this.f7390r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f7391s.f7442f.f16340y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: di.i0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: di.i0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f7391s.f7447x == null) {
            return;
        }
        b(canvas, false);
    }
}
