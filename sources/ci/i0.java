package ci;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final int f5663a;
    public final j0 f5664b;

    public i0(j0 j0Var, int i7) {
        this.f5663a = i7;
        this.f5664b = j0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f5663a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                j0 j0Var = this.f5664b;
                outline.setRoundRect(Math.round(j0Var.f5682n - translationX), Math.round(j0Var.f5687r - translationY), Math.round(j0Var.f5689s - translationX), Math.round(j0Var.f5691w - translationY), j0Var.f5692x);
                return;
            default:
                int height = view.getHeight();
                j0 j0Var2 = this.f5664b;
                int i7 = j0Var2.f5670c0;
                outline.setRoundRect(j0Var2.f5668b0, i7, view.getWidth() - j0Var2.f5668b0, view.getHeight() - j0Var2.f5671d0, ((height - i7) - j0Var2.f5671d0) / 2.0f);
                return;
        }
    }
}
