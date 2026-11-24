package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
public final class f76 extends TextView {
    public int a;
    public final xl3 b;

    public f76(Context context) {
        super(context);
        this.a = -1;
        this.b = new xl3((byte) 7);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i = this.a;
        if (i < 0) {
            if (getLayout() == null) {
                i = 0;
            } else {
                i = (int) getLayout().getLineWidth(0);
            }
            this.a = i;
        }
        if (i > gl.L(100.0f)) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            super.onDraw(canvas);
            canvas.save();
            RectF rectF = gl.P;
            rectF.set(getWidth() - gl.L(15.0f), 0.0f, getWidth(), getHeight());
            this.b.s(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), Integer.MIN_VALUE), i2);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.a = -1;
    }
}
