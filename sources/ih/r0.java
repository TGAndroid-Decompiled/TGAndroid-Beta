package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.s10;
public final class r0 extends TextView {
    public int f12054a;
    public final s10 f12055b;

    public r0(Context context) {
        super(context);
        this.f12054a = -1;
        this.f12055b = new s10();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f12054a < 0) {
            int i9 = 0;
            if (getLayout() != null) {
                i9 = (int) getLayout().getLineWidth(0);
            }
            this.f12054a = i9;
        }
        if (this.f12054a > AndroidUtilities.dp(100.0f)) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            super.onDraw(canvas);
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(15.0f), 0.0f, getWidth(), getHeight());
            this.f12055b.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE), i10);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f12054a = -1;
    }
}
