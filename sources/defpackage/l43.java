package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.HashSet;
public final class l43 extends FrameLayout implements tjb {
    public final Drawable a;
    public final Rect b;
    public final Paint c;
    public final int[] d;
    public final HashMap e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public final Path w;
    public final m43 x;

    public l43(m43 m43Var, Context context) {
        super(context);
        this.x = m43Var;
        Rect rect = new Rect();
        this.b = rect;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f = 0.0f;
        this.h = 0.0f;
        this.n = 1.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.w = new Path();
        Drawable mutate = context.getDrawable(2131232678).mutate();
        this.a = mutate;
        int L = gl.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i = bkb.Je;
        wjb wjbVar = m43Var.s;
        zkb.x(this, mutate, i, wjbVar, PorterDuff.Mode.MULTIPLY);
        if (m43Var.y == 2) {
            paint.setColor(bm2.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(bkb.v0(bkb.F8, wjbVar));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l43.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        m43 m43Var = this.x;
        t09 t09Var = m43Var.n;
        if (m43Var.y != 1 && (t09Var == null || t09Var.getDelegate() == null || !t09Var.getDelegate().C())) {
            return;
        }
        m43Var.m.g0.invalidate();
    }

    @Override
    public final void onMeasure(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l43.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            m43 m43Var = this.x;
            if (m43Var.y != 2 && (paint = this.c) != null) {
                paint.setColor(bkb.v0(bkb.F8, m43Var.s));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
