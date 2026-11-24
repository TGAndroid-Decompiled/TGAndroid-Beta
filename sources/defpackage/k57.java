package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class k57 extends View implements vlb {
    public final ho a;
    public final ylb b;
    public final g57 c;
    public boolean d;
    public boolean e;
    public final String f;
    public final String h;
    public final int n;

    public k57(Context context, int i, String str, int i2, String str2, ylb ylbVar) {
        super(context);
        this.d = true;
        this.f = str;
        this.h = str2;
        this.b = ylbVar;
        int i3 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i3, ylbVar), 2, -1);
        wmb M = anb.M(i3);
        setBackground(f0);
        anb.j(this, f0, null, M, ylbVar);
        ho hoVar = new ho(true, true, true);
        this.a = hoVar;
        hoVar.n(0.35f, 300L, d53.h);
        hoVar.w(gm.L(16.0f));
        hoVar.u(cmb.v0(cmb.D8, ylbVar));
        hoVar.setCallback(this);
        hoVar.q(!jb6.a0);
        if (jb6.a0) {
            hoVar.b = 5;
        }
        TextPaint textPaint = hoVar.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + gm.L(77.0f));
        this.n = max;
        hoVar.N = max;
        g57 g57Var = new g57((byte) 0);
        p09 p09Var = new p09(i, gm.L(24.0f), gm.L(24.0f));
        g57Var.c = p09Var;
        p09Var.M(this);
        p09Var.E(true);
        p09Var.h = true;
        p09Var.F(0);
        p09 p09Var2 = new p09(i2, gm.L(24.0f), gm.L(24.0f));
        g57Var.d = p09Var2;
        p09Var2.M(this);
        p09Var2.E(true);
        p09Var2.h = true;
        p09Var2.F(0);
        g57Var.e = p09Var;
        this.c = g57Var;
        anb.x(this, g57Var, cmb.E8, ylbVar, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z, boolean z2) {
        String str;
        boolean z3;
        p09 p09Var;
        if (!this.d && z == this.e) {
            return;
        }
        this.e = z;
        if (z) {
            str = this.f;
        } else {
            str = this.h;
        }
        if (z2 && !jb6.a0) {
            z3 = true;
        } else {
            z3 = false;
        }
        ho hoVar = this.a;
        hoVar.t(str, z3, true);
        g57 g57Var = this.c;
        p09 p09Var2 = (p09) g57Var.d;
        p09 p09Var3 = (p09) g57Var.c;
        g57Var.b = z;
        if (z2) {
            if (z) {
                p09Var = p09Var3;
            } else {
                p09Var = p09Var2;
            }
            g57Var.e = p09Var;
            p09Var3.H(0);
            p09Var2.H(0);
            ((p09) g57Var.e).start();
        } else {
            if (z) {
                p09Var2 = p09Var3;
            }
            g57Var.e = p09Var2;
            p09Var2.H(p09Var2.e[0] - 1);
        }
        this.d = false;
        setContentDescription(hoVar.i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.D8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z = jb6.a0;
        ho hoVar = this.a;
        g57 g57Var = this.c;
        if (z) {
            g57Var.setBounds(getMeasuredWidth() - gm.L(41.0f), wi8.D(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - gm.L(17.0f), (gm.L(24.0f) + getMeasuredHeight()) / 2);
            hoVar.setBounds(0, 0, getMeasuredWidth() - gm.L(59.0f), getMeasuredHeight());
        } else {
            g57Var.setBounds(gm.L(17.0f), wi8.D(24.0f, getMeasuredHeight(), 2), gm.L(41.0f), (gm.L(24.0f) + getMeasuredHeight()) / 2);
            hoVar.setBounds(gm.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        hoVar.draw(canvas);
        g57Var.draw(canvas);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, mode), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
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
            ho hoVar = this.a;
            if (hoVar != null) {
                hoVar.u(cmb.v0(cmb.D8, this.b));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
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
