package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
public final class w8 extends qo4 {
    public final byte s = 1;
    public final View w;

    public w8(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.w = actionMenuItemView;
    }

    @Override
    public final xia b() {
        y8 y8Var;
        byte b = this.s;
        View view = this.w;
        switch (b) {
            case 0:
                x8 x8Var = ((ActionMenuItemView) view).y;
                if (x8Var == null || (y8Var = ((z8) x8Var).a.K) == null) {
                    return null;
                }
                return y8Var.a();
            default:
                y8 y8Var2 = ((a9) view).d.J;
                if (y8Var2 == null) {
                    return null;
                }
                return y8Var2.a();
        }
    }

    @Override
    public final boolean c() {
        xia b;
        byte b2 = this.s;
        View view = this.w;
        switch (b2) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                x17 x17Var = actionMenuItemView.w;
                if (x17Var != null && x17Var.a(actionMenuItemView.n) && (b = b()) != null && b.a()) {
                    return true;
                }
                return false;
            default:
                ((a9) view).d.l();
                return true;
        }
    }

    @Override
    public final boolean d() {
        switch (this.s) {
            case 1:
                b9 b9Var = ((a9) this.w).d;
                if (b9Var.L != null) {
                    return false;
                }
                b9Var.e();
                return true;
            default:
                return super.d();
        }
    }

    public w8(a9 a9Var, a9 a9Var2) {
        super(a9Var2);
        this.w = a9Var;
    }
}
