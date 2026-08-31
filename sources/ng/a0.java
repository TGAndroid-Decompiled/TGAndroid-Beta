package ng;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class a0 extends ViewOutlineProvider {
    public final Rect f15993a = new Rect();
    public final RectF f15994b = new RectF();
    public final RectF f15995c = new RectF();
    public final d0 d;

    public a0(d0 d0Var) {
        this.d = d0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        d0 d0Var = this.d;
        float lerp = AndroidUtilities.lerp(d0Var.f16036e, AndroidUtilities.dp(8.0f), d0Var.f16040j);
        RectF rectF = this.f15994b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = d0Var.f16037f;
        float f10 = d0Var.f16040j;
        RectF rectF3 = this.f15995c;
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF3);
        Rect rect = this.f15993a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
