package ci;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class h0 extends ViewOutlineProvider {
    public final int f5385a;
    public final i0 f5386b;

    public h0(i0 i0Var, int i7) {
        this.f5385a = i7;
        this.f5386b = i0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f5385a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                i0 i0Var = this.f5386b;
                outline.setRoundRect(Math.round(i0Var.f5404n - translationX), Math.round(i0Var.f5409r - translationY), Math.round(i0Var.f5411s - translationX), Math.round(i0Var.f5413w - translationY), i0Var.f5414x);
                return;
            default:
                int height = view.getHeight();
                i0 i0Var2 = this.f5386b;
                int i7 = i0Var2.f5392c0;
                outline.setRoundRect(i0Var2.f5390b0, i7, view.getWidth() - i0Var2.f5390b0, view.getHeight() - i0Var2.f5393d0, ((height - i7) - i0Var2.f5393d0) / 2.0f);
                return;
        }
    }
}
