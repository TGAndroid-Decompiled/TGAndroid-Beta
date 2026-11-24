package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class is8 extends View {
    public final js8 a;

    public is8(js8 js8Var, Context context) {
        super(context);
        this.a = js8Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        js8 js8Var = this.a;
        RectF rectF = js8Var.E;
        Bitmap bitmap = js8Var.H;
        if (bitmap != null && !bitmap.isRecycled()) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(js8Var.H, (Rect) null, rectF, js8Var.y);
        }
    }
}
