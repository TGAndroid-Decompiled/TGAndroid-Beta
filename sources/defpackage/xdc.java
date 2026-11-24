package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class xdc extends ViewOutlineProvider {
    public final int a;
    public final float b;

    public xdc(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int i = this.a;
        float f = this.b;
        int i2 = this.a;
        outline.setRoundRect(i2, i2, width - i, view.getHeight() - i, f);
    }
}
