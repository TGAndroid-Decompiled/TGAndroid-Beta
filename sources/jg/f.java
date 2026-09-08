package jg;

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
    public Bitmap f13659a;
    public Canvas f13660b;
    public final RectF f13661c = new RectF();
    public final Paint d;
    public final f6 f13662e;
    public int f13663f;
    public boolean f13664g;

    public f(f6 f6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f13663f = 0;
        this.f13664g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f13662e = f6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f13663f || this.f13664g) {
            this.f13664g = false;
            this.f13663f = i12;
            this.f13659a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f13660b = new Canvas(this.f13659a);
            RectF rectF = this.f13661c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f13660b.drawColor(j6.v0(j6.f20690d6, this.f13662e));
            this.f13660b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f13659a;
    }
}
