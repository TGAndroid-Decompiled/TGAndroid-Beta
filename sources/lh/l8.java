package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class l8 extends FrameLayout {
    public final TL_stories.MediaArea f15914a;
    public final bg.n1 f15915b;

    public l8(Context context, bg.n1 n1Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.f15914a = mediaArea;
        this.f15915b = n1Var;
        addView(n1Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bg.n1 n1Var = this.f15915b;
        n1Var.measure(i10, i11);
        int measuredWidth = (n1Var.getMeasuredWidth() - n1Var.getPaddingLeft()) - n1Var.getPaddingRight();
        int measuredHeight = (n1Var.getMeasuredHeight() - n1Var.getPaddingTop()) - n1Var.getPaddingBottom();
        float f9 = measuredWidth;
        float f10 = f9 / 2.0f;
        n1Var.setPivotX(n1Var.getPaddingLeft() + f10);
        float f11 = measuredHeight;
        float f12 = f11 / 2.0f;
        n1Var.setPivotY(n1Var.getPaddingTop() + f12);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        float f13 = size;
        float f14 = size2;
        float min = Math.min(f13 / f9, f14 / f11);
        n1Var.setTranslationX((f13 / 2.0f) - (f10 + n1Var.getPaddingLeft()));
        n1Var.setTranslationY((f14 / 2.0f) - (f12 + n1Var.getPaddingTop()));
        n1Var.setScaleX(min);
        n1Var.setScaleY(min);
    }
}
