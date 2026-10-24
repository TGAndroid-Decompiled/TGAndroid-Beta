package jg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class f {
    public Bitmap f14470a;
    public Canvas f14471b;
    public final RectF f14472c = new RectF();
    public final Paint d;
    public final g6 e;
    public int f14473f;
    public boolean f14474g;
    public int h;

    public f(g6 g6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f14473f = 0;
        this.f14474g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = g6Var;
    }

    public final Bitmap a(int i10, int i11) {
        Canvas canvas;
        int w02 = k6.w0(k6.f21184d6, this.e);
        int i12 = (i10 + i11) << 10;
        int i13 = this.f14473f;
        Paint paint = this.d;
        RectF rectF = this.f14472c;
        if (i12 == i13 && !this.f14474g) {
            if (w02 != this.h && (canvas = this.f14471b) != null && this.f14470a != null) {
                this.h = w02;
                canvas.drawColor(w02, PorterDuff.Mode.SRC);
                this.f14471b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
        } else {
            this.f14474g = false;
            this.f14473f = i12;
            this.f14470a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f14471b = new Canvas(this.f14470a);
            rectF.set(0.0f, 0.0f, i11, i10);
            Canvas canvas2 = this.f14471b;
            this.h = w02;
            canvas2.drawColor(w02);
            this.f14471b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        return this.f14470a;
    }
}
