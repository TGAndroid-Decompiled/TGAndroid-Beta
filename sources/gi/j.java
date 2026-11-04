package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.gc;
public final class j extends ImageView {
    public final float f12986a;
    public final gc f12987b;

    public j(Context context) {
        super(context);
        this.f12987b = new gc(this);
        this.f12986a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a10 = this.f12987b.a(this.f12986a);
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f12987b.c(z10);
    }
}
