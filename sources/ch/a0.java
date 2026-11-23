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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.xi0;
public final class a0 extends FrameLayout implements b6 {
    public final Drawable f5274a;
    public final Rect f5275b;
    public final Paint f5276c;
    public final int[] d;
    public final HashMap f5277e;
    public float f5278f;
    public float h;
    public float f5279n;
    public float f5280r;
    public float f5281s;
    public final Path f5282w;
    public final b0 f5283x;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f5283x = b0Var;
        Rect rect = new Rect();
        this.f5275b = rect;
        Paint paint = new Paint(1);
        this.f5276c = paint;
        this.d = new int[4];
        this.f5277e = new HashMap();
        this.f5278f = 0.0f;
        this.h = 0.0f;
        this.f5279n = 1.0f;
        this.f5280r = 0.0f;
        this.f5281s = 0.0f;
        this.f5282w = new Path();
        Drawable mutate = context.getDrawable(2131232675).mutate();
        this.f5274a = mutate;
        int L = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i7 = m6.Ke;
        h6 h6Var = b0Var.f5305s;
        t6.x(this, mutate, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.f5310y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(m6.w0(m6.G8, h6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.f5283x;
        xi0 xi0Var = b0Var.f5300n;
        if (b0Var.f5310y != 1 && (xi0Var == null || xi0Var.getDelegate() == null || !xi0Var.getDelegate().E())) {
            return;
        }
        b0Var.f5299m.f51418g0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.f5283x;
            if (b0Var.f5310y != 2 && (paint = this.f5276c) != null) {
                paint.setColor(m6.w0(m6.G8, b0Var.f5305s));
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
