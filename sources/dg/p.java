package dg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import eg.v2;
import org.telegram.messenger.AndroidUtilities;
public final class p extends v2 {
    public final e0 f4635y;

    public p(e0 e0Var, Context context, Bitmap bitmap) {
        super(context);
        this.f4635y = e0Var;
        Paint paint = new Paint(1);
        this.f5512b = paint;
        Paint paint2 = new Paint(1);
        this.f5513c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f5514e = 0.5f;
        this.f5515f = 0.5f;
        this.h = new Path();
        this.f5516n = new Rect();
        this.f5517r = new RectF();
        this.f5511a = bitmap;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setColor(-1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint2.setColor(-1711276033);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dp(12.0f));
    }
}
