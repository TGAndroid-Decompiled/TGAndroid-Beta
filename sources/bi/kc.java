package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class kc extends FrameLayout {
    public final org.telegram.ui.Components.i6 f4232a;
    public final ImageView f4233b;
    public int f4234c;
    public boolean d;

    public kc(Context context) {
        super(context);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, false, false, false);
        this.f4232a = i6Var;
        i6Var.getDrawable().r(true, true);
        i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        addView(i6Var, c8.ha.i(-1.0f, -1.0f, 8388627, 22.0f, 0.0f, 58.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f4233b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230871);
        addView(imageView, c8.ha.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4234c = Integer.MAX_VALUE;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.d) {
            if (org.telegram.messenger.id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
