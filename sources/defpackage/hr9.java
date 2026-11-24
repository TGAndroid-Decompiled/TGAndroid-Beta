package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class hr9 extends fm {
    public final lm d;
    public final int e;
    public final ScrollSlidingTextTabStrip f;

    public hr9(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i) {
        super(context);
        this.f = scrollSlidingTextTabStrip;
        this.e = i;
        this.d = new lm(360L, this, s33.h);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(this.f.o0);
        int i = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (gl.R1(1.0f, 0.5f, d) * 255.0f));
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
        if (i > 0) {
            canvas2.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f.r == this.e) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setSelected(z);
    }
}
