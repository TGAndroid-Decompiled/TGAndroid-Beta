package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.l20;
public final class j1 extends TextView {
    public int f1032a;
    public final l20 f1033b;

    public j1(Context context) {
        super(context);
        this.f1032a = -1;
        this.f1033b = new l20();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f1032a < 0) {
            int i10 = 0;
            if (getLayout() != null) {
                i10 = (int) getLayout().getLineWidth(0);
            }
            this.f1032a = i10;
        }
        if (this.f1032a > AndroidUtilities.dp(100.0f)) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            super.onDraw(canvas);
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(15.0f), 0.0f, getWidth(), getHeight());
            this.f1033b.b(canvas, rectF, 2, 1.0f);
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
        this.f1032a = -1;
    }
}
