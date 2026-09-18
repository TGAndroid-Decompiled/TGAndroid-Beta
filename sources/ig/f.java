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
    public Bitmap f11110a;
    public Canvas f11111b;
    public final RectF f11112c = new RectF();
    public final Paint d;
    public final f6 e;
    public int f11113f;
    public boolean f11114g;

    public f(f6 f6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f11113f = 0;
        this.f11114g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = f6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f11113f || this.f11114g) {
            this.f11114g = false;
            this.f11113f = i12;
            this.f11110a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f11111b = new Canvas(this.f11110a);
            RectF rectF = this.f11112c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f11111b.drawColor(j6.v0(j6.f18863d6, this.e));
            this.f11111b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f11110a;
    }
}
