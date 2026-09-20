package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class lb extends FrameLayout {
    public final TL_stories.MediaArea f1217a;
    public final qg.t0 f1218b;

    public lb(Context context, qg.t0 t0Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.f1217a = mediaArea;
        this.f1218b = t0Var;
        addView(t0Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qg.t0 t0Var = this.f1218b;
        t0Var.measure(i10, i11);
        int measuredWidth = (t0Var.getMeasuredWidth() - t0Var.getPaddingLeft()) - t0Var.getPaddingRight();
        int measuredHeight = (t0Var.getMeasuredHeight() - t0Var.getPaddingTop()) - t0Var.getPaddingBottom();
        float f7 = measuredWidth;
        float f10 = f7 / 2.0f;
        t0Var.setPivotX(t0Var.getPaddingLeft() + f10);
        float f11 = measuredHeight;
        float f12 = f11 / 2.0f;
        t0Var.setPivotY(t0Var.getPaddingTop() + f12);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        float f13 = size;
        float f14 = size2;
        float min = Math.min(f13 / f7, f14 / f11);
        t0Var.setTranslationX((f13 / 2.0f) - (f10 + t0Var.getPaddingLeft()));
        t0Var.setTranslationY((f14 / 2.0f) - (f12 + t0Var.getPaddingTop()));
        t0Var.setScaleX(min);
        t0Var.setScaleY(min);
    }
}
