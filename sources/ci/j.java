package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
public final class j extends ImageView {
    public final float f5216a;
    public final org.telegram.ui.Components.bd f5217b;

    public j(Context context) {
        super(context);
        this.f5217b = new org.telegram.ui.Components.bd(this);
        this.f5216a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.f5217b.a(this.f5216a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f5217b.c(z10);
    }
}
