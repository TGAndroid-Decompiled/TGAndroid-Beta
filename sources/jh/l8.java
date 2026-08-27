package jh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;

public final class l8 extends FrameLayout {

    public final TL_stories.MediaArea f13644a;

    public final zf.r0 f13645b;

    public l8(Context context, zf.r0 r0Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.f13644a = mediaArea;
        this.f13645b = r0Var;
        addView(r0Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        zf.r0 r0Var = this.f13645b;
        r0Var.measure(i10, i11);
        int measuredWidth = (r0Var.getMeasuredWidth() - r0Var.getPaddingLeft()) - r0Var.getPaddingRight();
        int measuredHeight = (r0Var.getMeasuredHeight() - r0Var.getPaddingTop()) - r0Var.getPaddingBottom();
        float f10 = measuredWidth;
        float f11 = f10 / 2.0f;
        r0Var.setPivotX(r0Var.getPaddingLeft() + f11);
        float f12 = measuredHeight;
        float f13 = f12 / 2.0f;
        r0Var.setPivotY(r0Var.getPaddingTop() + f13);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        float f14 = size;
        float f15 = size2;
        float fMin = Math.min(f14 / f10, f15 / f12);
        r0Var.setTranslationX((f14 / 2.0f) - (f11 + r0Var.getPaddingLeft()));
        r0Var.setTranslationY((f15 / 2.0f) - (f13 + r0Var.getPaddingTop()));
        r0Var.setScaleX(fMin);
        r0Var.setScaleY(fMin);
    }
}
