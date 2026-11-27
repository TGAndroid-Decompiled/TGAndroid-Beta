package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
public final class rv8 extends View {
    public final sv8 a;

    public rv8(sv8 sv8Var, Context context) {
        super(context);
        this.a = sv8Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        sv8 sv8Var = this.a;
        RectF rectF = sv8Var.E;
        Bitmap bitmap = sv8Var.H;
        if (bitmap != null && !bitmap.isRecycled()) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawBitmap(sv8Var.H, (Rect) null, rectF, sv8Var.y);
        }
    }
}
