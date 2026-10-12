package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import di.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
public final class g0 extends Drawable {
    public final Paint f9280a = new Paint(1);
    public final RectF f9281b = new RectF();
    public final int f9282c;
    public final Path d;
    public boolean e;
    public int f9283f;
    public final g6 f9284g;
    public final g6 h;

    public g0(int i10) {
        Path path = new Path();
        this.d = path;
        x8 x8Var = new x8(this, 12);
        es esVar = es.h;
        this.f9284g = new g6(x8Var, 320L, esVar, 0);
        this.h = new g6(new x8(this, 12), 320L, esVar, 0);
        this.f9282c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f9281b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f9282c;
        Paint paint = this.f9280a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float e = this.f9284g.e(this.e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f9283f, false);
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
