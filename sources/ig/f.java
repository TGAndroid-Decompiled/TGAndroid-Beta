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
    public Bitmap f11097a;
    public Canvas f11098b;
    public final RectF f11099c = new RectF();
    public final Paint d;
    public final d6 e;
    public int f11100f;
    public boolean f11101g;

    public f(d6 d6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f11100f = 0;
        this.f11101g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = d6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f11100f || this.f11101g) {
            this.f11101g = false;
            this.f11100f = i12;
            this.f11097a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f11098b = new Canvas(this.f11097a);
            RectF rectF = this.f11099c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f11098b.drawColor(h6.v0(h6.f19045d6, this.e));
            this.f11098b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f11097a;
    }
}
