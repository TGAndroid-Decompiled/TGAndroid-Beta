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
    public final Paint f5148a;
    public final Path f5149b;
    public final RectF f5150c;
    public final Matrix d;
    public final Matrix f5151e;
    public final Matrix f5152f;
    public final Matrix h;
    public final Matrix f5153n;
    public final Matrix f5154r;
    public final j0 f5155s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f5155s = j0Var;
        this.f5148a = new Paint(1);
        this.f5149b = new Path();
        this.f5150c = new RectF();
        this.d = new Matrix();
        this.f5151e = new Matrix();
        this.f5152f = new Matrix();
        this.h = new Matrix();
        this.f5153n = new Matrix();
        this.f5154r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f5155s.f5193f.f15586y) - AndroidUtilities.dp(32.0f);
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
        if (this.f5155s.f5198x == null) {
            return;
        }
        b(canvas, false);
    }
}
