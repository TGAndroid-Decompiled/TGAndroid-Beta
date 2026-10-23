package gi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ei.bc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
public final class f0 extends Drawable {
    public final Paint f11215a = new Paint(1);
    public final RectF f11216b = new RectF();
    public final int f11217c;
    public final Path d;
    public boolean e;
    public int f11218f;
    public final f6 f11219g;
    public final f6 h;

    public f0(int i10) {
        Path path = new Path();
        this.d = path;
        bc bcVar = new bc(this, 2);
        bs bsVar = bs.h;
        this.f11219g = new f6(bcVar, 320L, bsVar, 0);
        this.h = new f6(new bc(this, 2), 320L, bsVar, 0);
        this.f11217c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f11216b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f11217c;
        Paint paint = this.f11215a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float e = this.f11219g.e(this.e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f11218f, false);
        if (e > 0.0f) {
            canvas.save();
            canvas.translate(dp, com.google.android.gms.internal.play_billing.k3.y(1.0f, e, AndroidUtilities.dp(6.16f), AndroidUtilities.dp(8.0f)));
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
