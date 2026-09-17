package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class sa extends FrameLayout {
    public final TL_stories.MediaArea f3737a;
    public final rg.u0 f3738b;

    public sa(Context context, rg.u0 u0Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.f3737a = mediaArea;
        this.f3738b = u0Var;
        addView(u0Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        rg.u0 u0Var = this.f3738b;
        u0Var.measure(i10, i11);
        int measuredWidth = (u0Var.getMeasuredWidth() - u0Var.getPaddingLeft()) - u0Var.getPaddingRight();
        int measuredHeight = (u0Var.getMeasuredHeight() - u0Var.getPaddingTop()) - u0Var.getPaddingBottom();
        float f7 = measuredWidth;
        float f10 = f7 / 2.0f;
        u0Var.setPivotX(u0Var.getPaddingLeft() + f10);
        float f11 = measuredHeight;
        float f12 = f11 / 2.0f;
        u0Var.setPivotY(u0Var.getPaddingTop() + f12);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        float f13 = size;
        float f14 = size2;
        float min = Math.min(f13 / f7, f14 / f11);
        u0Var.setTranslationX((f13 / 2.0f) - (f10 + u0Var.getPaddingLeft()));
        u0Var.setTranslationY((f14 / 2.0f) - (f12 + u0Var.getPaddingTop()));
        u0Var.setScaleX(min);
        u0Var.setScaleY(min);
    }
}
