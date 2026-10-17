package ah;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class o0 extends ViewOutlineProvider {
    public final Rect f841a = new Rect();
    public final RectF f842b = new RectF();
    public final RectF f843c = new RectF();
    public final t0 d;

    public o0(t0 t0Var) {
        this.d = t0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        t0 t0Var = this.d;
        float lerp = AndroidUtilities.lerp(t0Var.e, AndroidUtilities.dp(8.0f), t0Var.f876j);
        RectF rectF = this.f842b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = t0Var.f873f;
        float f7 = t0Var.f876j;
        RectF rectF3 = this.f843c;
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
        Rect rect = this.f841a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
