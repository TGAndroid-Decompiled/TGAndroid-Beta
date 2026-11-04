package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import org.telegram.messenger.bd;
public final class eb extends FrameLayout {
    public final org.telegram.ui.Components.h6 f5054a;
    public final ImageView f5055b;
    public int f5056c;
    public boolean d;

    public eb(Context context) {
        super(context);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f5054a = h6Var;
        h6Var.getDrawable().r(true, true);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        addView(h6Var, mf.i(-1.0f, -1.0f, 8388627, 22.0f, 0.0f, 58.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f5055b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230871);
        addView(imageView, mf.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5056c = Integer.MAX_VALUE;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        super.onDraw(canvas);
        if (this.d) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i3 = 0;
            }
            canvas.drawRect(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
