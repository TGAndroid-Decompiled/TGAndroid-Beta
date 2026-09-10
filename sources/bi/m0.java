package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.BubbleActivity;
public final class m0 extends View {
    public final Paint f3067a;
    public final Path f3068b;
    public final RectF f3069c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f3070f;
    public final Matrix h;
    public final Matrix f3071n;
    public final Matrix f3072r;
    public final n0 f3073s;

    public m0(n0 n0Var, Context context) {
        super(context);
        this.f3073s = n0Var;
        this.f3067a = new Paint(1);
        this.f3068b = new Path();
        this.f3069c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f3070f = new Matrix();
        this.h = new Matrix();
        this.f3071n = new Matrix();
        this.f3072r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f3073s.f3223f.f12504y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f3073s.f3228x == null) {
            return;
        }
        b(canvas, false);
    }
}
