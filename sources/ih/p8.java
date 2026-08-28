package ih;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class p8 extends FrameLayout {
    public final TL_stories.MediaArea f11977a;
    public final yf.r0 f11978b;

    public p8(Context context, yf.r0 r0Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.f11977a = mediaArea;
        this.f11978b = r0Var;
        addView(r0Var);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        yf.r0 r0Var = this.f11978b;
        r0Var.measure(i9, i10);
        int measuredWidth = (r0Var.getMeasuredWidth() - r0Var.getPaddingLeft()) - r0Var.getPaddingRight();
        int measuredHeight = (r0Var.getMeasuredHeight() - r0Var.getPaddingTop()) - r0Var.getPaddingBottom();
        float f10 = measuredWidth;
        float f11 = f10 / 2.0f;
        r0Var.setPivotX(r0Var.getPaddingLeft() + f11);
        float f12 = measuredHeight;
        float f13 = f12 / 2.0f;
        r0Var.setPivotY(r0Var.getPaddingTop() + f13);
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        float f14 = size;
        float f15 = size2;
        float min = Math.min(f14 / f10, f15 / f12);
        r0Var.setTranslationX((f14 / 2.0f) - (f11 + r0Var.getPaddingLeft()));
        r0Var.setTranslationY((f15 / 2.0f) - (f13 + r0Var.getPaddingTop()));
        r0Var.setScaleX(min);
        r0Var.setScaleY(min);
    }
}
