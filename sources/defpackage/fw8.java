package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class fw8 extends ViewOutlineProvider {
    public final byte a;
    public final gw8 b;

    public fw8(gw8 gw8Var, byte b) {
        this.a = b;
        this.b = gw8Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        byte b = this.a;
        gw8 gw8Var = this.b;
        switch (b) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                outline.setRoundRect(Math.round(gw8Var.n - translationX), Math.round(gw8Var.r - translationY), Math.round(gw8Var.s - translationX), Math.round(gw8Var.w - translationY), gw8Var.x);
                return;
            default:
                int height = view.getHeight();
                int i = gw8Var.c0;
                outline.setRoundRect(gw8Var.b0, i, view.getWidth() - gw8Var.b0, view.getHeight() - gw8Var.d0, ((height - i) - gw8Var.d0) / 2.0f);
                return;
        }
    }
}
