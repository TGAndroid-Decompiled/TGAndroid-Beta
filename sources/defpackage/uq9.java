package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class uq9 extends ViewOutlineProvider {
    public final er9 a;

    public uq9(er9 er9Var) {
        this.a = er9Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (1.0f - this.a.U) * hl.L(12.0f));
    }
}
