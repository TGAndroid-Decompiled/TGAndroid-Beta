package ci;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final int f5697a;
    public final j0 f5698b;

    public i0(j0 j0Var, int i7) {
        this.f5697a = i7;
        this.f5698b = j0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f5697a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                j0 j0Var = this.f5698b;
                outline.setRoundRect(Math.round(j0Var.f5716n - translationX), Math.round(j0Var.f5721r - translationY), Math.round(j0Var.f5723s - translationX), Math.round(j0Var.f5725w - translationY), j0Var.f5726x);
                return;
            default:
                int height = view.getHeight();
                j0 j0Var2 = this.f5698b;
                int i7 = j0Var2.f5704c0;
                outline.setRoundRect(j0Var2.f5702b0, i7, view.getWidth() - j0Var2.f5702b0, view.getHeight() - j0Var2.f5705d0, ((height - i7) - j0Var2.f5705d0) / 2.0f);
                return;
        }
    }
}
