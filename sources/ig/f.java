package ig;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class f {
    public Bitmap f12135a;
    public Canvas f12136b;
    public final RectF f12137c = new RectF();
    public final Paint d;
    public final e6 f12138e;
    public int f12139f;
    public boolean f12140g;

    public f(e6 e6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f12139f = 0;
        this.f12140g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f12138e = e6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f12139f || this.f12140g) {
            this.f12140g = false;
            this.f12139f = i12;
            this.f12135a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f12136b = new Canvas(this.f12135a);
            RectF rectF = this.f12137c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f12136b.drawColor(i6.w0(i6.f20797d6, this.f12138e));
            this.f12136b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f12135a;
    }
}
