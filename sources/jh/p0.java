package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.v10;

public final class p0 extends TextView {

    public int f13807a;

    public final v10 f13808b;

    public p0(Context context) {
        super(context);
        this.f13807a = -1;
        this.f13808b = new v10();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f13807a < 0) {
            this.f13807a = getLayout() != null ? (int) getLayout().getLineWidth(0) : 0;
        }
        if (this.f13807a <= AndroidUtilities.dp(100.0f)) {
            super.onDraw(canvas);
            return;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.onDraw(canvas);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - AndroidUtilities.dp(15.0f), 0.0f, getWidth(), getHeight());
        this.f13808b.b(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE), i11);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f13807a = -1;
    }
}
