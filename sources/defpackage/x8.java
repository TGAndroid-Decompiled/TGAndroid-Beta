package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
public final class x8 extends uo4 {
    public final byte s = 0;
    public final View w;

    public x8(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.w = actionMenuItemView;
    }

    @Override
    public final oka b() {
        z8 z8Var;
        byte b = this.s;
        View view = this.w;
        switch (b) {
            case 0:
                y8 y8Var = ((ActionMenuItemView) view).y;
                if (y8Var == null || (z8Var = ((a9) y8Var).a.K) == null) {
                    return null;
                }
                return z8Var.a();
            default:
                z8 z8Var2 = ((b9) view).d.J;
                if (z8Var2 == null) {
                    return null;
                }
                return z8Var2.a();
        }
    }

    @Override
    public final boolean c() {
        oka b;
        byte b2 = this.s;
        View view = this.w;
        switch (b2) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                e27 e27Var = actionMenuItemView.w;
                if (e27Var != null && e27Var.a(actionMenuItemView.n) && (b = b()) != null && b.a()) {
                    return true;
                }
                return false;
            default:
                ((b9) view).d.l();
                return true;
        }
    }

    @Override
    public final boolean d() {
        switch (this.s) {
            case 1:
                c9 c9Var = ((b9) this.w).d;
                if (c9Var.L != null) {
                    return false;
                }
                c9Var.d();
                return true;
            default:
                return super.d();
        }
    }

    public x8(b9 b9Var, b9 b9Var2) {
        super(b9Var2);
        this.w = b9Var;
    }
}
