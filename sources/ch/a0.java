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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ii0;
public final class a0 extends FrameLayout implements a6 {
    public final Drawable f6168a;
    public final Rect f6169b;
    public final Paint f6170c;
    public final int[] d;
    public final HashMap f6171e;
    public float f6172f;
    public float h;
    public float f6173n;
    public float f6174r;
    public float f6175s;
    public final Path f6176w;
    public final b0 f6177x;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f6177x = b0Var;
        Rect rect = new Rect();
        this.f6169b = rect;
        Paint paint = new Paint(1);
        this.f6170c = paint;
        this.d = new int[4];
        this.f6171e = new HashMap();
        this.f6172f = 0.0f;
        this.h = 0.0f;
        this.f6173n = 1.0f;
        this.f6174r = 0.0f;
        this.f6175s = 0.0f;
        this.f6176w = new Path();
        Drawable mutate = context.getDrawable(2131232673).mutate();
        this.f6168a = mutate;
        int L = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i7 = k6.He;
        f6 f6Var = b0Var.f6199s;
        r6.y(this, mutate, i7, f6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.f6204y == 2) {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(k6.w0(k6.G8, f6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.f6177x;
        ii0 ii0Var = b0Var.f6194n;
        if (b0Var.f6204y != 1 && (ii0Var == null || ii0Var.getDelegate() == null || !ii0Var.getDelegate().U())) {
            return;
        }
        b0Var.f6193m.f49004f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.f6177x;
            if (b0Var.f6204y != 2 && (paint = this.f6170c) != null) {
                paint.setColor(k6.w0(k6.G8, b0Var.f6199s));
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
