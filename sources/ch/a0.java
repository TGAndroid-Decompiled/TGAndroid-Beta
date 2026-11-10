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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ii0;
public final class a0 extends FrameLayout implements c6 {
    public final Drawable f6171a;
    public final Rect f6172b;
    public final Paint f6173c;
    public final int[] d;
    public final HashMap f6174e;
    public float f6175f;
    public float h;
    public float f6176n;
    public float f6177r;
    public float f6178s;
    public final Path f6179w;
    public final b0 f6180x;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f6180x = b0Var;
        Rect rect = new Rect();
        this.f6172b = rect;
        Paint paint = new Paint(1);
        this.f6173c = paint;
        this.d = new int[4];
        this.f6174e = new HashMap();
        this.f6175f = 0.0f;
        this.h = 0.0f;
        this.f6176n = 1.0f;
        this.f6177r = 0.0f;
        this.f6178s = 0.0f;
        this.f6179w = new Path();
        Drawable mutate = context.getDrawable(2131232673).mutate();
        this.f6171a = mutate;
        int L = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i7 = m6.He;
        h6 h6Var = b0Var.f6202s;
        t6.x(this, mutate, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.f6207y == 2) {
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
        b0 b0Var = this.f6180x;
        ii0 ii0Var = b0Var.f6197n;
        if (b0Var.f6207y != 1 && (ii0Var == null || ii0Var.getDelegate() == null || !ii0Var.getDelegate().U())) {
            return;
        }
        b0Var.f6196m.f50032f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ch.a0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.f6180x;
            if (b0Var.f6207y != 2 && (paint = this.f6173c) != null) {
                paint.setColor(m6.w0(m6.G8, b0Var.f6202s));
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
