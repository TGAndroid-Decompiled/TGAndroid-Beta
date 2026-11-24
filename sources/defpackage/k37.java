package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class k37 extends View implements tjb {
    public final gn a;
    public final wjb b;
    public final g37 c;
    public boolean d;
    public boolean e;
    public final String f;
    public final String h;
    public final int n;

    public k37(Context context, int i, String str, int i2, String str2, wjb wjbVar) {
        super(context);
        this.d = true;
        this.f = str;
        this.h = str2;
        this.b = wjbVar;
        int i3 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i3, wjbVar), 2, -1);
        vkb M = zkb.M(i3);
        setBackground(f0);
        zkb.j(this, f0, null, M, wjbVar);
        gn gnVar = new gn(true, true, true);
        this.a = gnVar;
        gnVar.n(0.35f, 300L, s33.h);
        gnVar.w(gl.L(16.0f));
        gnVar.u(bkb.v0(bkb.D8, wjbVar));
        gnVar.setCallback(this);
        gnVar.q(!k96.a0);
        if (k96.a0) {
            gnVar.b = 5;
        }
        TextPaint textPaint = gnVar.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + gl.L(77.0f));
        this.n = max;
        gnVar.N = max;
        g37 g37Var = new g37((byte) 0);
        oy8 oy8Var = new oy8(i, gl.L(24.0f), gl.L(24.0f));
        g37Var.c = oy8Var;
        oy8Var.M(this);
        oy8Var.E(true);
        oy8Var.h = true;
        oy8Var.F(0);
        oy8 oy8Var2 = new oy8(i2, gl.L(24.0f), gl.L(24.0f));
        g37Var.d = oy8Var2;
        oy8Var2.M(this);
        oy8Var2.E(true);
        oy8Var2.h = true;
        oy8Var2.F(0);
        g37Var.e = oy8Var;
        this.c = g37Var;
        zkb.x(this, g37Var, bkb.E8, wjbVar, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z, boolean z2) {
        String str;
        boolean z3;
        oy8 oy8Var;
        if (!this.d && z == this.e) {
            return;
        }
        this.e = z;
        if (z) {
            str = this.f;
        } else {
            str = this.h;
        }
        if (z2 && !k96.a0) {
            z3 = true;
        } else {
            z3 = false;
        }
        gn gnVar = this.a;
        gnVar.t(str, z3, true);
        g37 g37Var = this.c;
        oy8 oy8Var2 = (oy8) g37Var.d;
        oy8 oy8Var3 = (oy8) g37Var.c;
        g37Var.b = z;
        if (z2) {
            if (z) {
                oy8Var = oy8Var3;
            } else {
                oy8Var = oy8Var2;
            }
            g37Var.e = oy8Var;
            oy8Var3.H(0);
            oy8Var2.H(0);
            ((oy8) g37Var.e).start();
        } else {
            if (z) {
                oy8Var2 = oy8Var3;
            }
            g37Var.e = oy8Var2;
            oy8Var2.H(oy8Var2.e[0] - 1);
        }
        this.d = false;
        setContentDescription(gnVar.i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.D8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z = k96.a0;
        gn gnVar = this.a;
        g37 g37Var = this.c;
        if (z) {
            g37Var.setBounds(getMeasuredWidth() - gl.L(41.0f), ug8.D(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - gl.L(17.0f), (gl.L(24.0f) + getMeasuredHeight()) / 2);
            gnVar.setBounds(0, 0, getMeasuredWidth() - gl.L(59.0f), getMeasuredHeight());
        } else {
            g37Var.setBounds(gl.L(17.0f), ug8.D(24.0f, getMeasuredHeight(), 2), gl.L(41.0f), (gl.L(24.0f) + getMeasuredHeight()) / 2);
            gnVar.setBounds(gl.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        gnVar.draw(canvas);
        g37Var.draw(canvas);
    }

    public boolean getState() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int min;
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.n;
        if (mode == 1073741824) {
            min = Math.max(View.MeasureSpec.getSize(i), i3);
        } else {
            min = Math.min(View.MeasureSpec.getSize(i), i3);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, mode), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() == 0 && getAlpha() >= 0.5f) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            gn gnVar = this.a;
            if (gnVar != null) {
                gnVar.u(bkb.v0(bkb.D8, this.b));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
