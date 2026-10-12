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
public final class h0 extends View {
    public final Paint f5145a;
    public final Path f5146b;
    public final RectF f5147c;
    public final Matrix d;
    public final Matrix f5148e;
    public final Matrix f5149f;
    public final Matrix h;
    public final Matrix f5150n;
    public final Matrix f5151r;
    public final i0 f5152s;

    public h0(i0 i0Var, Context context) {
        super(context);
        this.f5152s = i0Var;
        this.f5145a = new Paint(1);
        this.f5146b = new Path();
        this.f5147c = new RectF();
        this.d = new Matrix();
        this.f5148e = new Matrix();
        this.f5149f = new Matrix();
        this.h = new Matrix();
        this.f5150n = new Matrix();
        this.f5151r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f5152s.f5182f.f15328y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: ci.h0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: ci.h0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f5152s.f5187x == null) {
            return;
        }
        b(canvas, false);
    }
}
