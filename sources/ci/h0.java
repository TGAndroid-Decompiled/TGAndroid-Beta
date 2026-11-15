package ci;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class h0 extends ViewOutlineProvider {
    public final int f5382a;
    public final i0 f5383b;

    public h0(i0 i0Var, int i7) {
        this.f5382a = i7;
        this.f5383b = i0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f5382a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                i0 i0Var = this.f5383b;
                outline.setRoundRect(Math.round(i0Var.f5401n - translationX), Math.round(i0Var.f5406r - translationY), Math.round(i0Var.f5408s - translationX), Math.round(i0Var.f5410w - translationY), i0Var.f5411x);
                return;
            default:
                int height = view.getHeight();
                i0 i0Var2 = this.f5383b;
                int i7 = i0Var2.f5389c0;
                outline.setRoundRect(i0Var2.f5387b0, i7, view.getWidth() - i0Var2.f5387b0, view.getHeight() - i0Var2.f5390d0, ((height - i7) - i0Var2.f5390d0) / 2.0f);
                return;
        }
    }
}
