package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ci.qc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.tr;
public final class i0 extends Drawable {
    public final Paint f9087a = new Paint(1);
    public final RectF f9088b = new RectF();
    public final int f9089c;
    public final Path d;
    public boolean f9090e;
    public int f9091f;
    public final e6 f9092g;
    public final e6 h;

    public i0(int i10) {
        Path path = new Path();
        this.d = path;
        qc qcVar = new qc(this, 6);
        tr trVar = tr.h;
        this.f9092g = new e6(qcVar, 320L, trVar, 0);
        this.h = new e6(new qc(this, 6), 320L, trVar, 0);
        this.f9089c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f9088b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f9089c;
        Paint paint = this.f9087a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float e7 = this.f9092g.e(this.f9090e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f9091f, false);
        if (e7 > 0.0f) {
            canvas.save();
            canvas.translate(dp, com.google.android.gms.internal.vision.e2.z(1.0f, e7, AndroidUtilities.dp(6.16f), AndroidUtilities.dp(8.0f)));
            canvas.drawPath(this.d, paint);
            canvas.restore();
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
