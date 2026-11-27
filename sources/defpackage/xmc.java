package defpackage;

import android.graphics.Canvas;
import android.view.View;
public final class xmc extends View {
    public wna a;
    public boolean b;

    @Override
    public final void onDraw(Canvas canvas) {
        wna wnaVar;
        if (!this.b && (wnaVar = this.a) != null) {
            wnaVar.b(canvas, this);
        }
    }

    public void setState(boolean z) {
        this.b = z;
        invalidate();
    }
}
