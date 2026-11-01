package jg;

import android.view.View;
import org.telegram.ui.ActionBar.v5;
public final class u1 implements Runnable {
    public final int f10294a;
    public final View f10295b;

    public u1(int i10, View view) {
        this.f10294a = i10;
        this.f10295b = view;
    }

    @Override
    public final void run() {
        switch (this.f10294a) {
            case 0:
                this.f10295b.performClick();
                return;
            default:
                View view = this.f10295b;
                if (view instanceof v5) {
                    v5 v5Var = (v5) view;
                    if (!v5Var.f21412a) {
                        v5Var.f21412a = true;
                        v5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
