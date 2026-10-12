package ig;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public final class f {
    public Bitmap f12133a;
    public Canvas f12134b;
    public final RectF f12135c = new RectF();
    public final Paint d;
    public final c6 f12136e;
    public int f12137f;
    public boolean f12138g;

    public f(c6 c6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f12137f = 0;
        this.f12138g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f12136e = c6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f12137f || this.f12138g) {
            this.f12138g = false;
            this.f12137f = i12;
            this.f12133a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f12134b = new Canvas(this.f12133a);
            RectF rectF = this.f12135c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f12134b.drawColor(h6.w0(h6.f20559d6, this.f12136e));
            this.f12134b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f12133a;
    }
}
