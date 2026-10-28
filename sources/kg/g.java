package kg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class g {
    public Bitmap f16562a;
    public Canvas f16563b;
    public final RectF f16564c = new RectF();
    public final Paint d;
    public final u6 e;
    public int f16565f;
    public boolean f16566g;
    public int h;

    public g(u6 u6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f16565f = 0;
        this.f16566g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = u6Var;
    }

    public final Bitmap a(int i10, int i11) {
        Canvas canvas;
        int w02 = y6.w0(y6.f23357d6, this.e);
        int i12 = (i10 + i11) << 10;
        int i13 = this.f16565f;
        Paint paint = this.d;
        RectF rectF = this.f16564c;
        if (i12 == i13 && !this.f16566g) {
            if (w02 != this.h && (canvas = this.f16563b) != null && this.f16562a != null) {
                this.h = w02;
                canvas.drawColor(w02, PorterDuff.Mode.SRC);
                this.f16563b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
        } else {
            this.f16566g = false;
            this.f16565f = i12;
            this.f16562a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f16563b = new Canvas(this.f16562a);
            rectF.set(0.0f, 0.0f, i11, i10);
            Canvas canvas2 = this.f16563b;
            this.h = w02;
            canvas2.drawColor(w02);
            this.f16563b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        return this.f16562a;
    }
}
