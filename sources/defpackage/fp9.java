package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class fp9 extends ViewOutlineProvider {
    public final pp9 a;

    public fp9(pp9 pp9Var) {
        this.a = pp9Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (1.0f - this.a.U) * gm.L(12.0f));
    }
}
