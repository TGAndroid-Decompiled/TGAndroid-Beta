package ig;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

public final class a0 extends ViewOutlineProvider {

    public final Rect f11228a = new Rect();

    public final RectF f11229b = new RectF();

    public final RectF f11230c = new RectF();
    public final d0 d;

    public a0(d0 d0Var) {
        this.d = d0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        d0 d0Var = this.d;
        float fLerp = AndroidUtilities.lerp(d0Var.f11271e, AndroidUtilities.dp(8.0f), d0Var.f11275j);
        float measuredWidth = view.getMeasuredWidth();
        float measuredHeight = view.getMeasuredHeight();
        RectF rectF = this.f11229b;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        RectF rectF2 = d0Var.f11272f;
        float f10 = d0Var.f11275j;
        RectF rectF3 = this.f11230c;
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF3);
        Rect rect = this.f11228a;
        rectF3.round(rect);
        outline.setRoundRect(rect, fLerp);
    }
}
