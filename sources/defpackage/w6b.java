package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class w6b extends FrameLayout {
    public final TL_stories.MediaArea a;
    public final gd6 b;

    public w6b(Context context, gd6 gd6Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.a = mediaArea;
        this.b = gd6Var;
        addView(gd6Var);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        gd6 gd6Var = this.b;
        gd6Var.measure(i, i2);
        int measuredWidth = (gd6Var.getMeasuredWidth() - gd6Var.getPaddingLeft()) - gd6Var.getPaddingRight();
        int measuredHeight = (gd6Var.getMeasuredHeight() - gd6Var.getPaddingTop()) - gd6Var.getPaddingBottom();
        float f = measuredWidth;
        float f2 = f / 2.0f;
        gd6Var.setPivotX(gd6Var.getPaddingLeft() + f2);
        float f3 = measuredHeight;
        float f4 = f3 / 2.0f;
        gd6Var.setPivotY(gd6Var.getPaddingTop() + f4);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        float f5 = size;
        float f6 = size2;
        float min = Math.min(f5 / f, f6 / f3);
        gd6Var.setTranslationX((f5 / 2.0f) - (f2 + gd6Var.getPaddingLeft()));
        gd6Var.setTranslationY((f6 / 2.0f) - (f4 + gd6Var.getPaddingTop()));
        gd6Var.setScaleX(min);
        gd6Var.setScaleY(min);
    }
}
