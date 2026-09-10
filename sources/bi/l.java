package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
public final class l extends ImageView {
    public final float f3033a;
    public final org.telegram.ui.Components.xc f3034b;

    public l(Context context) {
        super(context);
        this.f3034b = new org.telegram.ui.Components.xc(this);
        this.f3033a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.f3034b.a(this.f3033a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f3034b.c(z10);
    }
}
