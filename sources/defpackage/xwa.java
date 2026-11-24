package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class xwa extends FrameLayout {
    public final io a;
    public final ImageView b;
    public int c;
    public boolean d;

    public xwa(Context context) {
        super(context);
        io ioVar = new io(context, false, false, false);
        this.a = ioVar;
        ioVar.getDrawable().r(true, true);
        ioVar.setTextSize(gm.L(15.0f));
        addView(ioVar, qoe.i(-1.0f, -1.0f, 8388627, 22.0f, 0.0f, 58.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230872);
        addView(imageView, qoe.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 17.0f, 0.0f));
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
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(22.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(22.0f);
            } else {
                i = 0;
            }
            canvas.drawRect(f, measuredHeight, measuredWidth - i, getMeasuredHeight(), cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
    }
}
