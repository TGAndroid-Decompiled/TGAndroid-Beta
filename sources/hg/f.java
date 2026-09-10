package hg;

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
    public Bitmap f9327a;
    public Canvas f9328b;
    public final RectF f9329c = new RectF();
    public final Paint d;
    public final f6 e;
    public int f9330f;
    public boolean f9331g;

    public f(f6 f6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f9330f = 0;
        this.f9331g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.e = f6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f9330f || this.f9331g) {
            this.f9331g = false;
            this.f9330f = i12;
            this.f9327a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f9328b = new Canvas(this.f9327a);
            RectF rectF = this.f9329c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f9328b.drawColor(j6.v0(j6.f17928d6, this.e));
            this.f9328b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f9327a;
    }
}
