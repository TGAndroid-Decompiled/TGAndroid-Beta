package defpackage;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ez4 implements o27 {
    public final eg0 a;
    public final ol0 b;
    public final vnb c;
    public final int d;
    public FrameLayout e;
    public View f;
    public ula h;
    public boolean n;
    public boolean r;

    public ez4(eg0 eg0Var, ol0 ol0Var, vnb vnbVar, int i) {
        this.a = eg0Var;
        this.b = ol0Var;
        this.c = vnbVar;
        this.d = i;
    }

    @Override
    public final boolean a() {
        return this.n;
    }

    @Override
    public final void b(ula ulaVar, s7 s7Var) {
        boolean z;
        int i = 0;
        if (ulaVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.r = z;
        FrameLayout frameLayout = this.e;
        if (z) {
            i = 4;
        }
        frameLayout.setVisibility(i);
    }

    @Override
    public final boolean c(s7 s7Var, RectF rectF) {
        int i = this.d;
        rectF.set(i, i, this.e.getWidth() - i, this.e.getHeight() - i);
        return true;
    }

    @Override
    public final boolean d() {
        return true;
    }

    public final boolean e(FrameLayout frameLayout, View view, boolean z, ula ulaVar, fu5 fu5Var) {
        FrameLayout frameLayout2;
        if (ulaVar == null || ulaVar.I || !frameLayout.isAttachedToWindow() || frameLayout.getWidth() <= 0 || !(fu5Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            return false;
        }
        if (this.r && (frameLayout2 = this.e) != null && frameLayout2 != frameLayout) {
            frameLayout2.setVisibility(0);
        }
        this.e = frameLayout;
        this.f = view;
        this.n = z;
        this.h = ulaVar;
        fu5Var.p = new cx0(ulaVar, (byte) 1);
        ulaVar.e(this, null, (ActionBarPopupWindow$ActionBarPopupWindowLayout) fu5Var.A);
        return true;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final int getButtonsGlassBackgroundColor() {
        ol0 ol0Var = this.b;
        return ol0Var.a(ol0Var.e);
    }

    @Override
    public final bl0 getButtonsGlassColorProvider() {
        return this.b;
    }

    @Override
    public final int getMenuAnchorTint() {
        return 0;
    }

    @Override
    public final int getMenuDimAlpha() {
        return -1;
    }

    @Override
    public final int getMenuExtraBelow() {
        return 0;
    }

    @Override
    public final bl0 getMenuGlassColorProvider() {
        return this.b;
    }

    @Override
    public final View getMenuHostView() {
        return this.e;
    }

    @Override
    public final int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public final vnb getMenuResourcesProvider() {
        return this.c;
    }

    @Override
    public final int getMenuRise() {
        return hl.L(8.0f);
    }

    @Override
    public final View getMenuView() {
        return this.f;
    }

    @Override
    public final ula getOpenMenuOverlay() {
        if (this.r) {
            return this.h;
        }
        return null;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final jl0 i(ula ulaVar) {
        jl0 c = this.a.d.c(ulaVar, null, false);
        c.p(this.b);
        ik8.r(c, hl.L(23.0f), 6.0f);
        return c;
    }

    @Override
    public final void setMenuGlassFrostedProgress(float f) {
        pz4 pz4Var = this.a.e;
        if (pz4Var != null) {
            pz4Var.k(f);
        }
    }
}
