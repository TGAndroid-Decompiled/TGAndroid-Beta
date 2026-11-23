package ci;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final int f5700a;
    public final j0 f5701b;

    public i0(j0 j0Var, int i7) {
        this.f5700a = i7;
        this.f5701b = j0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f5700a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                j0 j0Var = this.f5701b;
                outline.setRoundRect(Math.round(j0Var.f5719n - translationX), Math.round(j0Var.f5724r - translationY), Math.round(j0Var.f5726s - translationX), Math.round(j0Var.f5728w - translationY), j0Var.f5729x);
                return;
            default:
                int height = view.getHeight();
                j0 j0Var2 = this.f5701b;
                int i7 = j0Var2.f5707c0;
                outline.setRoundRect(j0Var2.f5705b0, i7, view.getWidth() - j0Var2.f5705b0, view.getHeight() - j0Var2.f5708d0, ((height - i7) - j0Var2.f5708d0) / 2.0f);
                return;
        }
    }
}
