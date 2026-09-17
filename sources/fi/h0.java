package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import di.nb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.pr;
public final class h0 extends Drawable {
    public final Paint f9723a = new Paint(1);
    public final RectF f9724b = new RectF();
    public final int f9725c;
    public final Path d;
    public boolean f9726e;
    public int f9727f;
    public final e6 f9728g;
    public final e6 h;

    public h0(int i10) {
        Path path = new Path();
        this.d = path;
        nb nbVar = new nb(this, 10);
        pr prVar = pr.h;
        this.f9728g = new e6(nbVar, 320L, prVar, 0);
        this.h = new e6(new nb(this, 10), 320L, prVar, 0);
        this.f9725c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f9724b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f9725c;
        Paint paint = this.f9723a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float e7 = this.f9728g.e(this.f9726e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f9727f, false);
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
