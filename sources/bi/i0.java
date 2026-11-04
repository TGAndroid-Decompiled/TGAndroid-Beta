package bi;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final int f3746a;
    public final j0 f3747b;

    public i0(j0 j0Var, int i3) {
        this.f3746a = i3;
        this.f3747b = j0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f3746a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                j0 j0Var = this.f3747b;
                outline.setRoundRect(Math.round(j0Var.f3765n - translationX), Math.round(j0Var.f3770r - translationY), Math.round(j0Var.f3772s - translationX), Math.round(j0Var.f3774w - translationY), j0Var.f3775x);
                return;
            default:
                int height = view.getHeight();
                j0 j0Var2 = this.f3747b;
                int i3 = j0Var2.f3753c0;
                outline.setRoundRect(j0Var2.f3751b0, i3, view.getWidth() - j0Var2.f3751b0, view.getHeight() - j0Var2.f3754d0, ((height - i3) - j0Var2.f3754d0) / 2.0f);
                return;
        }
    }
}
