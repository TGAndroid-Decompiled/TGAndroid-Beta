package ci;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final int f5671a;
    public final j0 f5672b;

    public i0(j0 j0Var, int i7) {
        this.f5671a = i7;
        this.f5672b = j0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f5671a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                j0 j0Var = this.f5672b;
                outline.setRoundRect(Math.round(j0Var.f5690n - translationX), Math.round(j0Var.f5695r - translationY), Math.round(j0Var.f5697s - translationX), Math.round(j0Var.f5699w - translationY), j0Var.f5700x);
                return;
            default:
                int height = view.getHeight();
                j0 j0Var2 = this.f5672b;
                int i7 = j0Var2.f5678c0;
                outline.setRoundRect(j0Var2.f5676b0, i7, view.getWidth() - j0Var2.f5676b0, view.getHeight() - j0Var2.f5679d0, ((height - i7) - j0Var2.f5679d0) / 2.0f);
                return;
        }
    }
}
