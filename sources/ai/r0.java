package ai;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class r0 extends ViewOutlineProvider {
    public final int f1608a;
    public final s0 f1609b;

    public r0(s0 s0Var, int i7) {
        this.f1608a = i7;
        this.f1609b = s0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f1608a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                s0 s0Var = this.f1609b;
                outline.setRoundRect(Math.round(s0Var.f1630n - translationX), Math.round(s0Var.f1635r - translationY), Math.round(s0Var.f1637s - translationX), Math.round(s0Var.f1638w - translationY), s0Var.f1639x);
                return;
            default:
                int height = view.getHeight();
                s0 s0Var2 = this.f1609b;
                int i7 = s0Var2.f1616b0;
                outline.setRoundRect(s0Var2.f1614a0, i7, view.getWidth() - s0Var2.f1614a0, view.getHeight() - s0Var2.f1618c0, ((height - i7) - s0Var2.f1618c0) / 2.0f);
                return;
        }
    }
}
