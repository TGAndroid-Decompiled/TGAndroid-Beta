package ci;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final int f5668a;
    public final j0 f5669b;

    public i0(j0 j0Var, int i7) {
        this.f5668a = i7;
        this.f5669b = j0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f5668a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                j0 j0Var = this.f5669b;
                outline.setRoundRect(Math.round(j0Var.f5687n - translationX), Math.round(j0Var.f5692r - translationY), Math.round(j0Var.f5694s - translationX), Math.round(j0Var.f5696w - translationY), j0Var.f5697x);
                return;
            default:
                int height = view.getHeight();
                j0 j0Var2 = this.f5669b;
                int i7 = j0Var2.f5675c0;
                outline.setRoundRect(j0Var2.f5673b0, i7, view.getWidth() - j0Var2.f5673b0, view.getHeight() - j0Var2.f5676d0, ((height - i7) - j0Var2.f5676d0) / 2.0f);
                return;
        }
    }
}
