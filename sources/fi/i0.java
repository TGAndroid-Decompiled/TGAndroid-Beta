package fi;

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
    public final Paint f10974a;
    public final Path f10975b;
    public final RectF f10976c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f10977f;
    public final Matrix h;
    public final Matrix f10978n;
    public final Matrix f10979r;
    public final j0 f10980s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f10980s = j0Var;
        this.f10974a = new Paint(1);
        this.f10975b = new Path();
        this.f10976c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f10977f = new Matrix();
        this.h = new Matrix();
        this.f10978n = new Matrix();
        this.f10979r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f10980s.f11026f.f18851y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: fi.i0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: fi.i0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f10980s.f11031x == null) {
            return;
        }
        b(canvas, false);
    }
}
