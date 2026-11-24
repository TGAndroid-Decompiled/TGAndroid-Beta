package defpackage;

import android.graphics.Canvas;
import android.view.View;
public final class lkc extends View {
    public dma a;
    public boolean b;

    @Override
    public final void onDraw(Canvas canvas) {
        dma dmaVar;
        if (!this.b && (dmaVar = this.a) != null) {
            dmaVar.b(canvas, this);
        }
    }

    public void setState(boolean z) {
        this.b = z;
        invalidate();
    }
}
