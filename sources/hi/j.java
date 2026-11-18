package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.mc;
public final class j extends ImageView {
    public final float f14780a;
    public final mc f14781b;

    public j(Context context) {
        super(context);
        this.f14781b = new mc(this);
        this.f14780a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a10 = this.f14781b.a(this.f14780a);
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f14781b.c(z10);
    }
}
