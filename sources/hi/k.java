package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
public final class k extends ImageView {
    public final float f14761a;
    public final org.telegram.ui.Components.lc f14762b;

    public k(Context context) {
        super(context);
        this.f14762b = new org.telegram.ui.Components.lc(this);
        this.f14761a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a10 = this.f14762b.a(this.f14761a);
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f14762b.c(z10);
    }
}
