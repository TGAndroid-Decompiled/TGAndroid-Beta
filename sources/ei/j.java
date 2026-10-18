package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.ImageView;
import org.telegram.ui.Components.yc;
public final class j extends ImageView {
    public final float f9218a;
    public final yc f9219b;

    public j(Context context) {
        super(context);
        this.f9219b = new yc(this);
        this.f9218a = 0.2f;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float a2 = this.f9219b.a(this.f9218a);
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f9219b.c(z10);
    }
}
