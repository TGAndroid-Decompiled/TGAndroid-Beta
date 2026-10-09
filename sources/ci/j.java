package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
public final class j extends ImageView {
    public final float f5217a;
    public final org.telegram.ui.Components.bd f5218b;

    public j(Context context) {
        super(context);
        this.f5218b = new org.telegram.ui.Components.bd(this);
        this.f5217a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.f5218b.a(this.f5217a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f5218b.c(z10);
    }
}
