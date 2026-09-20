package ig;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class f {
    public Bitmap f11111a;
    public Canvas f11112b;
    public final RectF f11113c = new RectF();
    public final Paint d;
    public final f6 e;
    public int f11114f;
    public boolean f11115g;

    public f(f6 f6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f11114f = 0;
        this.f11115g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = f6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f11114f || this.f11115g) {
            this.f11115g = false;
            this.f11114f = i12;
            this.f11111a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f11112b = new Canvas(this.f11111a);
            RectF rectF = this.f11113c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f11112b.drawColor(j6.v0(j6.f19094d6, this.e));
            this.f11112b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f11111a;
    }
}
