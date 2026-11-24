package defpackage;

import android.graphics.Canvas;
import android.view.View;
public final class lic extends View {
    public cka a;
    public boolean b;

    @Override
    public final void onDraw(Canvas canvas) {
        cka ckaVar;
        if (!this.b && (ckaVar = this.a) != null) {
            ckaVar.b(canvas, this);
        }
    }

    public void setState(boolean z) {
        this.b = z;
        invalidate();
    }
}
