package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class qz8 extends ViewOutlineProvider {
    public final byte a;
    public final rz8 b;

    public qz8(rz8 rz8Var, byte b) {
        this.a = b;
        this.b = rz8Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        byte b = this.a;
        rz8 rz8Var = this.b;
        switch (b) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                outline.setRoundRect(Math.round(rz8Var.n - translationX), Math.round(rz8Var.r - translationY), Math.round(rz8Var.s - translationX), Math.round(rz8Var.w - translationY), rz8Var.x);
                return;
            default:
                int height = view.getHeight();
                int i = rz8Var.c0;
                outline.setRoundRect(rz8Var.b0, i, view.getWidth() - rz8Var.b0, view.getHeight() - rz8Var.d0, ((height - i) - rz8Var.d0) / 2.0f);
                return;
        }
    }
}
