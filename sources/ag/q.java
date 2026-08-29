package ag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import bg.a3;
import org.telegram.messenger.AndroidUtilities;
public final class q extends a3 {
    public final f0 f631y;

    public q(f0 f0Var, Context context, Bitmap bitmap) {
        super(context);
        this.f631y = f0Var;
        Paint paint = new Paint(1);
        this.f2083b = paint;
        Paint paint2 = new Paint(1);
        this.f2084c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f2085e = 0.5f;
        this.f2086f = 0.5f;
        this.h = new Path();
        this.f2087n = new Rect();
        this.f2088r = new RectF();
        this.f2082a = bitmap;
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
