package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class gf5 extends ViewOutlineProvider {
    @Override
    public final void getOutline(View view, Outline outline) {
        float L = gm.L(12.0f);
        outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + L), L);
    }
}
