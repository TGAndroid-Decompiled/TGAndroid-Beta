package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.hd;
public final class xa extends FrameLayout {
    public final org.telegram.ui.Components.o6 f10052a;
    public final ImageView f10053b;
    public int f10054c;
    public boolean d;

    public xa(Context context) {
        super(context);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f10052a = o6Var;
        o6Var.getDrawable().r(true, true);
        o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        addView(o6Var, c8.ma.i(-1.0f, -1.0f, 8388627, 22.0f, 0.0f, 58.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f10053b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230871);
        addView(imageView, c8.ma.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10054c = Integer.MAX_VALUE;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.d) {
            if (hd.f24444a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24444a0) {
                i7 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f29504k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
