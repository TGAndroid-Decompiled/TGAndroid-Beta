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
    public Bitmap f11109a;
    public Canvas f11110b;
    public final RectF f11111c = new RectF();
    public final Paint d;
    public final e6 e;
    public int f11112f;
    public boolean f11113g;

    public f(e6 e6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f11112f = 0;
        this.f11113g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = e6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f11112f || this.f11113g) {
            this.f11113g = false;
            this.f11112f = i12;
            this.f11109a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f11110b = new Canvas(this.f11109a);
            RectF rectF = this.f11111c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f11110b.drawColor(i6.v0(i6.f18834d6, this.e));
            this.f11110b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f11109a;
    }
}
