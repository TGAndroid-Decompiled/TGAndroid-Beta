package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.dc;
public final class j extends ImageView {
    public final float f14439a;
    public final dc f14440b;

    public j(Context context) {
        super(context);
        this.f14440b = new dc(this);
        this.f14439a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a10 = this.f14440b.a(this.f14439a);
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f14440b.c(z10);
    }
}
