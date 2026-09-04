package di;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
public final class j extends ImageView {
    public final float f7408a;
    public final org.telegram.ui.Components.zc f7409b;

    public j(Context context) {
        super(context);
        this.f7409b = new org.telegram.ui.Components.zc(this);
        this.f7408a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.f7409b.a(this.f7408a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f7409b.c(z10);
    }
}
