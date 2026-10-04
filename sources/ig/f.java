package ig;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
public final class f {
    public Bitmap f12087a;
    public Canvas f12088b;
    public final RectF f12089c = new RectF();
    public final Paint d;
    public final d6 f12090e;
    public int f12091f;
    public boolean f12092g;

    public f(d6 d6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f12091f = 0;
        this.f12092g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f12090e = d6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f12091f || this.f12092g) {
            this.f12092g = false;
            this.f12091f = i12;
            this.f12087a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f12088b = new Canvas(this.f12087a);
            RectF rectF = this.f12089c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f12088b.drawColor(i6.v0(i6.f20818d6, this.f12090e));
            this.f12088b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f12087a;
    }
}
