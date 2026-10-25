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
    public final Paint f10975a;
    public final Path f10976b;
    public final RectF f10977c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f10978f;
    public final Matrix h;
    public final Matrix f10979n;
    public final Matrix f10980r;
    public final j0 f10981s;

    public i0(j0 j0Var, Context context) {
        super(context);
        this.f10981s = j0Var;
        this.f10975a = new Paint(1);
        this.f10976b = new Path();
        this.f10977c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f10978f = new Matrix();
        this.h = new Matrix();
        this.f10979n = new Matrix();
        this.f10980r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = AndroidUtilities.statusBarHeight;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f10981s.f11027f.f18852y) - AndroidUtilities.dp(32.0f);
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
        if (this.f10981s.f11032x == null) {
            return;
        }
        b(canvas, false);
    }
}
