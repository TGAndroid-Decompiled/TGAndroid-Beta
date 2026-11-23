package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.Components.i61;
public final class o0 extends TextView {
    public int f12324a;
    public final i61 f12325b;

    public o0(Context context) {
        super(context);
        this.f12324a = -1;
        this.f12325b = new i61(1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f12324a < 0) {
            int i7 = 0;
            if (getLayout() != null) {
                i7 = (int) getLayout().getLineWidth(0);
            }
            this.f12324a = i7;
        }
        if (this.f12324a > org.telegram.messenger.g0.L(100.0f)) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            super.onDraw(canvas);
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(15.0f), 0.0f, getWidth(), getHeight());
            this.f12325b.u(canvas, rectF, 2, 1.0f);
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
        this.f12324a = -1;
    }
}
