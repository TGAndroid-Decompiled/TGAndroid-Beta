package kg;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class a0 extends ViewOutlineProvider {
    public final Rect f13641a = new Rect();
    public final RectF f13642b = new RectF();
    public final RectF f13643c = new RectF();
    public final d0 d;

    public a0(d0 d0Var) {
        this.d = d0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        d0 d0Var = this.d;
        float lerp = AndroidUtilities.lerp(d0Var.f13684e, AndroidUtilities.dp(8.0f), d0Var.f13688j);
        RectF rectF = this.f13642b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = d0Var.f13685f;
        float f9 = d0Var.f13688j;
        RectF rectF3 = this.f13643c;
        AndroidUtilities.lerp(rectF2, rectF, f9, rectF3);
        Rect rect = this.f13641a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
