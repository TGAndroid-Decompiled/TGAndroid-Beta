package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.mc;
public final class k extends ImageView {
    public final float f14843a;
    public final mc f14844b;

    public k(Context context) {
        super(context);
        this.f14844b = new mc(this);
        this.f14843a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a10 = this.f14844b.a(this.f14843a);
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f14844b.c(z10);
    }
}
