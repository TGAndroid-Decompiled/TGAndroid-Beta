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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.ji0;
public final class a0 extends FrameLayout implements b6 {
    public final Drawable f6166a;
    public final Rect f6167b;
    public final Paint f6168c;
    public final int[] d;
    public final HashMap f6169e;
    public float f6170f;
    public float h;
    public float f6171n;
    public float f6172r;
    public float f6173s;
    public final Path f6174w;
    public final b0 f6175x;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f6175x = b0Var;
        Rect rect = new Rect();
        this.f6167b = rect;
        Paint paint = new Paint(1);
        this.f6168c = paint;
        this.d = new int[4];
        this.f6169e = new HashMap();
        this.f6170f = 0.0f;
        this.h = 0.0f;
        this.f6171n = 1.0f;
        this.f6172r = 0.0f;
        this.f6173s = 0.0f;
        this.f6174w = new Path();
        Drawable mutate = context.getDrawable(2131232673).mutate();
        this.f6166a = mutate;
        int L = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i7 = l6.He;
        g6 g6Var = b0Var.f6197s;
        s6.x(this, mutate, i7, g6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.f6202y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(l6.w0(l6.G8, g6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.f6175x;
        ji0 ji0Var = b0Var.f6192n;
        if (b0Var.f6202y != 1 && (ji0Var == null || ji0Var.getDelegate() == null || !ji0Var.getDelegate().U())) {
            return;
        }
        b0Var.f6191m.f49676f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.f6175x;
            if (b0Var.f6202y != 2 && (paint = this.f6168c) != null) {
                paint.setColor(l6.w0(l6.G8, b0Var.f6197s));
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
