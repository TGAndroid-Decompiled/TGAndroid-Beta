package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.PhotoViewer;
public final class v78 extends occ {
    public final wl0 h0;
    public final PhotoViewer i0;

    public v78(Context context, PhotoViewer photoViewer) {
        super(context);
        this.i0 = photoViewer;
        this.h0 = new wl0(photoViewer.c0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.i0;
        canvas.translate((-getX()) - photoViewer.X7.getX(), (-getY()) - photoViewer.X7.getY());
        photoViewer.Q(canvas, this.h0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        byte b;
        if (gba.Z && ((b = this.i0.n4) == 1 || b == 2 || b == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            this.i0.f0.invalidate();
        }
    }
}
