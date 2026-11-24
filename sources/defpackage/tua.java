package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class tua extends FrameLayout {
    public final hn a;
    public final ImageView b;
    public int c;
    public boolean d;

    public tua(Context context) {
        super(context);
        hn hnVar = new hn(context, false, false, false);
        this.a = hnVar;
        hnVar.getDrawable().r(true, true);
        hnVar.setTextSize(gl.L(15.0f));
        addView(hnVar, nme.i(-1.0f, -1.0f, 8388627, 22.0f, 0.0f, 58.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230871);
        addView(imageView, nme.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = Integer.MAX_VALUE;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        super.onDraw(canvas);
        if (this.d) {
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(22.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(22.0f);
            } else {
                i = 0;
            }
            canvas.drawRect(f, measuredHeight, measuredWidth - i, getMeasuredHeight(), bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
    }
}
