package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class i8 extends FrameLayout {
    public final TL_stories.MediaArea f12165a;
    public final tg.n0 f12166b;

    public i8(Context context, tg.n0 n0Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.f12165a = mediaArea;
        this.f12166b = n0Var;
        addView(n0Var);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        tg.n0 n0Var = this.f12166b;
        n0Var.measure(i7, i10);
        int measuredWidth = (n0Var.getMeasuredWidth() - n0Var.getPaddingLeft()) - n0Var.getPaddingRight();
        int measuredHeight = (n0Var.getMeasuredHeight() - n0Var.getPaddingTop()) - n0Var.getPaddingBottom();
        float f10 = measuredWidth;
        float f11 = f10 / 2.0f;
        n0Var.setPivotX(n0Var.getPaddingLeft() + f11);
        float f12 = measuredHeight;
        float f13 = f12 / 2.0f;
        n0Var.setPivotY(n0Var.getPaddingTop() + f13);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        float f14 = size;
        float f15 = size2;
        float min = Math.min(f14 / f10, f15 / f12);
        n0Var.setTranslationX((f14 / 2.0f) - (f11 + n0Var.getPaddingLeft()));
        n0Var.setTranslationY((f15 / 2.0f) - (f13 + n0Var.getPaddingTop()));
        n0Var.setScaleX(min);
        n0Var.setScaleY(min);
    }
}
