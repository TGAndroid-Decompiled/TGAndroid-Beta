package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class v4b extends FrameLayout {
    public final TL_stories.MediaArea a;
    public final hb6 b;

    public v4b(Context context, hb6 hb6Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.a = mediaArea;
        this.b = hb6Var;
        addView(hb6Var);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        hb6 hb6Var = this.b;
        hb6Var.measure(i, i2);
        int measuredWidth = (hb6Var.getMeasuredWidth() - hb6Var.getPaddingLeft()) - hb6Var.getPaddingRight();
        int measuredHeight = (hb6Var.getMeasuredHeight() - hb6Var.getPaddingTop()) - hb6Var.getPaddingBottom();
        float f = measuredWidth;
        float f2 = f / 2.0f;
        hb6Var.setPivotX(hb6Var.getPaddingLeft() + f2);
        float f3 = measuredHeight;
        float f4 = f3 / 2.0f;
        hb6Var.setPivotY(hb6Var.getPaddingTop() + f4);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        float f5 = size;
        float f6 = size2;
        float min = Math.min(f5 / f, f6 / f3);
        hb6Var.setTranslationX((f5 / 2.0f) - (f2 + hb6Var.getPaddingLeft()));
        hb6Var.setTranslationY((f6 / 2.0f) - (f4 + hb6Var.getPaddingTop()));
        hb6Var.setScaleX(min);
        hb6Var.setScaleY(min);
    }
}
