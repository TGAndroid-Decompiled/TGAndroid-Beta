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
    public Bitmap f12088a;
    public Canvas f12089b;
    public final RectF f12090c = new RectF();
    public final Paint d;
    public final d6 f12091e;
    public int f12092f;
    public boolean f12093g;

    public f(d6 d6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f12092f = 0;
        this.f12093g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f12091e = d6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f12092f || this.f12093g) {
            this.f12093g = false;
            this.f12092f = i12;
            this.f12088a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f12089b = new Canvas(this.f12088a);
            RectF rectF = this.f12090c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f12089b.drawColor(i6.v0(i6.f20827d6, this.f12091e));
            this.f12089b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f12088a;
    }
}
