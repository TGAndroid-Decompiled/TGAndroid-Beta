package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class wda extends ViewOutlineProvider {
    @Override
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), gl.L(24.0f) + view.getHeight(), gl.L(24.0f));
    }
}
