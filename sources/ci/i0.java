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
    public final Paint f4766a;
    public final Path f4767b;
    public final RectF f4768c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f4769f;
    public final Matrix h;
    public final Matrix f4770n;
    public final Matrix f4771r;
    public final j0 f4772s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f4772s = j0Var;
        this.f4766a = new Paint(1);
        this.f4767b = new Path();
        this.f4768c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f4769f = new Matrix();
        this.h = new Matrix();
        this.f4770n = new Matrix();
        this.f4771r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f4772s.f4807f.f14334y) - AndroidUtilities.dp(32.0f);
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
        if (this.f4772s.f4812x == null) {
            return;
        }
        b(canvas, false);
    }
}
