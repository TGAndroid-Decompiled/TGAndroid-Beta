package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ja8 implements h07 {
    public int E;
    public int G;
    public int H;
    public Runnable I;
    public Runnable J;
    public be2 K;
    public final Activity a;
    public final View b;
    public final ia8 c;
    public final zha d;
    public final kl0 e;
    public final jx4 f;
    public final al0 h;
    public final wp1 n;
    public final wjb r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public boolean w;
    public boolean y;
    public boolean x = true;
    public int F = -1;

    public ja8(Activity activity, View view, ia8 ia8Var, zha zhaVar, kl0 kl0Var, jx4 jx4Var, al0 al0Var, wp1 wp1Var, wjb wjbVar) {
        this.a = activity;
        this.b = view;
        this.c = ia8Var;
        this.d = zhaVar;
        this.e = kl0Var;
        this.f = jx4Var;
        this.h = al0Var;
        this.n = wp1Var;
        this.r = wjbVar;
        this.s = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232570, 1, wjbVar, activity);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void b(zha zhaVar, r7 r7Var) {
        boolean z;
        if (zhaVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.w = z;
        this.c.s1(z);
    }

    @Override
    public final boolean c(r7 r7Var, RectF rectF) {
        this.c.J1(rectF);
        if (this.x) {
            rectF.bottom += gl.L(6.0f);
            return true;
        }
        rectF.top -= gl.L(6.0f);
        return true;
    }

    public final void d(FrameLayout frameLayout, int i, Runnable runnable) {
        frameLayout.setBackground(bkb.f0(bkb.p1(0.12f, bkb.v0(bkb.D8, this.r)), 2, -1));
        frameLayout.setMinimumWidth(gl.L(220.0f));
        frameLayout.setOnClickListener(new ha8(this, runnable, (byte) 0));
        this.s.a(frameLayout, nme.o(-1, i));
        this.G = gl.L(i) + this.G;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean g() {
        return this.x;
    }

    @Override
    public final int getButtonsGlassBackgroundColor() {
        return this.n.t1();
    }

    @Override
    public final al0 getButtonsGlassColorProvider() {
        return this.n;
    }

    @Override
    public final int getMenuAnchorTint() {
        return 0;
    }

    @Override
    public final int getMenuDimAlpha() {
        return 51;
    }

    @Override
    public final int getMenuExtraBelow() {
        return this.E;
    }

    @Override
    public final al0 getMenuGlassColorProvider() {
        return this.h;
    }

    @Override
    public final View getMenuHostView() {
        return this.c.w2();
    }

    @Override
    public final int getMenuMaxHeight() {
        return this.H;
    }

    @Override
    public final wjb getMenuResourcesProvider() {
        return this.r;
    }

    @Override
    public final int getMenuRise() {
        return 0;
    }

    @Override
    public final View getMenuView() {
        return this.b;
    }

    @Override
    public final zha getOpenMenuOverlay() {
        if (this.w) {
            return this.d;
        }
        return null;
    }

    @Override
    public final il0 h(zha zhaVar) {
        il0 c = this.e.c(zhaVar, null, false);
        c.p(this.h);
        ug8.r(c, gl.L(22.0f), 6.0f);
        return c;
    }

    public final void i() {
        boolean z;
        zha zhaVar = this.d;
        if (zhaVar.d == this && zhaVar.e == null && (zhaVar.I || zhaVar.U)) {
            return;
        }
        RectF rectF = new RectF();
        ia8 ia8Var = this.c;
        ia8Var.J1(rectF);
        jjc w2 = ia8Var.w2();
        int[] iArr = new int[2];
        w2.getLocationInWindow(iArr);
        Rect rect = new Rect();
        w2.getWindowVisibleDisplayFrame(rect);
        float L = gl.L(24.0f) + this.G;
        int i = this.H;
        if (i > 0) {
            L = Math.min(L, i);
        }
        int i2 = this.F;
        int i3 = rect.bottom;
        if (i2 > 0) {
            i3 = Math.min(i3, i2);
        }
        float f = iArr[1];
        float f2 = i3 - (rectF.bottom + f);
        float f3 = (f + rectF.top) - rect.top;
        int i4 = 0;
        if (f2 < L && f2 <= f3) {
            z = true;
        } else {
            z = false;
        }
        this.x = z;
        if (z && f3 < L) {
            i4 = (int) Math.max(0.0f, Math.min(f2 - gl.L(8.0f), L - f3));
        }
        this.E = i4;
        this.I = null;
        zhaVar.setOnClosed(new ga8(this, (byte) 1));
        zhaVar.d(this, null, this.s);
    }

    @Override
    public final void setMenuGlassFrostedProgress(float f) {
        jx4 jx4Var = this.f;
        if (jx4Var != null) {
            jx4Var.k(f);
        }
        be2 be2Var = this.K;
        if (be2Var != null) {
            ((jjc) be2Var.b).setEditMenuProgress(f);
        }
        if (f > 0.9f) {
            this.y = true;
        }
        if (this.y && f < 0.06f) {
            zha zhaVar = this.d;
            if (!zhaVar.I && this.w) {
                this.y = false;
                zhaVar.post(new ga8(this, (byte) 0));
            }
        }
    }
}
