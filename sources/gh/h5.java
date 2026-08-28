package gh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hq;
public final class h5 extends hq {
    public final View f8210b;
    public final Paint f8211c;
    public final Path d;
    public final long f8212e;
    public float f8213f;

    public h5(kh.d dVar, int i9) {
        super(dVar);
        Paint paint = new Paint(1);
        this.f8211c = paint;
        Path path = new Path();
        this.d = path;
        this.f8212e = System.currentTimeMillis();
        this.f8213f = 1.0f;
        this.f8210b = dVar;
        this.f29171a.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i9);
        path.rewind();
        path.moveTo(-AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
        path.lineTo(0.0f, -AndroidUtilities.dpf2(1.08f));
        path.lineTo(AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint = this.f29171a;
        paint.setAlpha((int) (this.f8213f * 255.0f));
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
        float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.f8212e) % 400)) / 400.0f;
        Paint paint2 = this.f8211c;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * this.f8213f));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        canvas.save();
        canvas.translate(getBounds().centerX(), getBounds().centerY() - (((AndroidUtilities.dpf2(1.166f) * 2.0f) + (AndroidUtilities.dpf2(2.16f) * 3.0f)) / 2.0f));
        for (int i9 = 0; i9 < 4; i9++) {
            if (i9 == 0) {
                f10 = 1.0f - currentTimeMillis;
            } else if (i9 == 3) {
                f10 = currentTimeMillis;
            } else {
                f10 = 1.0f;
            }
            paint2.setAlpha((int) (f10 * 255.0f * this.f8213f));
            canvas.save();
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, f10);
            canvas.scale(lerp, lerp);
            canvas.drawPath(this.d, paint2);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dpf2(3.3260002f) * f10);
        }
        canvas.restore();
        paint2.setAlpha(alpha);
        View view = this.f8210b;
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
    public final void setAlpha(int i9) {
        this.f8213f = i9 / 255.0f;
    }
}
