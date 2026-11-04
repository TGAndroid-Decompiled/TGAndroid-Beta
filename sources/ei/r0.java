package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
public final class r0 extends TextView {
    public int f10858a;
    public final k4.j f10859b;

    public r0(Context context) {
        super(context);
        this.f10858a = -1;
        this.f10859b = new k4.j(24);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f10858a < 0) {
            int i3 = 0;
            if (getLayout() != null) {
                i3 = (int) getLayout().getLineWidth(0);
            }
            this.f10858a = i3;
        }
        if (this.f10858a > org.telegram.messenger.g0.L(100.0f)) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            super.onDraw(canvas);
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(15.0f), 0.0f, getWidth(), getHeight());
            this.f10859b.w(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), Integer.MIN_VALUE), i10);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f10858a = -1;
    }
}
