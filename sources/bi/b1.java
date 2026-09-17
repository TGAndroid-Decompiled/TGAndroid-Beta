package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.l20;
public final class b1 extends TextView {
    public int f2788a;
    public final l20 f2789b;

    public b1(Context context) {
        super(context);
        this.f2788a = -1;
        this.f2789b = new l20();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f2788a < 0) {
            int i10 = 0;
            if (getLayout() != null) {
                i10 = (int) getLayout().getLineWidth(0);
            }
            this.f2788a = i10;
        }
        if (this.f2788a > AndroidUtilities.dp(100.0f)) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            super.onDraw(canvas);
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(15.0f), 0.0f, getWidth(), getHeight());
            this.f2789b.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE), i11);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f2788a = -1;
    }
}
