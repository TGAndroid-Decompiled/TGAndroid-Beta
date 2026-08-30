package cg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import dg.x2;
import org.telegram.messenger.AndroidUtilities;
public final class p extends x2 {
    public final e0 f2490y;

    public p(e0 e0Var, Context context, Bitmap bitmap) {
        super(context);
        this.f2490y = e0Var;
        Paint paint = new Paint(1);
        this.f4846b = paint;
        Paint paint2 = new Paint(1);
        this.f4847c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = 0.5f;
        this.f4848f = 0.5f;
        this.h = new Path();
        this.f4849n = new Rect();
        this.f4850r = new RectF();
        this.f4845a = bitmap;
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
