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
    public final Drawable f5282a;
    public final Rect f5283b;
    public final Paint f5284c;
    public final int[] d;
    public final HashMap f5285e;
    public float f5286f;
    public float h;
    public float f5287n;
    public float f5288r;
    public float f5289s;
    public final Path f5290w;
    public final b0 f5291x;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f5291x = b0Var;
        Rect rect = new Rect();
        this.f5283b = rect;
        Paint paint = new Paint(1);
        this.f5284c = paint;
        this.d = new int[4];
        this.f5285e = new HashMap();
        this.f5286f = 0.0f;
        this.h = 0.0f;
        this.f5287n = 1.0f;
        this.f5288r = 0.0f;
        this.f5289s = 0.0f;
        this.f5290w = new Path();
        Drawable mutate = context.getDrawable(2131232675).mutate();
        this.f5282a = mutate;
        int L = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i7 = n6.Ke;
        i6 i6Var = b0Var.f5313s;
        u6.x(this, mutate, i7, i6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.f5318y == 2) {
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
        b0 b0Var = this.f5291x;
        vi0 vi0Var = b0Var.f5308n;
        if (b0Var.f5318y != 1 && (vi0Var == null || vi0Var.getDelegate() == null || !vi0Var.getDelegate().E())) {
            return;
        }
        b0Var.f5307m.f51434g0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.f5291x;
            if (b0Var.f5318y != 2 && (paint = this.f5284c) != null) {
                paint.setColor(n6.w0(n6.G8, b0Var.f5313s));
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
