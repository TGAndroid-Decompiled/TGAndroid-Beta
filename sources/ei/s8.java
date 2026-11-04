package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class s8 extends FrameLayout {
    public final TL_stories.MediaArea f11029a;
    public final ug.l0 f11030b;

    public s8(Context context, ug.l0 l0Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.f11029a = mediaArea;
        this.f11030b = l0Var;
        addView(l0Var);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        ug.l0 l0Var = this.f11030b;
        l0Var.measure(i3, i10);
        int measuredWidth = (l0Var.getMeasuredWidth() - l0Var.getPaddingLeft()) - l0Var.getPaddingRight();
        int measuredHeight = (l0Var.getMeasuredHeight() - l0Var.getPaddingTop()) - l0Var.getPaddingBottom();
        float f10 = measuredWidth;
        float f11 = f10 / 2.0f;
        l0Var.setPivotX(l0Var.getPaddingLeft() + f11);
        float f12 = measuredHeight;
        float f13 = f12 / 2.0f;
        l0Var.setPivotY(l0Var.getPaddingTop() + f13);
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        float f14 = size;
        float f15 = size2;
        float min = Math.min(f14 / f10, f15 / f12);
        l0Var.setTranslationX((f14 / 2.0f) - (f11 + l0Var.getPaddingLeft()));
        l0Var.setTranslationY((f15 / 2.0f) - (f13 + l0Var.getPaddingTop()));
        l0Var.setScaleX(min);
        l0Var.setScaleY(min);
    }
}
