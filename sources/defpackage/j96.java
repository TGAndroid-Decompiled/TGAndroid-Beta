package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
public final class j96 extends TextView {
    public int a;
    public final pm3 b;

    public j96(Context context) {
        super(context);
        this.a = -1;
        this.b = new pm3((byte) 7);
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
        if (i > hl.L(100.0f)) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            super.onDraw(canvas);
            canvas.save();
            RectF rectF = hl.P;
            rectF.set(getWidth() - hl.L(15.0f), 0.0f, getWidth(), getHeight());
            this.b.r(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), Integer.MIN_VALUE), i2);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.a = -1;
    }
}
