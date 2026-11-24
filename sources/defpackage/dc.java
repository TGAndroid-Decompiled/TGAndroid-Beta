package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class dc implements h27 {
    public final int a;
    public final View b;
    public final bka c;
    public final ylb d;
    public final sm2 e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public boolean h;
    public Drawable n;
    public final int[] r = new int[2];
    public int s = Integer.MIN_VALUE;
    public final cc w = new cc(this, (byte) 0);
    public ViewTreeObserver x;

    public dc(int i, View view, sm2 sm2Var, ylb ylbVar) {
        this.a = i;
        this.b = view;
        this.e = sm2Var;
        this.c = (bka) sm2Var.b;
        this.d = ylbVar;
        this.f = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 4, ylbVar, view.getContext());
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void b(bka bkaVar, r7 r7Var) {
        boolean z;
        float f;
        boolean z2;
        boolean z3 = this.h;
        if (bkaVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        View view = this.b;
        view.setAlpha(f);
        ad adVar = (ad) this;
        int i = tc.h;
        if (cmb.p1(0.06f, cmb.v0(cmb.Ke, adVar.d)) != 0 && (z2 = this.h) != z3) {
            if (z2) {
                this.n = view.getBackground();
                view.setBackground(null);
            } else {
                Drawable drawable = this.n;
                if (drawable != null) {
                    view.setBackground(drawable);
                    this.n = null;
                }
            }
        }
        ViewTreeObserver viewTreeObserver = this.x;
        cc ccVar = this.w;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.x.removeOnPreDrawListener(ccVar);
            }
            this.x = null;
        }
        if (this.h) {
            int[] iArr = this.r;
            view.getLocationInWindow(iArr);
            this.s = iArr[1];
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.x = viewTreeObserver2;
            viewTreeObserver2.addOnPreDrawListener(ccVar);
        }
        if (!this.h) {
            wc wcVar = adVar.E;
            if (wcVar.a.isFocused()) {
                gm.t1(wcVar.a);
            }
            wcVar.a.clearFocus();
        }
    }

    @Override
    public final boolean c(r7 r7Var, RectF rectF) {
        View view = this.b;
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        return true;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final int getButtonsGlassBackgroundColor() {
        return ((jr1) this.e.f).K1();
    }

    @Override
    public final am0 getButtonsGlassColorProvider() {
        return (jr1) this.e.f;
    }

    @Override
    public final int getMenuExtraBelow() {
        return 0;
    }

    @Override
    public final am0 getMenuGlassColorProvider() {
        return (am0) this.e.e;
    }

    @Override
    public final View getMenuHostView() {
        return this.b;
    }

    @Override
    public final int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public final ylb getMenuResourcesProvider() {
        return this.d;
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
    public final bka getOpenMenuOverlay() {
        if (this.h) {
            return this.c;
        }
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final im0 i(bka bkaVar) {
        sm2 sm2Var = this.e;
        im0 c = ((km0) sm2Var.c).c(bkaVar, null, false);
        c.p((am0) sm2Var.e);
        wi8.r(c, gm.L(22.0f), 6.0f);
        return c;
    }

    @Override
    public final void setMenuGlassFrostedProgress(float f) {
        lz4 lz4Var = (lz4) this.e.d;
        if (lz4Var != null) {
            lz4Var.k(f);
        }
    }
}
