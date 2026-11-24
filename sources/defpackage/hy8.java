package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class hy8 extends ViewOutlineProvider {
    public final byte a;
    public final iy8 b;

    public hy8(iy8 iy8Var, byte b) {
        this.a = b;
        this.b = iy8Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        byte b = this.a;
        iy8 iy8Var = this.b;
        switch (b) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                outline.setRoundRect(Math.round(iy8Var.n - translationX), Math.round(iy8Var.r - translationY), Math.round(iy8Var.s - translationX), Math.round(iy8Var.w - translationY), iy8Var.x);
                return;
            default:
                int height = view.getHeight();
                int i = iy8Var.c0;
                outline.setRoundRect(iy8Var.b0, i, view.getWidth() - iy8Var.b0, view.getHeight() - iy8Var.d0, ((height - i) - iy8Var.d0) / 2.0f);
                return;
        }
    }
}
