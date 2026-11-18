package ch;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.vi0;
public final class a0 extends FrameLayout implements c6 {
    public final Drawable f5279a;
    public final Rect f5280b;
    public final Paint f5281c;
    public final int[] d;
    public final HashMap f5282e;
    public float f5283f;
    public float h;
    public float f5284n;
    public float f5285r;
    public float f5286s;
    public final Path f5287w;
    public final b0 f5288x;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f5288x = b0Var;
        Rect rect = new Rect();
        this.f5280b = rect;
        Paint paint = new Paint(1);
        this.f5281c = paint;
        this.d = new int[4];
        this.f5282e = new HashMap();
        this.f5283f = 0.0f;
        this.h = 0.0f;
        this.f5284n = 1.0f;
        this.f5285r = 0.0f;
        this.f5286s = 0.0f;
        this.f5287w = new Path();
        Drawable mutate = context.getDrawable(2131232675).mutate();
        this.f5279a = mutate;
        int L = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i7 = n6.Ke;
        i6 i6Var = b0Var.f5310s;
        u6.x(this, mutate, i7, i6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.f5315y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(n6.w0(n6.G8, i6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.f5288x;
        vi0 vi0Var = b0Var.f5305n;
        if (b0Var.f5315y != 1 && (vi0Var == null || vi0Var.getDelegate() == null || !vi0Var.getDelegate().E())) {
            return;
        }
        b0Var.f5304m.f51394g0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.f5288x;
            if (b0Var.f5315y != 2 && (paint = this.f5281c) != null) {
                paint.setColor(n6.w0(n6.G8, b0Var.f5310s));
                invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
