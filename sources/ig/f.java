package ig;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class f {
    public Bitmap f12134a;
    public Canvas f12135b;
    public final RectF f12136c = new RectF();
    public final Paint d;
    public final d6 f12137e;
    public int f12138f;
    public boolean f12139g;

    public f(d6 d6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f12138f = 0;
        this.f12139g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f12137e = d6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f12138f || this.f12139g) {
            this.f12139g = false;
            this.f12138f = i12;
            this.f12134a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f12135b = new Canvas(this.f12134a);
            RectF rectF = this.f12136c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f12135b.drawColor(h6.w0(h6.f20786d6, this.f12137e));
            this.f12135b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f12134a;
    }
}
