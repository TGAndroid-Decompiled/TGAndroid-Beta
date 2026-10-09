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
    public final Paint f5147a;
    public final Path f5148b;
    public final RectF f5149c;
    public final Matrix d;
    public final Matrix f5150e;
    public final Matrix f5151f;
    public final Matrix h;
    public final Matrix f5152n;
    public final Matrix f5153r;
    public final i0 f5154s;

    public h0(i0 i0Var, Context context) {
        super(context);
        this.f5154s = i0Var;
        this.f5147a = new Paint(1);
        this.f5148b = new Path();
        this.f5149c = new RectF();
        this.d = new Matrix();
        this.f5150e = new Matrix();
        this.f5151f = new Matrix();
        this.h = new Matrix();
        this.f5152n = new Matrix();
        this.f5153r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f5154s.f5184f.f15582y) - AndroidUtilities.dp(32.0f);
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
        if (this.f5154s.f5189x == null) {
            return;
        }
        b(canvas, false);
    }
}
