package ig;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import jg.f2;
public final class j extends f2 {
    public final u D;

    public j(u uVar, Context context, Bitmap bitmap) {
        super(context);
        this.D = uVar;
        Paint paint = new Paint(1);
        this.f9967b = paint;
        Paint paint2 = new Paint(1);
        this.f9968c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = 0.5f;
        this.f9969f = 0.5f;
        this.h = new Path();
        this.f9970n = new Rect();
        this.f9971r = new RectF();
        this.f9966a = bitmap;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
        paint.setColor(-1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        paint2.setColor(-1711276033);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(12.0f));
    }
}
