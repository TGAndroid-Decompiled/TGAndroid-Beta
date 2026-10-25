package bh;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class e0 extends ViewOutlineProvider {
    public final Rect f4023a = new Rect();
    public final RectF f4024b = new RectF();
    public final RectF f4025c = new RectF();
    public final i0 d;

    public e0(i0 i0Var) {
        this.d = i0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        i0 i0Var = this.d;
        float lerp = AndroidUtilities.lerp(i0Var.e, AndroidUtilities.dp(8.0f), i0Var.f4053j);
        RectF rectF = this.f4024b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = i0Var.f4050f;
        float f7 = i0Var.f4053j;
        RectF rectF3 = this.f4025c;
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
        Rect rect = this.f4023a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
