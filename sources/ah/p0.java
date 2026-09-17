package ah;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class p0 extends ViewOutlineProvider {
    public final Rect f655a = new Rect();
    public final RectF f656b = new RectF();
    public final RectF f657c = new RectF();
    public final u0 d;

    public p0(u0 u0Var) {
        this.d = u0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        u0 u0Var = this.d;
        float lerp = AndroidUtilities.lerp(u0Var.f688e, AndroidUtilities.dp(8.0f), u0Var.f692j);
        RectF rectF = this.f656b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = u0Var.f689f;
        float f7 = u0Var.f692j;
        RectF rectF3 = this.f657c;
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
        Rect rect = this.f655a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
