package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class ju8 extends View {
    public final ku8 a;

    public ju8(ku8 ku8Var, Context context) {
        super(context);
        this.a = ku8Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ku8 ku8Var = this.a;
        RectF rectF = ku8Var.E;
        Bitmap bitmap = ku8Var.H;
        if (bitmap != null && !bitmap.isRecycled()) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(ku8Var.H, (Rect) null, rectF, ku8Var.y);
        }
    }
}
