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
public final class d53 extends FrameLayout implements snb {
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
    public final e53 x;

    public d53(e53 e53Var, Context context) {
        super(context);
        this.x = e53Var;
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
        Drawable mutate = context.getDrawable(2131232689).mutate();
        this.a = mutate;
        int L = hl.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i = aob.Ke;
        vnb vnbVar = e53Var.s;
        yob.x(this, mutate, i, vnbVar, PorterDuff.Mode.MULTIPLY);
        if (e53Var.y == 2) {
            paint.setColor(vm2.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(aob.v0(aob.G8, vnbVar));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d53.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        e53 e53Var = this.x;
        i49 i49Var = e53Var.n;
        if (e53Var.y != 1 && (i49Var == null || i49Var.getDelegate() == null || !i49Var.getDelegate().p())) {
            return;
        }
        e53Var.m.g0.invalidate();
    }

    @Override
    public final void onMeasure(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d53.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            e53 e53Var = this.x;
            if (e53Var.y != 2 && (paint = this.c) != null) {
                paint.setColor(aob.v0(aob.G8, e53Var.s));
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
