package ai;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class y0 extends ViewOutlineProvider {
    public final int f1980a;
    public final z0 f1981b;

    public y0(z0 z0Var, int i10) {
        this.f1980a = i10;
        this.f1981b = z0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f1980a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                z0 z0Var = this.f1981b;
                outline.setRoundRect(Math.round(z0Var.f2002n - translationX), Math.round(z0Var.f2007r - translationY), Math.round(z0Var.f2009s - translationX), Math.round(z0Var.v - translationY), z0Var.f2010w);
                return;
            default:
                int height = view.getHeight();
                z0 z0Var2 = this.f1981b;
                int i10 = z0Var2.f1989b0;
                outline.setRoundRect(z0Var2.f1987a0, i10, view.getWidth() - z0Var2.f1987a0, view.getHeight() - z0Var2.f1991c0, ((height - i10) - z0Var2.f1991c0) / 2.0f);
                return;
        }
    }
}
