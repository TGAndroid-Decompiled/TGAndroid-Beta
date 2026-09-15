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
    public Bitmap f11107a;
    public Canvas f11108b;
    public final RectF f11109c = new RectF();
    public final Paint d;
    public final e6 e;
    public int f11110f;
    public boolean f11111g;

    public f(e6 e6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f11110f = 0;
        this.f11111g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = e6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f11110f || this.f11111g) {
            this.f11111g = false;
            this.f11110f = i12;
            this.f11107a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f11108b = new Canvas(this.f11107a);
            RectF rectF = this.f11109c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f11108b.drawColor(i6.v0(i6.f18836d6, this.e));
            this.f11108b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f11107a;
    }
}
