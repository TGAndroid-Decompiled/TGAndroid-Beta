package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.mc;
public final class j extends ImageView {
    public final float f14740a;
    public final mc f14741b;

    public j(Context context) {
        super(context);
        this.f14741b = new mc(this);
        this.f14740a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a10 = this.f14741b.a(this.f14740a);
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f14741b.c(z10);
    }
}
