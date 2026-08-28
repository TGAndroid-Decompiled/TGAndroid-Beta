package mh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;
public final class g0 extends Drawable {
    public final Paint f17848a = new Paint(1);
    public final RectF f17849b = new RectF();
    public final int f17850c;
    public final Path d;
    public boolean f17851e;
    public int f17852f;
    public final y5 f17853g;
    public final y5 h;

    public g0(int i9) {
        Path path = new Path();
        this.d = path;
        kh.f1 f1Var = new kh.f1(this, 22);
        gr grVar = gr.h;
        this.f17853g = new y5(f1Var, 320L, grVar, 0);
        this.h = new y5(new kh.f1(this, 22), 320L, grVar, 0);
        this.f17850c = i9;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f17849b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i9 = this.f17850c;
        Paint paint = this.f17848a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        float e10 = this.f17853g.e(this.f17851e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f17852f, false);
        if (e10 > 0.0f) {
            canvas.save();
            canvas.translate(dp, e2.c.z(1.0f, e10, AndroidUtilities.dp(6.16f), AndroidUtilities.dp(8.0f)));
            canvas.drawPath(this.d, paint);
            canvas.restore();
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
