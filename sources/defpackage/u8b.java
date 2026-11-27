package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class u8b extends FrameLayout {
    public final TL_stories.MediaArea a;
    public final ld6 b;

    public u8b(Context context, ld6 ld6Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.a = mediaArea;
        this.b = ld6Var;
        addView(ld6Var);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ld6 ld6Var = this.b;
        ld6Var.measure(i, i2);
        int measuredWidth = (ld6Var.getMeasuredWidth() - ld6Var.getPaddingLeft()) - ld6Var.getPaddingRight();
        int measuredHeight = (ld6Var.getMeasuredHeight() - ld6Var.getPaddingTop()) - ld6Var.getPaddingBottom();
        float f = measuredWidth;
        float f2 = f / 2.0f;
        ld6Var.setPivotX(ld6Var.getPaddingLeft() + f2);
        float f3 = measuredHeight;
        float f4 = f3 / 2.0f;
        ld6Var.setPivotY(ld6Var.getPaddingTop() + f4);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        float f5 = size;
        float f6 = size2;
        float min = Math.min(f5 / f, f6 / f3);
        ld6Var.setTranslationX((f5 / 2.0f) - (f2 + ld6Var.getPaddingLeft()));
        ld6Var.setTranslationY((f6 / 2.0f) - (f4 + ld6Var.getPaddingTop()));
        ld6Var.setScaleX(min);
        ld6Var.setScaleY(min);
    }
}
