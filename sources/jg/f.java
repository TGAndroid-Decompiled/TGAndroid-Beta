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
    public Bitmap f13633a;
    public Canvas f13634b;
    public final RectF f13635c = new RectF();
    public final Paint d;
    public final f6 f13636e;
    public int f13637f;
    public boolean f13638g;

    public f(f6 f6Var) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f13637f = 0;
        this.f13638g = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f13636e = f6Var;
    }

    public final Bitmap a(int i10, int i11) {
        int i12 = (i10 + i11) << 10;
        if (i12 != this.f13637f || this.f13638g) {
            this.f13638g = false;
            this.f13637f = i12;
            this.f13633a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            this.f13634b = new Canvas(this.f13633a);
            RectF rectF = this.f13635c;
            rectF.set(0.0f, 0.0f, i11, i10);
            this.f13634b.drawColor(j6.v0(j6.f20663d6, this.f13636e));
            this.f13634b.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.d);
        }
        return this.f13633a;
    }
}
