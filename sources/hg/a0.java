package hg;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class a0 extends ViewOutlineProvider {
    public final Rect f10529a = new Rect();
    public final RectF f10530b = new RectF();
    public final RectF f10531c = new RectF();
    public final e0 d;

    public a0(e0 e0Var) {
        this.d = e0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        e0 e0Var = this.d;
        float lerp = AndroidUtilities.lerp(e0Var.f10577e, AndroidUtilities.dp(8.0f), e0Var.f10581j);
        RectF rectF = this.f10530b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = e0Var.f10578f;
        float f10 = e0Var.f10581j;
        RectF rectF3 = this.f10531c;
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF3);
        Rect rect = this.f10529a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
