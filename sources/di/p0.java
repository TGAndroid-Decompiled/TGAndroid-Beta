package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
public final class p0 extends TextView {
    public int f9495a;
    public final h6.m f9496b;

    public p0(Context context) {
        super(context);
        this.f9495a = -1;
        this.f9496b = new h6.m(28);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f9495a < 0) {
            int i7 = 0;
            if (getLayout() != null) {
                i7 = (int) getLayout().getLineWidth(0);
            }
            this.f9495a = i7;
        }
        if (this.f9495a > org.telegram.messenger.g0.L(100.0f)) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            super.onDraw(canvas);
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(15.0f), 0.0f, getWidth(), getHeight());
            this.f9496b.m(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), Integer.MIN_VALUE), i10);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f9495a = -1;
    }
}
