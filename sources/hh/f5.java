package hh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fq;

public final class f5 extends fq {

    public final View f9257b;

    public final Paint f9258c;
    public final Path d;

    public final long f9259e;

    public float f9260f;

    public f5(lh.d dVar, int i10) {
        super(dVar);
        Paint paint = new Paint(1);
        this.f9258c = paint;
        Path path = new Path();
        this.d = path;
        this.f9259e = System.currentTimeMillis();
        this.f9260f = 1.0f;
        this.f9257b = dVar;
        this.f28431a.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i10);
        path.rewind();
        path.moveTo(-AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
        path.lineTo(0.0f, -AndroidUtilities.dpf2(1.08f));
        path.lineTo(AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        int i10 = (int) (this.f9260f * 255.0f);
        Paint paint = this.f28431a;
        paint.setAlpha(i10);
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
        float fCurrentTimeMillis = ((System.currentTimeMillis() - this.f9259e) % 400) / 400.0f;
        Paint paint2 = this.f9258c;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * this.f9260f));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        canvas.save();
        canvas.translate(getBounds().centerX(), getBounds().centerY() - (((AndroidUtilities.dpf2(1.166f) * 2.0f) + (AndroidUtilities.dpf2(2.16f) * 3.0f)) / 2.0f));
        int i11 = 0;
        while (i11 < 4) {
            if (i11 == 0) {
                f10 = 1.0f - fCurrentTimeMillis;
            } else {
                f10 = i11 == 3 ? fCurrentTimeMillis : 1.0f;
            }
            paint2.setAlpha((int) (f10 * 255.0f * this.f9260f));
            canvas.save();
            float fLerp = AndroidUtilities.lerp(0.5f, 1.0f, f10);
            canvas.scale(fLerp, fLerp);
            canvas.drawPath(this.d, paint2);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dpf2(3.3260002f) * f10);
            i11++;
        }
        canvas.restore();
        paint2.setAlpha(alpha);
        View view = this.f9257b;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f9260f = i10 / 255.0f;
    }
}
