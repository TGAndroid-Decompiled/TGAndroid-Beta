package nh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class l8 extends FrameLayout {
    public final TL_stories.MediaArea f15598a;
    public final dg.l1 f15599b;

    public l8(Context context, dg.l1 l1Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.f15598a = mediaArea;
        this.f15599b = l1Var;
        addView(l1Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        dg.l1 l1Var = this.f15599b;
        l1Var.measure(i10, i11);
        int measuredWidth = (l1Var.getMeasuredWidth() - l1Var.getPaddingLeft()) - l1Var.getPaddingRight();
        int measuredHeight = (l1Var.getMeasuredHeight() - l1Var.getPaddingTop()) - l1Var.getPaddingBottom();
        float f10 = measuredWidth;
        float f11 = f10 / 2.0f;
        l1Var.setPivotX(l1Var.getPaddingLeft() + f11);
        float f12 = measuredHeight;
        float f13 = f12 / 2.0f;
        l1Var.setPivotY(l1Var.getPaddingTop() + f13);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        float f14 = size;
        float f15 = size2;
        float min = Math.min(f14 / f10, f15 / f12);
        l1Var.setTranslationX((f14 / 2.0f) - (f11 + l1Var.getPaddingLeft()));
        l1Var.setTranslationY((f15 / 2.0f) - (f13 + l1Var.getPaddingTop()));
        l1Var.setScaleX(min);
        l1Var.setScaleY(min);
    }
}
