package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class dda extends ViewOutlineProvider {
    @Override
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), gl.L(16.0f));
    }
}
