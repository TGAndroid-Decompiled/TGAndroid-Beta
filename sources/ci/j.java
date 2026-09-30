package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
public final class j extends ImageView {
    public final float f4800a;
    public final org.telegram.ui.Components.zc f4801b;

    public j(Context context) {
        super(context);
        this.f4801b = new org.telegram.ui.Components.zc(this);
        this.f4800a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.f4801b.a(this.f4800a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f4801b.c(z10);
    }
}
