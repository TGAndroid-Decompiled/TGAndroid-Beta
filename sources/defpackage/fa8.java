package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.ui.PhotoViewer;
public final class fa8 extends ViewOutlineProvider {
    public final byte a;
    public final float b;
    public final Object c;

    public fa8(Object obj, float f, byte b) {
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        byte b = this.a;
        float f = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                float f2 = 1.0f / f;
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), f2 * gm.L(10.0f) * ((Float) ((ValueAnimator) obj).getAnimatedValue()).floatValue());
                return;
            default:
                float f3 = 1.0f / f;
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), f3 * gm.L(10.0f) * (1.0f - ((PhotoViewer) obj).X));
                return;
        }
    }
}
