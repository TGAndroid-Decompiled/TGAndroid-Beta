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
public final class w53 extends FrameLayout implements vlb {
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
    public final x53 x;

    public w53(x53 x53Var, Context context) {
        super(context);
        this.x = x53Var;
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
        Drawable mutate = context.getDrawable(2131232690).mutate();
        this.a = mutate;
        int L = gm.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i = cmb.Je;
        ylb ylbVar = x53Var.s;
        anb.x(this, mutate, i, ylbVar, PorterDuff.Mode.MULTIPLY);
        if (x53Var.y == 2) {
            paint.setColor(on2.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(cmb.v0(cmb.F8, ylbVar));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w53.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        x53 x53Var = this.x;
        v29 v29Var = x53Var.n;
        if (x53Var.y != 1 && (v29Var == null || v29Var.getDelegate() == null || !v29Var.getDelegate().s())) {
            return;
        }
        x53Var.m.g0.invalidate();
    }

    @Override
    public final void onMeasure(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w53.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            x53 x53Var = this.x;
            if (x53Var.y != 2 && (paint = this.c) != null) {
                paint.setColor(cmb.v0(cmb.F8, x53Var.s));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
