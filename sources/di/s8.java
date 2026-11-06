package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class s8 extends FrameLayout {
    public final TL_stories.MediaArea f9771a;
    public final tg.m0 f9772b;

    public s8(Context context, tg.m0 m0Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.f9771a = mediaArea;
        this.f9772b = m0Var;
        addView(m0Var);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        tg.m0 m0Var = this.f9772b;
        m0Var.measure(i7, i10);
        int measuredWidth = (m0Var.getMeasuredWidth() - m0Var.getPaddingLeft()) - m0Var.getPaddingRight();
        int measuredHeight = (m0Var.getMeasuredHeight() - m0Var.getPaddingTop()) - m0Var.getPaddingBottom();
        float f10 = measuredWidth;
        float f11 = f10 / 2.0f;
        m0Var.setPivotX(m0Var.getPaddingLeft() + f11);
        float f12 = measuredHeight;
        float f13 = f12 / 2.0f;
        m0Var.setPivotY(m0Var.getPaddingTop() + f13);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        float f14 = size;
        float f15 = size2;
        float min = Math.min(f14 / f10, f15 / f12);
        m0Var.setTranslationX((f14 / 2.0f) - (f11 + m0Var.getPaddingLeft()));
        m0Var.setTranslationY((f15 / 2.0f) - (f13 + m0Var.getPaddingTop()));
        m0Var.setScaleX(min);
        m0Var.setScaleY(min);
    }
}
