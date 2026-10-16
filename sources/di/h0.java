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
public final class h0 extends View {
    public final Paint f6985a;
    public final Path f6986b;
    public final RectF f6987c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f6988f;
    public final Matrix h;
    public final Matrix f6989n;
    public final Matrix f6990r;
    public final i0 f6991s;

    public h0(i0 i0Var, Context context) {
        super(context);
        this.f6991s = i0Var;
        this.f6985a = new Paint(1);
        this.f6986b = new Path();
        this.f6987c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f6988f = new Matrix();
        this.h = new Matrix();
        this.f6989n = new Matrix();
        this.f6990r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f6991s.f7025f.f15568y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: di.h0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: di.h0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f6991s.f7030x == null) {
            return;
        }
        b(canvas, false);
    }
}
