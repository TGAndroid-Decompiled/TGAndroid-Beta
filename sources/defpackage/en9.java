package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class en9 extends ViewOutlineProvider {
    public final on9 a;

    public en9(on9 on9Var) {
        this.a = on9Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (1.0f - this.a.U) * gl.L(12.0f));
    }
}
